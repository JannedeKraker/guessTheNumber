package com.jannedekraker.week7.employees;

import com.jannedekraker.week7.employees.Employee;

// Inheritance betekend overerving dus je extend een class in een andere klas. je neemt de fields over.
public class Manager extends Employee {
    private int teamSize;

    // super verwijst naar de constuctor van de super class
    public Manager(String name, String address, String phoneNumber, float experienceInYears, int teamSize) {
        super(name, address, phoneNumber, experienceInYears);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void reportProjectStatus() {
        System.out.println("Status project: we are half way the project");

    }

    @Override
    public String toString() {
        return "this is an manager with teamsize " + teamSize;
    }
}
