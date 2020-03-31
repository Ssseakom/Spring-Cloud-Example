package com.project.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("order")
public class TestController {

    @Autowired
    AmqpTemplate rabbitmqTemplate;

    @RequestMapping("create")
    public String create(String message){

        //发消息减库存
        System.out.println("发送消息："+message);
        rabbitmqTemplate.convertAndSend("item",message);

        return "success";
    }

}

