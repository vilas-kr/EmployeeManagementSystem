package com.bridgelabs;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Employee Management System!");

        Employee employee1 = new Employee();
        employee1.setName("Vilas");
        employee1.markWorkHours(1,8);
        employee1.markWorkHours(2, 12);
        System.out.println("employee monthly wage is : " + employee1.calculateMonthlyWage(10, 3, 25));

        Employee employee2 = new Employee();
        employee2.setName("Narayan");
        employee2.markWorkHours(1,10);
        employee2.markWorkHours(2, 9);
        employee2.markWorkHours(3, 12);
        System.out.println("employee monthly wage is : " + employee2.calculateMonthlyWage(20, 1, 35));
    }
}