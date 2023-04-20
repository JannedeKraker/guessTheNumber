import java.util.Scanner;

//package com.jannedekraker.week5;
//Schrijf een programma met de naam PrintArray dat de gebruiker vraagt om het aantal items
// in een array (een niet-negatief geheel getal) en het opslaat in een int-variabele met de
// naam NUM_ITEMS. Vervolgens wordt de gebruiker gevraagd om de waarden van alle items en
// worden deze opgeslagen in een int-array met de naam items. Het programma zal dan de
// inhoud van de array afdrukken in de vorm van [x1, x2, ..., xn
public class PrintArray {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("enter the number of items");
       final int Num_ITEMS = keyboardInput.nextInt();
        System.out.println("Enter the value of all items (separated by a space)");
        keyboardInput.nextLine();
        String items = keyboardInput.nextLine();
//        String[] stringArray = items.split(" ");
//       String theString = stringArray.toString();
//        System.out.println(theString);
        String arrayItems = items.replace(" ",", ");
        System.out.println("de waarden zijn: [" + arrayItems + "]");


        }


    }

