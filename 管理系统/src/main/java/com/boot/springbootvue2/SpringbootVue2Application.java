package com.boot.springbootvue2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.boot.springbootvue2.mapper")
@SpringBootApplication
public class SpringbootVue2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootVue2Application.class, args);
    }

}
