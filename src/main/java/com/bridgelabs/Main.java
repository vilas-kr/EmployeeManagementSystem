package com.bridgelabs;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Employee Management System!");

        Employee employee1 = new Employee();
        employee1.setName("Vilas");
        employee1.markWorkHours(1,8);
        employee1.markWorkHours(2, 12);

        Employee employee2 = new Employee();
        employee2.setName("Narayan");
        employee2.markWorkHours(1,10);
        employee2.markWorkHours(2, 9);
        employee2.markWorkHours(3, 12);

        EmpWageBuilder company = new EmpWageBuilder(10, 15, 100);
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        System.out.println("Total company wage is : " + company.calculateTotalWage());
    }
}