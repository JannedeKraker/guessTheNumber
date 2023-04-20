package com.jannedekraker.week7.employees;

public class Building {
    public static void main(String[] args) {
        Manager myManager = new Manager("Sem", "itvitae", "0653878238", 3, 8);
        Programmer myProgrammer = new Programmer("Mark", "Itvitae", "06328934923", 8, "C#");
        Salesman mySalesman = new Salesman("Arjan", "itvitae", "062487438", 3, 500);

        myProgrammer.writeCode();
        myManager.reportProjectStatus();
        System.out.println(myManager);
        System.out.println(myProgrammer);

    }
}
