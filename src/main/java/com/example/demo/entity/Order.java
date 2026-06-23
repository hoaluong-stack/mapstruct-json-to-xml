package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record Order(
        String orderId,
        LocalDate orderDate,
        String sourceSystem,
        String salesChannel,
        String currency,
        String paymentMethod,
        String couponCode,
        BigDecimal discountAmount,
        BigDecimal shippingFee,
        BigDecimal taxAmount,
        String priority,
        String orderStatus,
        Customer customer,
        List<Item> items,
        BigDecimal totalAmount
) {}
