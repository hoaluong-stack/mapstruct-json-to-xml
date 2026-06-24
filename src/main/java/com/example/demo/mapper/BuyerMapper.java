package com.example.demo.mapper;

import com.example.demo.jsonmodel.Customer;
import com.example.demo.xmlmodel.Buyer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Mapper
public interface BuyerMapper {
    BuyerMapper INSTANCE = Mappers.getMapper(BuyerMapper.class);

    @Mapping(
            target = "fullName",
            expression = "java(combineNames(jsonCustomer))"
    )
    @Mapping(target = "contact", expression = "java(combineContact(jsonCustomer))")
    @Mapping(target = "shippingAddress", source = "address")
    @Mapping(target = "memberTier", source = "loyaltyLevel", qualifiedByName = "buyerUpperCase")
    @Mapping(target = "birthDate", source = "birthDate", qualifiedByName = "buyerLocalDateToString")
    @Mapping(target = "vipSince", source = "vipSince", qualifiedByName = "buyerLocalDateToString")
    @Mapping(target = "gender", source = "gender", qualifiedByName = "buyerUpperCase")
    @Mapping(target = "countryCode", source = "countryCode", qualifiedByName = "buyerUpperCase")
    @Mapping(target = "customerCode", ignore = true)
    Buyer toBuyer(Customer jsonCustomer);

    @Named("buyerLocalDateToString")
    default String localDateToString(LocalDate date) {
        return date == null ? null : date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Named("buyerUpperCase")
    default String upperCase(String value) {
        return value == null ? null : value.toUpperCase(Locale.ROOT);
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

    default String combineContact(Customer customer) {
        if (customer == null) {
            return null;
        }
        String email = customer.getEmail() != null ? customer.getEmail().trim() : "";
        String phone = customer.getPhone() != null ? customer.getPhone().trim() : "";
        if (email.isEmpty()) {
            return phone.isEmpty() ? null : phone;
        }
        if (phone.isEmpty()) {
            return email;
        }
        return email + " | " + phone;
    }

}
