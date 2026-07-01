package com.java.oops.encapsulation;

public class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

 class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setBalance(5000);
        System.out.println(acc.getBalance());

        acc.setBalance(-100); // invalid
    }
}

