package com.bridgelabs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class EmpWageBuilder {

    private int wagePerHour;
    private int totalWorkingDaysPerMonth;
    private int totalWorkingHours;
    private List<Employee> employees;

    public EmpWageBuilder(int wagePerHour, int totalWorkingDaysPerMonth, int totalWorkingHours) {
        this.wagePerHour = wagePerHour;
        this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
        this.totalWorkingHours = totalWorkingHours;
        employees = new ArrayList<>();
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public int calculateTotalWage() {
        int totalWage = 0;
        int monthlyWage = 0;
        for(Employee employee : employees) {
            monthlyWage = employee.calculateMonthlyWage(wagePerHour, totalWorkingDaysPerMonth, totalWorkingHours);
            System.out.println("Employee Name : " + employee.getName() + " monthly wage : " + monthlyWage);
            totalWage += monthlyWage;
        }
        return totalWage;
    }
}
