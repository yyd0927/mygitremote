package com.autoai.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pojo.TOrderEntity;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer/order")
public class OrderConsumerController {

    // 订单服务提供者模块的 url 前缀
    private static final String ORDER_PROVIDER_URL_PREFIX = "http://localhost:8765";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public TOrderEntity getOrder(@PathVariable Long id) {

        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX + "/provider/order/get/" + id, TOrderEntity.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/get/list")
    public List<TOrderEntity> getAll() {
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX + "/provider/order/get/list", List.class);
    }

}
