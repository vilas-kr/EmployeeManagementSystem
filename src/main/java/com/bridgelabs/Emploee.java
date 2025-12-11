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
        attendance = new boolean[31];
        workingHours = new int[31];
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

    public int calculateTotalWorkingHours(){
        int totalWorkingHours = 0;
        for(int hours : workingHours){
            totalWorkingHours += hours;
        }
        return totalWorkingHours;
    }

    public int calculateMontlyWage(){
        if(calculateTotalWorkingHours() >= 100){
            return wagePerHour * 100;
        }
        int totalWorkingDays = 0;
        int totalWage = 0;
        for(int workHour :  workingHours){
            if(workHour > 0){
                totalWorkingDays++;
            }
            if(totalWorkingDays > 20){
                return totalWage;
            }
            totalWage +=  workHour *  wagePerHour;
        }
        return totalWage;
    }

}
