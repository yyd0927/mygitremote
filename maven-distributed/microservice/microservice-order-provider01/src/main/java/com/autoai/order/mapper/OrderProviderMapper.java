package com.autoai.order.mapper;

import com.autoai.order.entity.OrderProvider;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderProviderMapper {

  /*  @Select("select * from t_order where id = #{id}") */
    OrderProvider findById(Long id);

   /*  @Select("select * from t_order")  */
    List<OrderProvider> findAll();

}
