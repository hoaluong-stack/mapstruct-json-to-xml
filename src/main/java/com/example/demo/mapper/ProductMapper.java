package com.example.demo.mapper;

import com.example.demo.jsonmodel.Item;
import com.example.demo.xmlmodel.Product;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "code", source = "sku")
    @Mapping(target = "label", source = "itemName")
    @Mapping(target = "qty", source = "quantity")
    @Mapping(target = "unitPrice", source = "unitPrice", qualifiedByName = "objectToString")
    @Mapping(target = "type", source = "category")
    @Mapping(target = "maker", source = "brand")
    @Mapping(target = "weight", source = "weightKg", qualifiedByName = "objectToString")
    @Mapping(target = "wrapped", source = "giftWrap")
    @Mapping(target = "warehouse", source = "warehouseCode")
    @Mapping(target = "deliveryNote", source = "note")
    @Mapping(target = "expiryDate", source = "expiryDate", qualifiedByName = "localDateToString")
    @Mapping(target = "lineTotal", ignore = true)
    Product toProduct(Item jsonItem);

    @Named("objectToString")
    default String objectToString(Object value) {
        return value == null ? null : String.valueOf(value);
    }
}
