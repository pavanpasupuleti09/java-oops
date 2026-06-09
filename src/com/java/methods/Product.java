package com.java.methods;

public class Product {
    // instance variables
    public static int id;
    String name;
    int maxRetailPrice;
    double rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;

    //no-args constructor
    Product(){
        System.out.println(" Product Constructor Called Sucessfully");
        this.id =1;
        this.name="Samsung Galaxy S4 ultra";
        this.maxRetailPrice=39000;
        this.rating=4.5;
        this.reviewsCount=2345;
        this.discountPercentage=20;
        this.isAvailable=true;
        this.company="Samsung";
        this.category="Mobiles";
    }
    public Product(String name, int maxRetailPrice, double rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String company, String category) {
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }
    // display product details
    // instance method
    // no args no return
    public void displayProductDetails(){
        System.out.println("Product id : " + id);
        System.out.println(name);
        System.out.println(maxRetailPrice);
        System.out.println(rating);
        System.out.println(reviewsCount);
        System.out.println(discountPercentage);
        System.out.println(isAvailable);
        System.out.println(company);
        System.out.println(category);
    }
    public void displayProductByCompany(){
        System.out.println(company);
    }
}


