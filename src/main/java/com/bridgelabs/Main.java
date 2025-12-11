package com.bridgelabs;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Employee Management System!");

        int present = (int) (Math.random() * 10);

        //any number below 5 is considered as absent else present
        if(present < 5){
            System.out.println("Employee absent");
        }else{
            System.out.println("Employee present");
        }


        int workHoursPerDay = 8; //Full time employee
        int wage = dailyEmployeeWage(workHoursPerDay);
        System.out.println("Daily wage for Full Time Employee is " + wage);

        workHoursPerDay = 4; //Part time employee
        wage = dailyEmployeeWage(workHoursPerDay);
        System.out.println("Daily wage for Part Time Employee is " + wage);
    }

    public static int dailyEmployeeWage(int workHoursPerDay){
        int wagePerHour = 20;
        return wagePerHour * workHoursPerDay;
    }
}