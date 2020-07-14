package com.autoai.order.service;

import com.autoai.order.entity.OrderProvider;

import java.util.List;

public interface OrderProviderService {

    OrderProvider findById(Long id);

    List<OrderProvider> findAll();

}
