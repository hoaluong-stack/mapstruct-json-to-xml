package com.example.demo.xmlmodel;

public class Buyer {
    private String customerCode;
    private String fullName;
    private String contact;
    private String shippingAddress;
    private String memberTier;
    private String birthDate;
    private String gender;
    private String companyName;
    private String taxNumber;
    private String countryCode;
    private String city;
    private String postalCode;
    private boolean marketingOptIn;
    private int loyaltyPoints;
    private String vipSince;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getMemberTier() {
        return memberTier;
    }

    public void setMemberTier(String memberTier) {
        this.memberTier = memberTier;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
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

    public String getVipSince() {
        return vipSince;
    }

    public void setVipSince(String vipSince) {
        this.vipSince = vipSince;
    }

    public Buyer(String customerCode, String fullName, String contact, String shippingAddress, String memberTier, String birthDate, String gender, String companyName, String taxNumber, String countryCode, String city, String postalCode, boolean marketingOptIn, int loyaltyPoints, String vipSince) {
        this.customerCode = customerCode;
        this.fullName = fullName;
        this.contact = contact;
        this.shippingAddress = shippingAddress;
        this.memberTier = memberTier;
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

    public Buyer() {
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
}
