package com.bridgelabs;

import java.util.HashMap;
import java.util.Map;

public class CompanyEmpWageImpl implements CompanyEmpWage {

    private Map<String, EmpWageBuilder> companies;

    public CompanyEmpWageImpl() {
        companies = new HashMap<String, EmpWageBuilder>();
    }

    @Override
    public EmpWageBuilder addCompany(String name, EmpWageBuilder empWageBuilder) {
        companies.put(name, empWageBuilder);
        return empWageBuilder;
    }

    @Override
    public EmpWageBuilder removeCompany(String name) {
        return companies.remove(name);
    }

    @Override
    public EmpWageBuilder getCompany(String name) {
        return companies.get(name);
    }
}
