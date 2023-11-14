package com.luohao.gulimail.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 整合mybatisplus
*    <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    *
    * 配置数据源
    *   数据库驱动
    *   配置数据源
    * 配置mybatisplus
* */
@SpringBootApplication
public class GulimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}
