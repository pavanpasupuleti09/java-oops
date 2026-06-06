package com.java.oops.abstraction;

public class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Bike starts with self-start button");
    }
}