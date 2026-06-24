package com.example.demo.mapper;

import com.example.demo.jsonmodel.JsonOrder;
import com.example.demo.xmlmodel.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Mapper(uses = {BuyerMapper.class, ProductMapper.class})
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "orderId", target = "orderNumber")
    @Mapping(source = "customer.customerId", target = "customerCode", qualifiedByName = "extractCustomerCode")
    @Mapping(source = "discountAmount", target = "discountAmount", qualifiedByName = "orderMoneyToString")
    @Mapping(source = "shippingFee", target = "shippingFee", qualifiedByName = "orderMoneyToString")
    @Mapping(source = "taxAmount", target = "taxAmount", qualifiedByName = "orderMoneyToString")
    @Mapping(source = "totalAmount", target = "grandTotal", qualifiedByName = "orderMoneyToString")
    @Mapping(source = "orderDate", target = "orderDate", qualifiedByName = "orderLocalDateToString")
    @Mapping(source = "sourceSystem", target = "sourceSystem", qualifiedByName = "orderUpperCase")
    @Mapping(source = "salesChannel", target = "salesChannel", qualifiedByName = "orderUpperCase")
    @Mapping(source = "currency", target = "currency", qualifiedByName = "orderUpperCase")
    @Mapping(source = "paymentMethod", target = "paymentMethod", qualifiedByName = "orderUpperCase")
    @Mapping(source = "priority", target = "priority", qualifiedByName = "orderUpperCase")
    @Mapping(source = "orderStatus", target = "orderStatus", qualifiedByName = "orderUpperCase")
    @Mapping(source = "customer", target = "buyer")
    @Mapping(source = "items", target = "product")
    Order toXmlOrder(JsonOrder jsonOrder);

    @Named("orderMoneyToString")
    default String moneyToString(BigDecimal value) {
        return value == null ? null : value.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }

    @Named("orderLocalDateToString")
    default String localDateToString(LocalDate date) {
        return date == null ? null : date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Named("orderUpperCase")
    default String upperCase(String value) {
        return value == null ? null : value.toUpperCase(Locale.ROOT);
    }

    @Named("extractCustomerCode")
    default String extractCustomerCode(String customerId) {
        if (customerId == null) {
            return null;
        }
        String digits = customerId.replaceAll("\\D", "");
        String withoutLeadingZeroes = digits.replaceFirst("^0+", "");
        return withoutLeadingZeroes.isEmpty() ? "0" : withoutLeadingZeroes;
    }
}
