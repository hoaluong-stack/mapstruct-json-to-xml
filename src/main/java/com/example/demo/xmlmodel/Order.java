package com.example.demo.xmlmodel;

import com.example.demo.jsonmodel.Customer;
import com.example.demo.jsonmodel.Item;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private String orderNumber;
    private String customerCode;
    private String orderDate;
    private String sourceSystem;
    private String salesChannel;
    private String currency;
    private String paymentMethod;
    private String couponCode;
    private String discountAmount;
    private String shippingFee;
    private String taxAmount;
    private String priority;
    private String orderStatus;
    public Buyer buyer;
    public List<Product> product;
    private String grandTotal;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
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

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(String shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
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

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public String getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Order(String orderNumber, String customerCode, String orderDate, String sourceSystem, String salesChannel, String currency, String paymentMethod, String couponCode, String discountAmount, String shippingFee, String taxAmount, String priority, String orderStatus, Buyer buyer, List<Product> product, String grandTotal) {
        this.orderNumber = orderNumber;
        this.customerCode = customerCode;
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
        this.buyer = buyer;
        this.product = product;
        this.grandTotal = grandTotal;
    }
}
