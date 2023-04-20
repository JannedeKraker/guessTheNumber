package com.jannedekraker.week7.employees;

public abstract class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private float experienceInYears;



    public Employee(String name, String address, String phoneNumber, float experienceInYears){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.experienceInYears = experienceInYears;

    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getExperienceInYears(float experienceInYears) {

        return experienceInYears;
    }

    public void setExperienceInYears(float experienceInYears) {
        if (experienceInYears <0){
            return;
        }
        this.experienceInYears = experienceInYears;
    }

    @Override
    public String toString(){
        return "the name of this employee is " + name;

    }

}
