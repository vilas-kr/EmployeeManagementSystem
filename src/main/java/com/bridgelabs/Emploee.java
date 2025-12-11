package com.bridgelabs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Emploee {

    private boolean[] attendance;
    private int[] workingHours;
    private int wagePerHour;

    public Emploee(){
        attendance = new boolean[30];
        workingHours = new int[30];
        wagePerHour = 20;
    }

    public void markAttandance(int day, boolean attendance){
        this.attendance[day] = attendance;
    }

    public void markWorkHours(int day, int workingHours){
        this.workingHours[day] = workingHours;
    }

    public boolean checkAttendance(int day){
        return attendance[day];
    }

    public int calculateTotalAttendance(){
        int totalAttendance = 0;
        for(boolean attendance: attendance){
            if(attendance){
                totalAttendance++;
            }
        }
        return totalAttendance;
    }

    public int calculateTotalWorkingHours(){
        int totalWorkingHours = 0;
        for(int hours : workingHours){
            totalWorkingHours += hours;
        }
        return totalWorkingHours;
    }

    public int calculateMontlyWage(){
        if(calculateTotalAttendance() >= 20 ||  calculateTotalWorkingHours() >= 100){
            return calculateTotalWorkingHours() *  wagePerHour;
        }else{
            return -1;
        }
    }

}
