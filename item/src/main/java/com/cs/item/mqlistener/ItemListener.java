package com.cs.item.mqlistener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ItemListener {

    @RabbitListener(queues = "item")
    public void itemHandle(String message){
        System.out.println("接收消息："+message);
    }
}
