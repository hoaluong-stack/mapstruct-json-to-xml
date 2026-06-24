package com.example.demo.jsonmodel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Item {
    private String sku;
    private String itemName;
    private int quantity;
    private BigDecimal unitPrice;
    private String category;
    private String brand;
    private double weightKg;
    private boolean giftWrap;
    private String warehouseCode;
    private String note;
    private String color;
    private String size;
    private String material;
    private String originCountry;
    private String barcode;
    private String serialNumber;
    private int warrantyMonths;
    private boolean fragile;
    private LocalDate expiryDate;
    private String supplierCode;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }

    public void setGiftWrap(boolean giftWrap) {
        this.giftWrap = giftWrap;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public Item(String sku, String itemName, int quantity, BigDecimal unitPrice, String category, String brand, double weightKg, boolean giftWrap, String warehouseCode, String note, String color, String size, String material, String originCountry, String barcode, String serialNumber, int warrantyMonths, boolean fragile, LocalDate expiryDate, String supplierCode) {
        this.sku = sku;
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.category = category;
        this.brand = brand;
        this.weightKg = weightKg;
        this.giftWrap = giftWrap;
        this.warehouseCode = warehouseCode;
        this.note = note;
        this.color = color;
        this.size = size;
        this.material = material;
        this.originCountry = originCountry;
        this.barcode = barcode;
        this.serialNumber = serialNumber;
        this.warrantyMonths = warrantyMonths;
        this.fragile = fragile;
        this.expiryDate = expiryDate;
        this.supplierCode = supplierCode;
    }

    public Item() {}
}
