package com.cs.item.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqItemConfig {

    @Bean
    public Queue directQueue(){
        return new Queue("item",false); //队列名字，是否持久化
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("direct",false,false);//交换器名称、是否持久化、是否自动删除
    }

    @Bean
    Binding binding(Queue queue, DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("direct");
    }

}
