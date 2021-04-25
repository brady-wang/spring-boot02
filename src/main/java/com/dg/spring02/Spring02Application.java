package com.dg.spring02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dg.spring02.mapper") //扫描的mapper
public class Spring02Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring02Application.class, args);
    }

}
