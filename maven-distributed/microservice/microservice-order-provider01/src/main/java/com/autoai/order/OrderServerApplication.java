package com.autoai.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.autoai.order.mapper")
@EnableAutoConfiguration()
@ComponentScan(basePackages = {"com.autoai.*"})
public class OrderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class, args) ;
        System.out.println("提供者服務启动成功!!");
    }

}
// 后台访问接口地址 http://localhost:8765/microservice/provider/order/get/list