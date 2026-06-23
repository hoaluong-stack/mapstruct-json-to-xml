package com.example.demo.jsonmodel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class JsonOrder {
    private String orderId;
    private LocalDate orderDate;
    private String sourceSystem;
    private String salesChannel;
    private String currency;
    private String paymentMethod;
    private String couponCode;
    private BigDecimal discountAmount;
    private BigDecimal shippingFee;
    private BigDecimal taxAmount;
    private String priority;
    private String orderStatus;
    private Customer customer;
    private List<Item> items;
    private BigDecimal totalAmount;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public JsonOrder(String orderId, LocalDate orderDate, String sourceSystem, String salesChannel, String currency, String paymentMethod, String couponCode, BigDecimal discountAmount, BigDecimal shippingFee, BigDecimal taxAmount, String priority, String orderStatus, Customer customer, List<Item> items, BigDecimal totalAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.sourceSystem = sourceSystem;
        this.salesChannel = salesChannel;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
        this.couponCode = couponCode;
        this.discountAmount = discountAmount;
        this.shippingFee = shippingFee;
        this.taxAmount = taxAmount;
        this.priority = priority;
        this.orderStatus = orderStatus;
        this.customer = customer;
        this.items = items;
        this.totalAmount = totalAmount;
    }
}
