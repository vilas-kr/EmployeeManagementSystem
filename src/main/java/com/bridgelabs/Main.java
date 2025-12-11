package com.bridgelabs;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Employee Management System!");
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("1. Check Attendance\n2. Calculate Full Time Wage\n3. Calculate Part Time Wage\n" +
                    "4. exit\nEnter your choice: ");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    checkAttendance();
                    break;

                case 2:
                    System.out.println("Daily wage for Full Time Employee is " + dailyEmployeeWage(8));
                    break;

                case 3:
                    System.out.println("Daily wage for Part Time Employee is " + dailyEmployeeWage(4));
                    break;

                case 4: return;

                default: System.out.println("Invalid choice");
            }
        }
    }

    public static int dailyEmployeeWage(int workHoursPerDay){
        int wagePerHour = 20;
        return wagePerHour * workHoursPerDay;
    }

    public static int monthlyEmployeeWage(int workHoursPerDay){
        int workingDays = 20;
        return workingDays * dailyEmployeeWage(workHoursPerDay);
    }

    public static int monthlyEmployeeWage(int workHoursPerDay, int totalWorkHours, int totalWorkingDays){
        if(totalWorkHours >= 100 || totalWorkingDays >= 20){
            return totalWorkingDays * dailyEmployeeWage(workHoursPerDay);
        }else{
            return -1;
        }
    }

    public static void checkAttendance(){
        int present = (int) (Math.random() * 10);

        //any number below 5 is considered as absent else present
        if(present < 5){
            System.out.println("Employee absent");
        }else{
            System.out.println("Employee present");
        }
    }
}