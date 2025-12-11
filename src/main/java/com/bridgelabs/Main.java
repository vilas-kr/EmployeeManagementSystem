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
    }
}