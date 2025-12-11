package com.bridgelabs;

public interface CompanyEmpWage {

    EmpWageBuilder addCompany(String name, EmpWageBuilder empWageBuilder);

    EmpWageBuilder removeCompany(String name);

    EmpWageBuilder getCompany(String name);
}
