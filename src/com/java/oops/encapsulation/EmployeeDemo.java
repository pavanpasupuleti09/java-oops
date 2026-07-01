package com.java.oops.encapsulation;

 public class EmployeeDemo {
    private String company = "TCS"; // fixed value
    private double salary;

    public String getCompany() {
        return company;
    }

    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Salary too low");
        }
    }

    public double getSalary() {
        return salary;
    }
}

