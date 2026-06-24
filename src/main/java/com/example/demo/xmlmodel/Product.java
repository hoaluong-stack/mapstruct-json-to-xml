package com.example.demo.xmlmodel;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "code",
        "label",
        "qty",
        "unitPrice",
        "lineTotal",
        "type",
        "maker",
        "weight",
        "wrapped",
        "warehouse",
        "deliveryNote",
        "color",
        "size",
        "material",
        "originCountry",
        "barcode",
        "serialNumber",
        "warrantyMonths",
        "fragile",
        "expiryDate",
        "supplierCode"
})
public class Product {
    @XmlElement(name = "Code")
    private String code;
    @XmlElement(name = "Label")
    private String label;
    @XmlElement(name = "Qty")
    private int qty;
    @XmlElement(name = "UnitPrice")
    private String unitPrice;
    @XmlElement(name = "LineTotal")
    private String lineTotal;
    @XmlElement(name = "Type")
    private String type;
    @XmlElement(name = "Maker")
    private String maker;
    @XmlElement(name = "Weight")
    private String weight;
    @XmlElement(name = "Wrapped")
    private boolean wrapped;
    @XmlElement(name = "Warehouse")
    private String warehouse;
    @XmlElement(name = "DeliveryNote")
    private String deliveryNote;
    @XmlElement(name = "Color")
    private String color;
    @XmlElement(name = "Size")
    private String size;
    @XmlElement(name = "Material")
    private String material;
    @XmlElement(name = "OriginCountry")
    private String originCountry;
    @XmlElement(name = "Barcode")
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

    @XmlElement(name = "SerialNumber")
    private String serialNumber;

    @XmlElement(name = "WarrantyMonths")
    private int warrantyMonths;
    @XmlElement(name = "Fragile")
    private boolean fragile;
    @XmlElement(name = "ExpiryDate")
    private String expiryDate;
    @XmlElement(name = "SupplierCode")
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
