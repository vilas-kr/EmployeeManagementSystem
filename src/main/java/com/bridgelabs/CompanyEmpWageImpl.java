package com.bridgelabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyEmpWageImpl implements CompanyEmpWage {

    private List<EmpWageBuilder> companies;

    public CompanyEmpWageImpl() {
        companies = new ArrayList<>();
    }

    @Override
    public EmpWageBuilder addCompany(String name,EmpWageBuilder empWageBuilder) {
        empWageBuilder.setName(name);
        companies.add(empWageBuilder);
        return empWageBuilder;
    }

    @Override
    public EmpWageBuilder removeCompany(String name) {
        EmpWageBuilder empWageBuilder = getCompany(name);
        if(companies.remove(empWageBuilder))
            return empWageBuilder;
        else
            return null;
    }

    @Override
    public EmpWageBuilder getCompany(String name) {
        for (EmpWageBuilder empWageBuilder : companies) {
            if(empWageBuilder.getName().equalsIgnoreCase(name)){
                return empWageBuilder;
            }
        }
        return null;
    }

    //return company total wage by the company name
    public int getTotalWageByCompany(String name) {
        EmpWageBuilder empWageBuilder = getCompany(name);
        return empWageBuilder.calculateTotalWage();
    }
}
