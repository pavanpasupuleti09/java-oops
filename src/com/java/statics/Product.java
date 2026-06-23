package com.java.statics;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    String company;
    String category;

    final static String VENDOR_NAME="Apple";
    final static String VENDOR_ADDRESS="Caliornia,apple";
    final static String VENDOR_EMAIL="applecalifornia@gmail.com";

    public Product(int id, String name, int maxRetailPrice, float rating, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.company = company;
        this.category = category;

    }
    static void displayVendorDetails(){
        System.out.println("VendorName : " + VENDOR_NAME);
        System.out.println("VendorAddress : " + VENDOR_ADDRESS);
        System.out.println("VendorEmail : " + VENDOR_EMAIL);
        //System.out.println("ProductId : " + id); we cant access the instance

    }
    void displayProductDetails(){
        System.out.println("ProductId : " + id);
        System.out.println("productName : " + name);
        System.out.println("MaxRetailPrice : " + maxRetailPrice);
        System.out.println("Rating : " + rating);
        System.out.println("Company : " + company);
        System.out.println("Category : " + category);
        System.out.println("VendorAddress : " + VENDOR_ADDRESS);//in instance method also we can  access static But not recommended
    }
}

