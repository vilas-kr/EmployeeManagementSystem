package com.bridgelabs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private String name;
    private boolean[] attendance;
    private int[] workingHours;

    public Employee(){
        attendance = new boolean[31];
        workingHours = new int[31];
    }

    public void markAttandance(int day){
        this.attendance[day] = true;
    }

    public void markWorkHours(int day, int workingHours){
        this.attendance[day] = true;
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

    public int calculateMonthlyWage(int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHours){
        if(calculateTotalWorkingHours() >= totalWorkingHours){
            return wagePerHour * totalWorkingHours;
        }
        int totalWorkingDays = 0;
        int totalWage = 0;
        for(int workHour :  workingHours){
            if(workHour > 0){
                totalWorkingDays++;
            }
            if(totalWorkingDays > totalWorkingDaysPerMonth){
                return totalWage;
            }
            totalWage +=  workHour *  wagePerHour;
        }
        return totalWage;
    }

}
