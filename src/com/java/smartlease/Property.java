package com.java.smartlease;

public class Property {

    private String propertyId;
    private String propertyName;
    private String address;
    private double monthlyRent;
    private boolean available;

    // Default Constructor
    public Property() {
    }

    // Parameterized Constructor
    public Property(String propertyId, String propertyName, String address,
                    double monthlyRent, boolean available) {
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.address = address;
        this.monthlyRent = monthlyRent;
        this.available = available;
    }

    // Getters and Setters

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyId='" + propertyId + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", address='" + address + '\'' +
                ", monthlyRent=" + monthlyRent +
                ", available=" + available +
                '}';
    }
}