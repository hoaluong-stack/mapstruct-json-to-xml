package com.example.demo.jsonmodel;

import java.time.LocalDate;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String loyaltyLevel;
    private LocalDate birthDate;
    private String gender;
    private String companyName;
    private String taxNumber;
    private String countryCode;
    private String city;
    private String postalCode;
    private boolean marketingOptIn;
    private int loyaltyPoints;
    private LocalDate vipSince;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoyaltyLevel() {
        return loyaltyLevel;
    }

    public void setLoyaltyLevel(String loyaltyLevel) {
        this.loyaltyLevel = loyaltyLevel;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    public void setMarketingOptIn(boolean marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public LocalDate getVipSince() {
        return vipSince;
    }

    public void setVipSince(LocalDate vipSince) {
        this.vipSince = vipSince;
    }

    public Customer(String customerId, String firstName, String lastName, String email, String phone, String address, String loyaltyLevel, LocalDate birthDate, String gender, String companyName, String taxNumber, String countryCode, String city, String postalCode, boolean marketingOptIn, int loyaltyPoints, LocalDate vipSince) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.loyaltyLevel = loyaltyLevel;
        this.birthDate = birthDate;
        this.gender = gender;
        this.companyName = companyName;
        this.taxNumber = taxNumber;
        this.countryCode = countryCode;
        this.city = city;
        this.postalCode = postalCode;
        this.marketingOptIn = marketingOptIn;
        this.loyaltyPoints = loyaltyPoints;
        this.vipSince = vipSince;
    }

    public Customer() {}
}
