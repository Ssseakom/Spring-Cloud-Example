package com.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("product")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("test")
    public Map<String,Object> test(){
        Map<String,Object> map = new HashMap<>();
        map.put("service-port",port);
        map.put("service-name","product-service");
        return map;
    }
}
