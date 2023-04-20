package com.jannedekraker.week5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//Lees het woord van de gebruiker.
//
//        Maak een ArrayList<Character> zo lang als de lengte van het woord,
//        met alleen onderstrepingstekens '_'. Dit vertegenwoordigt de letters die momenteel
//        door de gebruiker worden geraden. Wanneer een gebruiker een letter in een woord raadt,
//        wordt de schatting bijgewerkt en worden letters weergegeven die met succes zijn geraden.
//        Zolang het woord nog niet geraden is:
//        vraag de gebruiker om een teken.
//        update de huidige schatting met de geraden letters in woord.
//        druk de nieuwe schatting af.
//        Zodra iemand het woord heeft geraden of het aantal beurten voorbij zijn stopt het spel.
public class Hangman {
    public static void main(String[] args) {
// Lees het woord van de gebruiker.
        Scanner userIn = new Scanner(System.in);
        System.out.println("type an word: ");
        String word = userIn.nextLine();

        ArrayList<Character> guessWord = new ArrayList<Character>();
        for (char c : word.toCharArray()) {
            guessWord.add(c);
        }

//Maak een ArrayList<Character> zo lang als de lengte van het woord
//met alleen onderstrepingstekens '_'.
        ArrayList<Character> worden = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            worden.add('_');
        }
// outside the loop otherwise it loops
        System.out.println(worden);


        int maxguesses = 10;
        for (int i = 0; i < maxguesses; i++) {
            System.out.println("typ an lettre");
            char guess = userIn.next().charAt(0);
            for (int index = 0; index < word.length(); index++) {

                if (word.charAt(index) == guess) {
                    worden.set(index, guess);
                    if (guessWord.equals(worden)) {
                        System.out.println(" You have guessed the word ");

                    }
                }

                }
            System.out.println(worden);


        }
        System.out.println("unfortunately you didn't guess the word within " + maxguesses + " the turns");

        }

    }

