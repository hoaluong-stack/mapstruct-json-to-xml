package com.example.demo.mapper;

import com.example.demo.jsonmodel.Item;
import com.example.demo.xmlmodel.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "code", source = "sku")
    @Mapping(target = "label", expression = "java(toLabel(jsonItem))")
    @Mapping(target = "qty", source = "quantity")
    @Mapping(target = "unitPrice", source = "unitPrice", qualifiedByName = "moneyToString")
    @Mapping(target = "type", source = "category", qualifiedByName = "productUpperCase")
    @Mapping(target = "maker", source = "brand")
    @Mapping(target = "weight", source = "weightKg", qualifiedByName = "weightToString")
    @Mapping(target = "wrapped", source = "giftWrap")
    @Mapping(target = "warehouse", source = "warehouseCode")
    @Mapping(target = "deliveryNote", source = "note", qualifiedByName = "deliveryNote")
    @Mapping(target = "color", source = "color", qualifiedByName = "productUpperCase")
    @Mapping(target = "originCountry", source = "originCountry", qualifiedByName = "productUpperCase")
    @Mapping(target = "expiryDate", source = "expiryDate", qualifiedByName = "localDateToString")
    @Mapping(target = "lineTotal", expression = "java(lineTotal(jsonItem))")
    Product toProduct(Item jsonItem);

    @Named("moneyToString")
    default String moneyToString(BigDecimal value) {
        return value == null ? null : value.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }

    @Named("localDateToString")
    default String localDateToString(LocalDate date) {
        return date == null ? null : date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Named("productUpperCase")
    default String upperCase(String value) {
        return value == null ? null : value.toUpperCase(Locale.ROOT);
    }

    @Named("weightToString")
    default String weightToString(double value) {
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).toPlainString() + " kg";
    }

    @Named("deliveryNote")
    default String deliveryNote(String note) {
        if (note == null || note.length() <= 29) {
            return note;
        }
        return note.substring(0, 29) + "...";
    }

    default String toLabel(Item item) {
        if (item == null) {
            return null;
        }
        if (item.getSku() == null || item.getSku().isBlank()) {
            return item.getItemName();
        }
        if (item.getItemName() == null || item.getItemName().isBlank()) {
            return item.getSku();
        }
        return item.getSku() + " - " + item.getItemName();
    }

    default String lineTotal(Item item) {
        if (item == null || item.getUnitPrice() == null) {
            return null;
        }
        return moneyToString(item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())));
    }
}
