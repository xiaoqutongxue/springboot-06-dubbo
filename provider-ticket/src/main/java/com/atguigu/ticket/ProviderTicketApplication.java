package com.atguigu.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 个人见解：（类似于中介的性质）服务端将服务应用注册到注册中心，消费端从注册中心取得服务应用，这个样生产端服务端就连接起来了
 *
 * 1.将服务提供者注册到注册中心去，使用dubbo。
 *      1）.引入dubbo用的starter
 *      2）.引入zookeeper的客户端工具
 *      3）.配置文件中配置有关dubbo的属性，注册中心地址等
 *      4).在TicketServiceImpl加入@Service注解，但是要注意的是要加dubbo下的@Service
 */
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}
