package com.cs.item.controller;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    @RequestMapping("/addItem")
    public String addItem(){

        return "123";
    }

}
