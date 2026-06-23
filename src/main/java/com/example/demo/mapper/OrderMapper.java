package com.example.demo.mapper;

import com.example.demo.jsonmodel.JsonOrder;
import com.example.demo.xmlmodel.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order toXmlOrder(JsonOrder jsonOrder);
}
