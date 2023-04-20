package com.jannedekraker.week3;

import java.util.Scanner;

public class ToMinutes {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        int years;
        int months;
        int weeks;
        int days;
        int hours;


        System.out.println("From how many years do you want to know the minutes? (0-1000)");
        years = inputKeyboard.nextInt();

        System.out.println("From how many months do you want to know the minutes? (0-1000)");
        months = inputKeyboard.nextInt();

        System.out.println("From how many weeks do you want to know the minutes? (0-1000)");
        weeks = inputKeyboard.nextInt();

        System.out.println("From how many days do you want to know the minutes? (0-1000)");
        days = inputKeyboard.nextShort();

        System.out.println("From how many hours do you want to know the minutes? (0-1000)");
        hours = inputKeyboard.nextShort();

        int yearsInMin = years * 356 * 24 * 60;
        int monthsInMin = months * 30 * 24 * 60;
        int weeksInMin = weeks * 7 * 24 * 60;
        int daysInMin = days * 24 * 60;
        int hoursInMin = hours * 60;

        System.out.println("years in minutes: " + yearsInMin);
        System.out.println("months in minutes: " + monthsInMin);
        System.out.println("weeks in minutes: " + weeksInMin);
        System.out.println("weeks in minutes: " + daysInMin);
        System.out.println("hours in minutes: " + hoursInMin);
        System.out.println("total: " + (yearsInMin+monthsInMin+weeksInMin+daysInMin+hoursInMin));
    }
}
