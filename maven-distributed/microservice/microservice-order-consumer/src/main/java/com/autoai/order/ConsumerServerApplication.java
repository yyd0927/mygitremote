package com.autoai.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration()
@ComponentScan(basePackages = {"com.autoai.*"})
public class ConsumerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServerApplication.class, args) ;
        System.out.println("消費者服務启动成功!!");
    }

}
