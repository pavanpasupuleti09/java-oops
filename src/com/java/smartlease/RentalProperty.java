package com.java.smartlease;

public class RentalProperty extends Property {

    private int leaseDurationMonths;

    // Default Constructor
    public RentalProperty() {
    }

    // Parameterized Constructor
    public RentalProperty(String propertyId,
                          String propertyName,
                          String address,
                          double monthlyRent,
                          boolean available,
                          int leaseDurationMonths) {

        super(propertyId, propertyName, address, monthlyRent, available);
        this.leaseDurationMonths = leaseDurationMonths;
    }

    public int getLeaseDurationMonths() {
        return leaseDurationMonths;
    }

    public void setLeaseDurationMonths(int leaseDurationMonths) {
        this.leaseDurationMonths = leaseDurationMonths;
    }

    public double calculateAnnualRent() {
        return getMonthlyRent() * 12;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", leaseDurationMonths=" + leaseDurationMonths;
    }
}