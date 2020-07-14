package com.autoai.order.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderProvider {

    private Long id ;
    private String name ;
    private Double price ;
    private String dbsource ;

}

