package com.atguigu.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // 获取发布的远程服务
    // @Reference注意的是导入的包一定是有关于dubbo的包
    @Reference
    TicketService ticketService;

    public void hello(){
        // CTRL+ALT+V 自动补全代码
        String ticket = ticketService.getTicket();
        System.out.println("买到票了:" + ticket);
    }
}
