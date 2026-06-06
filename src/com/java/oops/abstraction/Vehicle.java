 package com.java.oops.abstraction;

    public abstract class Vehicle {

        String brand;

        public Vehicle(String brand) {
            this.brand = brand;
        }

        // Abstract method
        public abstract void start();

        // Concrete method
        public void displayBrand() {
            System.out.println("Brand : " + brand);
        }
    }

