package com.luohao.gulimail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 想要远程调用其他的服务
* 1、引入opne-feign
*       <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
* 2、编写接口，告诉clude这个接口要调用远程服务
*   声明接口的每个方法都是调用哪个服务
* 3、开启远程调用功能
* */
@EnableFeignClients(basePackages = "com.luohao.gulimail.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplication.class, args);
    }

}
