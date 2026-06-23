package com.example.demo.entity;

import java.time.LocalDate;

public record Customer(
        String customerId,
        String firstName,
        String lastName,
        String email,
        String phone,
        String address,
        String loyaltyLevel,
        LocalDate birthDate,
        String gender,
        String companyName,
        String taxNumber,
        String countryCode,
        String city,
        String postalCode,
        boolean marketingOptIn,
        int loyaltyPoints,
        LocalDate vipSince
) {}
