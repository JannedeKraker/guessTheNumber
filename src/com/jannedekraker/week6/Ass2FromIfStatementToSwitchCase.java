package com.jannedekraker.week6;

import java.util.Scanner;

// Schrijf het gegeven if-statement om naar een switch case:
// if (browser == 'Edge'){
// System.out.println("Je gebruikt Edge");
//  }
// else if (browser == 'chrome' || browser == 'firefox' || browser == 'opera') {
// System.out.println("Je gebruikt een moderne browser");
//  }
// else if (browser == 'IE') {
// System.out.println("Waarom gebruik je Internet Explorer?");
//  }
// else {
// System.out.println("Je gebruikt een niet-ondersteunde browser");
// }
public class Ass2FromIfStatementToSwitchCase {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welke browser gebruik je?");
        String browser = keyboard.nextLine();
        switch (browser) {
            case "Edge":
                System.out.println("Je gebruikt Edge");
                break;
            case "chrome":
            case "firefox":
            case "opera":
                System.out.println("Je gebruikt een moderne browser");
                break;
            case "IE":
                System.out.println("Waarom gebruik je Internet Explorer?");
                break;
            default:
                System.out.println("Je gebruikt een niet-ondersteunde browser");
                break;

        }
    }
}
