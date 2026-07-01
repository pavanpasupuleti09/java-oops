package com.java.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        EmployeeDemo emp = new EmployeeDemo();

        System.out.println(emp.getCompany());

        emp.setSalary(15000);
        System.out.println(emp.getSalary());
    }
}
