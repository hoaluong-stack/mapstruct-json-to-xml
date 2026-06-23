package com.example.demo.mapper;

import com.example.demo.jsonmodel.JsonOrder;
import com.example.demo.xmlmodel.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import org.mapstruct.factory.Mappers;

@Mapper(uses = {BuyerMapper.class, ProductMapper.class})
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "orderId", target = "orderNumber")
    @Mapping(source = "discountAmount", target = "discountAmount", qualifiedByName = "objectToString")
    @Mapping(source = "shippingFee", target = "shippingFee", qualifiedByName = "objectToString")
    @Mapping(source = "taxAmount", target = "taxAmount", qualifiedByName = "objectToString")
    @Mapping(source = "totalAmount", target = "grandTotal", qualifiedByName = "objectToString")
    @Mapping(source = "orderDate", target = "orderDate", qualifiedByName = "localDateToString")
    @Mapping(source = "customer", target = "buyer")
    @Mapping(source = "items", target = "product")
    Order toXmlOrder(JsonOrder jsonOrder);
}
