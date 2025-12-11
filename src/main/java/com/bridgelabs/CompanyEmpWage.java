package com.bridgelabs;

import java.util.HashMap;
import java.util.Map;

public class CompanyEmpWage {

    private Map<String, EmpWageBuilder> companies;

    public CompanyEmpWage() {
        companies = new HashMap<String, EmpWageBuilder>();
    }

    public EmpWageBuilder addCompany(String name, EmpWageBuilder empWageBuilder) {
        companies.put(name, empWageBuilder);
        return empWageBuilder;
    }

    public EmpWageBuilder removeCompany(String name) {
        return companies.remove(name);
    }

    public EmpWageBuilder getCompany(String name) {
        return companies.get(name);
    }
}
