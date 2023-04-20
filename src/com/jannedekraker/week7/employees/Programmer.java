package com.jannedekraker.week7.employees;

import com.jannedekraker.week7.employees.Employee;

public class Programmer extends Employee {

    String programmingLanguages;
    public Programmer(String name, String address, String phoneNumber, float experienceInYears, String programmingLanguages) {
        super(name, address, phoneNumber, experienceInYears);
        this.programmingLanguages = programmingLanguages;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void writeCode(){
        System.out.println("I am writing code");
    }
}
