package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Item(
        String sku,
        String itemName,
        int quantity,
        BigDecimal unitPrice,
        String category,
        String brand,
        double weightKg,
        boolean giftWrap,
        String warehouseCode,
        String note,
        String color,
        String size,
        String material,
        String originCountry,
        String barcode,
        String serialNumber,
        int warrantyMonths,
        boolean fragile,
        LocalDate expiryDate,
        String supplierCode
) {}
