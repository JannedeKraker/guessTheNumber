package com.jannedekraker.week7;
//convert if statement in switch
// if (browser == 'Edge')
//
//    System.out.println("Je gebruikt Edge");
//
//}
//
//else if (browser == 'chrome' || browser == 'firefox' || browser == 'opera') {
//
//    System.out.println("Je gebruikt een moderne browser");
//
//}
//
//else if (browser == 'IE') {
//
//    System.out.println("Waarom gebruik je Internet Explorer?");
//
//}
//
//else {
//
//    System.out.println("Je gebruikt een niet-ondersteunde browser");
//
//}
public class SwitchStatement {
    public static void main(String[] args) {
        String browser= "firefox";
        switch (browser){
            case "Edge":
                System.out.println("Je gebruikt Edge");
                break;
            case "chrome","firefox","opera":
                System.out.println("Je gebruikt een moderne browser");
                break;
            case "IE":
                System.out.println("Waarom gebruik je Internet Explorer?");
                break;
            default:
                System.out.println("Je gebruikt een niet-ondersteunde browser");
        }
    }
}
