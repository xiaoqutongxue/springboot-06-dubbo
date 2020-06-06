package com.atguigu.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component  // 加载Spring的容器中的意思
// @EnableDubbo
@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《复仇者联盟》";
    }
}
