package com.jannedekraker.week4;

public class PractiseWithMethods {
// this is the main class where all methods can be used
    public static void main(String[] args) {

        printSomeThing("here you can put all the strings you want");
        enter();

        printThis();

        toldNameAge("Janne", "de Kraker", 36);
        enter();

        System.out.println("You are " + ageInMonths(36) + " months old");
        int ageMonthsJanne = ageInMonths(36);
        enter();

        System.out.println("You are " + ageMonthsJanne + " months old");
        enter();

        System.out.println("two years");
        checkAge(2);
        enter();

        System.out.println("three years");
        checkAge(3);
        enter();

        System.out.println("eighteen years");
        checkAge(18);
        enter();

        System.out.println("thirty six years");
        checkAge(36);
        enter();

        System.out.println(plusMethod(1,2));
        System.out.println(plusMethod(1,2,3));
        System.out.println(plusMethod(1.6,7.5,2.1));
        System.out.println(plusMethod(2.3,2,4.5));

    }
// Here are different methods:
    // this method print
    private static void printThis() {
        System.out.println("Hai, I hope that i learn how to make methods in Java.");
    }
    private static void printSomeThing(String something) {
        System.out.println(something);
    }
    static void toldNameAge(String firstName, String lastName, int howOld){
        System.out.println("this is your name: " + firstName + " " + lastName);
        System.out.println("You are " + howOld + " years old.");
        }
    static int ageInMonths( int age) {
        int howMuchMonths = age * 12;
        return howMuchMonths;
    }

    static void checkAge(int age){
        if(age >= 18) {
            System.out.println("You are an adult.");
        }
        else {
            System.out.println("You are an child.");
        }
        if (age >= 31) {
            System.out.println("And you are older then 30 years.");
        }
        if (age >= 3 && age <= 4){
            System.out.println("And you are an toddler");
        }
    }
        static void enter() {
            System.out.println("");
        }

        static int plusMethod(int a, int b){
        return a + b;
        }
        static double plusMethod( double a, double b){
        return a + b;
        }
    static int plusMethod(int a, int b, int c){
        return a + b + c;
    }
    static double plusMethod( double a, double b, double c){
        return a + b + c;
    }



}
