package com.mzd.mylcnservice1.service;

import com.codingapi.tx.annotation.TxTransaction;
import com.mzd.mylcnservice1.dao.TestDao1;
import com.mzd.mylcnservice1iface.service.TestService1;
import com.mzd.mylcnservice2iface.service.TestService2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;

@Service("testService1")
public class TestService1Impl implements TestService1 {
    @Resource
    private TestDao1 testDao1;
    @Resource
    private TestService2 testService2;

    @Override
    @TxTransaction(isStart = true)
    @Transactional(rollbackFor = RuntimeException.class)
    public void order(int i) {
        //减库存
        testService2.inventory(i);
        int aa = 1 / 0;
        //插入订单
        testDao1.addorder(UUID.randomUUID().toString().replace("-", ""), i, "ccc");
    }

    @Override
    @TxTransaction(isStart = true)
    @Transactional(rollbackFor = RuntimeException.class)
    public void doAudit(String aa) {
        testDao1.doAudit(UUID.randomUUID().toString().replace("-", ""), aa);
    }
}
