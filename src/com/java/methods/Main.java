package com.java.methods;

public class Main {
    public static void main(String[] args) {
        Product Product = new Product("samsung mobile", 200000, 4.5, 23455, (byte) 21, true, "samsung", "mobile");
        Product.displayProductDetails();
        Product product2 = new Product("apple", 45000, 4.8, 6565, (byte) 12, true, "apple", "mobile phone");
        product2.displayProductDetails();
        Product product3 = new Product("samsung2 mobile", 23000, 3.4, 4555, (byte) 31, true, "samsung", "mobile");
        product3.displayProductByCompany();
    }
}