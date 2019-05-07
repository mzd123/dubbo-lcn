package com.mzd.mylcnservice1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@MapperScan(basePackages = "com.mzd.mylcnservice1.dao")
@ImportResource(locations = {"classpath:dubbo.xml"})
@SpringBootApplication
public class MyLcnService1Application {

    public static void main(String[] args) {
        SpringApplication.run(MyLcnService1Application.class, args);
    }

}
