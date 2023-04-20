package com.jannedekraker.week3;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("what is the distance in meters?");
        double disInMeters = inputKeyboard.nextDouble();

        System.out.println("how many hours did the ride take?");
        double howManyHours = inputKeyboard.nextDouble();

        System.out.println("how many minutes did the ride take? (0-59)");
        double howManyMinutes = inputKeyboard.nextDouble();

        System.out.println("how many seconds did the ride take (0-59)");
        double howManySeconds = inputKeyboard.nextDouble();

        double totalSecond = (howManyHours * 60 * 60) + (howManyMinutes * 60) + howManySeconds;
        double metresPerSecond = disInMeters/totalSecond;
        double kilometerPerHour = metresPerSecond * 3.6;
        double milesPerHour = kilometerPerHour * 0.62;
        System.out.println("your speed is in min/s: " + metresPerSecond );
        System.out.println(" your speed is in km/h: " + kilometerPerHour);
        System.out.println(" your speed is in miles/h: " + milesPerHour);
    }
}
