package com.jannedekraker.week3;

import java.util.Scanner;

public class FahrToCel {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("What is the Fahrenheit today?");
        double fahrenheit= inputKeyboard.nextDouble();

        double celcius = (fahrenheit - 32)/1.8;
        System.out.println("it is: " + celcius + " celcius today.");

    }
}
