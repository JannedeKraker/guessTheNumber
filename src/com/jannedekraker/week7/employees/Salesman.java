package com.jannedekraker.week7.employees;

import com.jannedekraker.week7.employees.Employee;

public class Salesman extends Employee {
int commisie;

    public Salesman(String name, String address, String phoneNumber, float experienceInYears, int commisie) {
        super(name, address, phoneNumber, experienceInYears);
        this.commisie = commisie;
    }

    public int getCommisie() {
        return commisie;
    }

    public void setCommisie(int commisie) {
        this.commisie = commisie;
    }
}


