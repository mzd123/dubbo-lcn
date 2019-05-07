package com.mzd.mylcnapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo.xml"})
public class MyLcnApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyLcnApiApplication.class, args);
    }

}
