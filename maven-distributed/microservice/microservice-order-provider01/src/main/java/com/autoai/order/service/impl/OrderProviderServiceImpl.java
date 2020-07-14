package com.autoai.order.service.impl;

import com.autoai.order.entity.OrderProvider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.autoai.order.service.OrderProviderService;
import com.autoai.order.mapper.OrderProviderMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderProviderServiceImpl implements OrderProviderService {


    @Autowired
    private OrderProviderMapper OrderMapper;

    @Override
    public OrderProvider findById(Long id){
     return  OrderMapper.findById(id) ;
    }

    @Override
    public  List<OrderProvider> findAll(){

        List<OrderProvider>  list = new ArrayList<OrderProvider>() ;
        list = OrderMapper.findAll() ;
        System.out.println("从数据库查出来的数据："+list);

        return   list  ;
    }

}
