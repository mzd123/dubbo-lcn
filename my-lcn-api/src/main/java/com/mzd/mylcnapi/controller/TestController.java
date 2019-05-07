package com.mzd.mylcnapi.controller;

import com.mzd.mylcnservice1iface.service.TestService1;
import com.mzd.mylcnservice2iface.service.TestService2;
import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestService1 testService1;
    @Resource
    private TestService2 testService2;

    @GetMapping("test.do")
    public String doTest() {
        return "successs";
    }

    @GetMapping("order.do")
    public String order() {
        testService1.order(1);
        return "successs";
    }

    @GetMapping("test2.do")
    public void test2() {
        testService2.inventory(1);
    }
}
