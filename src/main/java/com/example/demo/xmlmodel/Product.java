package com.example.demo.xmlmodel;

public class Product {
    private String code;
    private String label;
    private int qty;
    private String unitPrice;
    private String lineTotal;
    private String type;
    private String maker;
    private String weight;
    private boolean wrapped;
    private String warehouse;
    private String deliveryNote;
    private String color;
    private String size;
    private String material;
    private String originCountry;
    private String barcode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(String lineTotal) {
        this.lineTotal = lineTotal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public boolean isWrapped() {
        return wrapped;
    }

    public void setWrapped(boolean wrapped) {
        this.wrapped = wrapped;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getDeliveryNote() {
        return deliveryNote;
    }

    public void setDeliveryNote(String deliveryNote) {
        this.deliveryNote = deliveryNote;
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

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    private String serialNumber;

    private int warrantyMonths;
    private boolean fragile;
    private String expiryDate;
    private String supplierCode;

    public Product(String code, String label, int qty, String unitPrice, String lineTotal, String type, String maker, String weight, boolean wrapped, String warehouse, String deliveryNote, String color, String size, String material, String originCountry, String barcode, String serialNumber, int warrantyMonths, boolean fragile, String expiryDate, String supplierCode) {
        this.code = code;
        this.label = label;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.lineTotal = lineTotal;
        this.type = type;
        this.maker = maker;
        this.weight = weight;
        this.wrapped = wrapped;
        this.warehouse = warehouse;
        this.deliveryNote = deliveryNote;
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

    public Product() {
    }

}
