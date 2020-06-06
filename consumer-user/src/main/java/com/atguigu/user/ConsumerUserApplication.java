package com.atguigu.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用注册中心的服务
 *      1）.引入dubbo用的starter
 *      2）.引入zookeeper的客户端工具
 *      3）.引用服务
 */

@SpringBootApplication
public class ConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class, args);
    }

}
