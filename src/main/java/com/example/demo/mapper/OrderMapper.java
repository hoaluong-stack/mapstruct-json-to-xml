package com.example.demo.mapper;

import com.example.demo.jsonmodel.JsonCustomer;
import com.example.demo.jsonmodel.JsonItem;
import com.example.demo.jsonmodel.JsonOrder;
import com.example.demo.xmlmodel.Order;
import com.example.demo.xmlmodel.Order.Buyer;
import com.example.demo.xmlmodel.Order.Product;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "orderId", target = "orderNumber")
    @Mapping(source = "orderDate", target = "orderDate", qualifiedByName = "formatDate")
    @Mapping(source = "sourceSystem", target = "sourceSystem", qualifiedByName = "toUpperCase")
    @Mapping(source = "salesChannel", target = "salesChannel", qualifiedByName = "toUpperCase")
    @Mapping(source = "currency", target = "currency", qualifiedByName = "toUpperCase")
    @Mapping(source = "paymentMethod", target = "paymentMethod", qualifiedByName = "toUpperCase")
    @Mapping(source = "couponCode", target = "couponCode")
    @Mapping(source = "discountAmount", target = "discountAmount", qualifiedByName = "formatMoney")
    @Mapping(source = "shippingFee", target = "shippingFee", qualifiedByName = "formatMoney")
    @Mapping(source = "taxAmount", target = "taxAmount", qualifiedByName = "formatMoney")
    @Mapping(source = "priority", target = "priority", qualifiedByName = "toUpperCase")
    @Mapping(source = "orderStatus", target = "orderStatus", qualifiedByName = "toUpperCase")
    @Mapping(source = "customer.customerId", target = "customerCode", qualifiedByName = "extractCustomerCode")
    @Mapping(source = "customer", target = "buyer")
    @Mapping(source = "items", target = "product")
    @Mapping(source = "totalAmount", target = "grandTotal", qualifiedByName = "formatMoney")
    Order toXmlOrder(JsonOrder jsonOrder);

    @Mapping(source = "address", target = "shippingAddress")
    @Mapping(source = "loyaltyLevel", target = "memberTier", qualifiedByName = "toUpperCase")
    @Mapping(source = "birthDate", target = "birthDate", qualifiedByName = "formatDate")
    @Mapping(source = "gender", target = "gender", qualifiedByName = "toUpperCase")
    @Mapping(source = "companyName", target = "companyName")
    @Mapping(source = "taxNumber", target = "taxNumber")
    @Mapping(source = "countryCode", target = "countryCode", qualifiedByName = "toUpperCase")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "postalCode", target = "postalCode")
    @Mapping(source = "marketingOptIn", target = "marketingOptIn")
    @Mapping(source = "loyaltyPoints", target = "loyaltyPoints")
    @Mapping(source = "vipSince", target = "vipSince", qualifiedByName = "formatDate")
    Buyer toXmlBuyer(JsonCustomer customer);

    @AfterMapping
    default void mapCustomerDetails(JsonCustomer customer, @MappingTarget Buyer buyer) {
        if (customer != null) {
            String firstName = customer.getFirstName();
            String lastName = customer.getLastName();
            if (firstName != null && lastName != null) {
                buyer.setFullName(firstName + " " + lastName);
            } else if (firstName != null) {
                buyer.setFullName(firstName);
            } else if (lastName != null) {
                buyer.setFullName(lastName);
            }

            String email = customer.getEmail();
            String phone = customer.getPhone();
            if (email != null && phone != null) {
                buyer.setContact(email + " | " + phone);
            } else if (email != null) {
                buyer.setContact(email);
            } else if (phone != null) {
                buyer.setContact(phone);
            }
        }
    }

    @Mapping(source = "sku", target = "code")
    @Mapping(source = "quantity", target = "qty")
    @Mapping(source = "unitPrice", target = "unitPrice", qualifiedByName = "formatMoney")
    @Mapping(source = "category", target = "type", qualifiedByName = "toUpperCase")
    @Mapping(source = "brand", target = "maker")
    @Mapping(source = "weightKg", target = "weight", qualifiedByName = "formatWeight")
    @Mapping(source = "giftWrap", target = "wrapped")
    @Mapping(source = "warehouseCode", target = "warehouse")
    @Mapping(source = "note", target = "deliveryNote", qualifiedByName = "shortenText")
    @Mapping(source = "color", target = "color", qualifiedByName = "toUpperCase")
    @Mapping(source = "size", target = "size")
    @Mapping(source = "material", target = "material")
    @Mapping(source = "originCountry", target = "originCountry", qualifiedByName = "toUpperCase")
    @Mapping(source = "barcode", target = "barcode")
    @Mapping(source = "serialNumber", target = "serialNumber")
    @Mapping(source = "warrantyMonths", target = "warrantyMonths")
    @Mapping(source = "fragile", target = "fragile")
    @Mapping(source = "expiryDate", target = "expiryDate", qualifiedByName = "formatDate")
    @Mapping(source = "supplierCode", target = "supplierCode")
    Product toXmlProduct(JsonItem item);

    @AfterMapping
    default void mapProductDetails(JsonItem item, @MappingTarget Product product) {
        if (item != null) {
            String sku = item.getSku();
            String itemName = item.getItemName();
            if (sku != null && itemName != null) {
                product.setLabel(sku + " - " + itemName);
            } else if (sku != null) {
                product.setLabel(sku);
            } else if (itemName != null) {
                product.setLabel(itemName);
            }

            if (item.getQuantity() != null && item.getUnitPrice() != null) {
                BigDecimal qty = new BigDecimal(item.getQuantity());
                BigDecimal unitPrice = item.getUnitPrice();
                BigDecimal lineTotal = qty.multiply(unitPrice);
                product.setLineTotal(String.format("%.2f", lineTotal));
            }
        }
    }

    @Named("formatDate")
    default String formatDate(String date) {
        if (date == null) return null;
        try {
            LocalDate parsed = LocalDate.parse(date);
            return parsed.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception e) {
            return date;
        }
    }

    @Named("toUpperCase")
    default String toUpperCase(String value) {
        if (value == null) return null;
        return value.toUpperCase();
    }

    @Named("formatMoney")
    default String formatMoney(BigDecimal amount) {
        if (amount == null) return null;
        return String.format("%.2f", amount);
    }

    @Named("formatWeight")
    default String formatWeight(BigDecimal weightKg) {
        if (weightKg == null) return null;
        return String.format("%.2f kg", weightKg);
    }

    @Named("extractCustomerCode")
    default String extractCustomerCode(String customerId) {
        if (customerId == null) return null;
        String[] parts = customerId.split("-");
        if (parts.length > 0) {
            String code = parts[parts.length - 1];
            // Convert to long to strip leading zeros, then back to string
            try {
                return String.valueOf(Long.parseLong(code));
            } catch (NumberFormatException e) {
                return code;
            }
        }
        return customerId;
    }

    @Named("shortenText")
    default String shortenText(String text) {
        if (text == null) return null;
        int maxLength = 32;
        if (text.length() > maxLength) {
            return text.substring(0, maxLength - 3) + "...";
        }
        return text;
    }

    List<Product> mapProductList(List<JsonItem> items);
}
