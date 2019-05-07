package com.mzd.mylcnservice2.service;

import com.codingapi.tx.annotation.TxTransaction;
import com.mzd.mylcnservice1iface.service.TestService1;
import com.mzd.mylcnservice2.dao.TestDao2;
import com.mzd.mylcnservice2iface.service.TestService2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("testService2")
@Transactional(rollbackFor = RuntimeException.class)
public class TestService2Impl implements TestService2 {
    @Resource
    private TestService1 testService1;
    @Resource
    private TestDao2 testDao2;

    @Override
    @TxTransaction
    public void inventory(int i) {
        //插入审核记录
        testService1.doAudit("aa");
        //减少库存
        testDao2.inventory(i);
    }
}
