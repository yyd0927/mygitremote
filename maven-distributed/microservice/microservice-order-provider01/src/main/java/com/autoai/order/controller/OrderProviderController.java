package com.autoai.order.controller;

import com.autoai.order.entity.OrderProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.autoai.order.service.OrderProviderService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provider/order")
public class OrderProviderController {

    @Autowired
    private OrderProviderService OrderProviderService;

    @GetMapping("/get/{id}")

    public OrderProvider getOrder(@PathVariable Long id) {
        return OrderProviderService.findById(id);
    }

    @GetMapping("/get/list")
    public List<OrderProvider> getAll() {
        System.out.println("收到调用请求，开始查询数据");
        return OrderProviderService.findAll();
    }

}
