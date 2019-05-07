package com.mzd.mylcnservice1.dao;

import org.apache.ibatis.annotations.Param;

public interface TestDao1 {
    //下单
    void addorder(@Param("id") String id, @Param("i") int i, @Param("username") String ccc);

    //审核
    void doAudit(@Param("id") String id, @Param("desc") String desc);
}
