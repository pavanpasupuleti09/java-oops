package com.java.smartlease;

public class PropertyTest {

    public static void main(String[] args) {

        RentalProperty property = new RentalProperty(
                "P101",
                "Green Residency",
                "Hyderabad",
                18000,
                true,
                12
        );

        System.out.println(property);

        System.out.println("Annual Rent : ₹" +
                property.calculateAnnualRent());
    }
}