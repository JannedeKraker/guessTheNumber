package com.jannedekraker.week6;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

// Gegeven een invoer van de gebruiker, doe het volgende:
//Print het aantal karakters
//Print het aantal woorden dat in de invoer zat
//Print het aantal klinkers (a, e, i, o, u, y)
//Bepaal of de invoer een palindroom is
//Maak een staafdiagram dat weergeeft hoe vaak een bepaalde karakters gezien zijn.
//
// zo moet het er uit gaan zien:
//Voer een zin in: nee weg t kaatsnet en staak t geween
//
//Aantal karakters: 36
//Aantal woorden:   8
//Aantal klinkers:  12
//Palindroom?       True
//
//        *
//        *                                                               *
//        *                                                               *
//        *                                                               *
//*       *                 *           *                                 *
//*       *                 *           *                                 *
//*       *   *       *     *         * *     *                           *
//*       *   *       *     *         * *     *                           *
//a b c d e f g h i j k l m n o p q r s t u v w x y z 0 1 2 3 4 5 6 7 8 9
public class Ass5FinalAssignment {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = inputKeyboard.nextLine();

        String sentenceToLowerCase = sentence.toLowerCase(Locale.ROOT);
        String sentenceWithoutSpaces = sentenceToLowerCase.replace(" ", "");
        StringBuilder sentenceInStringBuilder = new StringBuilder(sentenceToLowerCase);

        countLetters(sentenceWithoutSpaces);
        countWords(sentenceToLowerCase);
        countVowels(sentenceToLowerCase);
        palinDrome(sentenceInStringBuilder,sentenceToLowerCase);

        char[] charArray = sentenceToLowerCase.toCharArray();
        for (char chars: charArray) {
            System.out.println(chars);

        }
    }


        static void countLetters (String sentenceWithoutSpaces){
            int numberOfLetters = sentenceWithoutSpaces.length();
            System.out.println("number of letters: " + numberOfLetters);
        }

        static void countWords (String sentenceToLowerCase){
            int countWords = 0;
            String[] words = sentenceToLowerCase.split(" ");
            for (String word : words) {
                countWords++;
            }
            System.out.println("number of words: " + countWords);
        }

        static void countVowels (String sentenceToLowerCase){
            int countVowels = 0;
            for (int i = 0; i < sentenceToLowerCase.length(); i++) {
                char ch = sentenceToLowerCase.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                }
            }
            System.out.println("number of Vowels: " + countVowels);
        }

        static void palinDrome (StringBuilder sentenceInStringBuilder, String sentenceToLowerCase){
            String isItPalinDrome;
            String reverseSentence = sentenceInStringBuilder.reverse().toString();

            if (sentenceToLowerCase.equals(reverseSentence)) {
                isItPalinDrome = "yes it is";
            } else {
                isItPalinDrome = "No it isn't";
            }
            System.out.println("is the sentence a palindrome?: " + isItPalinDrome);
        }
    }




