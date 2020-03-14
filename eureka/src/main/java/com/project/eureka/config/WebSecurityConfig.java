package com.project.eureka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 引用官方：
     * 导入 spring-boot-starter-security 就可以自动开启对Eureka Server的保护
     *  Spring Security开启后，会将每次请求都发送有效的CSRF令牌
     *  Eureka Client不会伪造CSRF令牌，所以需要为 /eureka/** 禁用此要求
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); // 关闭csrf
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}
