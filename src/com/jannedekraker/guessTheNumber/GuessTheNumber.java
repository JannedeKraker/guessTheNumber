package com.jannedekraker.guessTheNumber;import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Raad het getal
//Laat de computer een willekeurig getal kiezen van 1 tot 1000
// hint: de naam van een willekeurig getal in het Engels is “random number”,
// dus google op “random number java
//Laat de gebruiker naar dat getal raden.
// Vraag iets als “Raad een getal (van 1 tot 1000):”Als de gebruiker het getal heeft gewonnen,
// toon “Je hebt het geraden!” // bonus: geef het aantal raad-rondes of punten aan.
//Als de gebruiker een te hoog getal opgeeft toon “Dat getal is te hoog.
// ”Als de gebruiker een te laag getal opgeeft toon “Dat getal is te laag.
// ”Als de gebruiker het niet in 10x heeft geraden, stop met vragen en zeg “Je hebt verloren.
// Het getal was “ het getal

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner inputKeyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        int counter = 1;
        int guessNumber = randomNumber.nextInt(1000)+1;
        String[] nameNumber = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};

        System.out.println("Guess a number between 1 and 1000. You can guess ten times.");

      do { System.out.println("This is Guess " + nameNumber[counter] +":");
                int firstGuess = inputKeyboard.nextInt();
                if (guessNumber == firstGuess) {
                    System.out.println("You guessed the number in " + nameNumber[counter] + " Times!");
                    return;
                }
                else if (firstGuess > guessNumber) {
                    System.out.println("the number is too high.");
                }
                else {
                    System.out.println("the number is too low.");
                }
                counter++;
            }
         while (counter < 11);
         System.out.println("Unfortunately, you didn't guess the number. the number was: " + guessNumber);
        }

}


