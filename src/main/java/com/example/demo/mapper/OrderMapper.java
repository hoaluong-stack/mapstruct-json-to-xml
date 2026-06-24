package com.example.demo.mapper;

import com.example.demo.jsonmodel.JsonCustomer;
import com.example.demo.jsonmodel.JsonItem;
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

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    DateTimeFormatter INPUT_DATE = DateTimeFormatter.ISO_LOCAL_DATE;
    DateTimeFormatter OUTPUT_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Mapping(target = "orderNumber", source = "orderId")
    @Mapping(target = "customerCode", source = "customer.customerId", qualifiedByName = "customerCode")
    @Mapping(target = "orderDate", source = "orderDate", qualifiedByName = "formatDate")
    @Mapping(target = "sourceSystem", source = "sourceSystem", qualifiedByName = "upper")
    @Mapping(target = "salesChannel", source = "salesChannel", qualifiedByName = "upper")
    @Mapping(target = "currency", source = "currency", qualifiedByName = "upper")
    @Mapping(target = "paymentMethod", source = "paymentMethod", qualifiedByName = "upper")
    @Mapping(target = "discountAmount", source = "discountAmount", qualifiedByName = "money")
    @Mapping(target = "shippingFee", source = "shippingFee", qualifiedByName = "money")
    @Mapping(target = "taxAmount", source = "taxAmount", qualifiedByName = "money")
    @Mapping(target = "priority", source = "priority", qualifiedByName = "upper")
    @Mapping(target = "orderStatus", source = "orderStatus", qualifiedByName = "upper")
    @Mapping(target = "buyer", source = "customer")
    @Mapping(target = "product", source = "items")
    @Mapping(target = "grandTotal", source = "totalAmount", qualifiedByName = "money")
    Order toXmlOrder(JsonOrder jsonOrder);

    @Mapping(target = "fullName", expression = "java(fullName(customer))")
    @Mapping(target = "contact", expression = "java(contact(customer))")
    @Mapping(target = "shippingAddress", source = "address")
    @Mapping(target = "memberTier", source = "loyaltyLevel", qualifiedByName = "upper")
    @Mapping(target = "birthDate", source = "birthDate", qualifiedByName = "formatDate")
    @Mapping(target = "gender", source = "gender", qualifiedByName = "upper")
    @Mapping(target = "countryCode", source = "countryCode", qualifiedByName = "upper")
    @Mapping(target = "vipSince", source = "vipSince", qualifiedByName = "formatDate")
    Order.Buyer toBuyer(JsonCustomer customer);

    @Mapping(target = "code", source = "sku")
    @Mapping(target = "label", expression = "java(label(item))")
    @Mapping(target = "qty", source = "quantity")
    @Mapping(target = "unitPrice", source = "unitPrice", qualifiedByName = "money")
    @Mapping(target = "lineTotal", expression = "java(lineTotal(item))")
    @Mapping(target = "type", source = "category", qualifiedByName = "upper")
    @Mapping(target = "maker", source = "brand")
    @Mapping(target = "weight", source = "weightKg", qualifiedByName = "weight")
    @Mapping(target = "wrapped", source = "giftWrap")
    @Mapping(target = "warehouse", source = "warehouseCode")
    @Mapping(target = "deliveryNote", source = "note", qualifiedByName = "shortNote")
    @Mapping(target = "color", source = "color", qualifiedByName = "upper")
    @Mapping(target = "originCountry", source = "originCountry", qualifiedByName = "upper")
    @Mapping(target = "expiryDate", source = "expiryDate", qualifiedByName = "formatDate")
    Order.Product toProduct(JsonItem item);

    @Named("upper")
    default String upper(String value) {
        return value == null ? null : value.toUpperCase(Locale.ROOT);
    }

    @Named("formatDate")
    default String formatDate(String value) {
        return value == null ? null : LocalDate.parse(value, INPUT_DATE).format(OUTPUT_DATE);
    }

    @Named("money")
    default String money(BigDecimal value) {
        return value == null ? null : value.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }

    @Named("weight")
    default String weight(BigDecimal value) {
        return value == null ? null : money(value) + " kg";
    }

    @Named("customerCode")
    default String customerCode(String customerId) {
        if (customerId == null) {
            return null;
        }
        String digits = customerId.replaceAll("\\D", "");
        String withoutLeadingZeros = digits.replaceFirst("^0+", "");
        return withoutLeadingZeros.isEmpty() ? "0" : withoutLeadingZeros;
    }

    @Named("shortNote")
    default String shortNote(String note) {
        if (note == null || note.length() <= 29) {
            return note;
        }
        return note.substring(0, 29) + "...";
    }

    default String fullName(JsonCustomer customer) {
        return customer.getFirstName() + " " + customer.getLastName();
    }

    default String contact(JsonCustomer customer) {
        return customer.getEmail() + " | " + customer.getPhone();
    }

    default String label(JsonItem item) {
        return item.getSku() + " - " + item.getItemName();
    }

    default String lineTotal(JsonItem item) {
        return money(item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())));
    }
}
