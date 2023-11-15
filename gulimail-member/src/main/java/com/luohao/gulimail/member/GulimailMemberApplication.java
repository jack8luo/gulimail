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
/*
* 使用nacos作为远程配置中心
* 1、引入依赖
*
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.webjars/bootstrap -->
        <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-bootstrap -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-bootstrap</artifactId>
            <version>4.0.0</version>
        </dependency>
* 2、创建bootstrap.properties
*   spring.application.name=gulimail-member
    spring.cloud.nacos.config.server-addr=127.0.0.1:8848
* 3、在配置中心添加数据集（Data id）gulimail-member.properties。
* 4、给gulimail-member.properties添加配置
* 5、使用@RefreshScope 动态获取刷新配置
*  @Value("${member.user.name}") 获取配置
*  tip：配置中心优先级最高
*
* 细节：
* 1、命名空间
* 默认：public；
* 在开发、测试、生产阶段使用命名空间做环境隔离
* 注意在bootstrap.properties表示使用哪个命名空间的配置
* spring.cloud.nacos.config.namespace=101655dc-8f28-4e97-a30d-3ca8ffab8f6c
* 还有一种是每个微服务创建一个命名空间
* 2、配置集：所有配置的集合
* 3、配置集ID：类似文件名
* 4、配置分组
* 默认配置是默认分组
* bootstrap.properties中spring.cloud.nacos.config.group=1111
*
* 本项目使用每个微服务都有自己的命名空间，使用分组区分环境 dev 、test、prod
*
* 3、同时加载多个配置文件
* 1、微服务中任何配置信息，任何配置文件都可以放在配置中心中
* 2、只需要在bootstrap.properties中说明加载配置中心哪些配置即可
* 3、@value。。。
* 以前sb可以从配置文件中取值，都能使用
*
* */
@EnableFeignClients(basePackages = "com.luohao.gulimail.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplication.class, args);
    }

}
