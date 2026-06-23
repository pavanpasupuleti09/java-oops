package com.java.statics;

public class Main {
    public static void main(String[] args) {



       Product product1 = new Product(1,"iphone 14", 455555, 4.5F, "apple", "mobile");

        Product product2 = new Product(2, "Iphone 15", 566666, 4.6F, "apple", "mobiles");
        System.out.println("_____");
        product1.displayProductDetails();
        Product.displayVendorDetails();
        System.out.println("_____");
        product2.displayProductDetails();
        Product.displayVendorDetails();




    }
}
