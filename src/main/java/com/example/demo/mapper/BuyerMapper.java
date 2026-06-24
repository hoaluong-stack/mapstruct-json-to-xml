package com.example.demo.mapper;

import com.example.demo.jsonmodel.Customer;
import com.example.demo.xmlmodel.Buyer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Mapper
public interface BuyerMapper {
    BuyerMapper INSTANCE = Mappers.getMapper(BuyerMapper.class);

    @Mapping(
            target = "fullName",
            expression = "java(combineNames(jsonCustomer))"
    )
    @Mapping(target = "customerCode", source ="customerId")
    @Mapping(target = "contact", source = "email")
    @Mapping(target = "shippingAddress", source = "address")
    @Mapping(target = "memberTier", source = "loyaltyLevel")
    @Mapping(target = "birthDate", source = "birthDate", qualifiedByName = "buyerLocalDateToString")
    @Mapping(target = "vipSince", source = "vipSince", qualifiedByName = "buyerLocalDateToString")
    Buyer toBuyer(Customer jsonCustomer);

    @Named("buyerLocalDateToString")
    default String localDateToString(LocalDate date) {
        return date == null ? null : date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @Named("combineNames")
    default String combineNames(Customer customer) {
        if (customer == null) return null;
        String first = customer.getFirstName() != null ? customer.getFirstName().trim() : "";
        String last = customer.getLastName() != null ? customer.getLastName().trim() : "";
        if (first.isEmpty()) return last;
        if (last.isEmpty()) return first;
        return first + " " + last;
    }

}
