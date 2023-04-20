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
//https://www.youtube.com/watch?v=w2HxmgN8Mx0 filmpje waar het wordt uit gelegd.
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
        palinDrome(sentenceInStringBuilder, sentenceToLowerCase);

//  hieronder staat een manier om vanuit een array een graph bar te printen.
//  Dus nu wil ik van alle alle letters tellen en daar een array van maken en die hier in stoppen.

        int letterA = 0;
        int letterB = 0;
        int letterC = 0;
        int letterD = 0;
        int letterE = 0;
        int letterF = 0;
        int letterG = 0;
        int letterH = 0;
        int letterI = 0;
        int letterJ = 0;
        int letterK = 0;
        int letterL = 0;
        int letterM = 0;
        int letterN = 0;
        int letterO = 0;
        int letterP = 0;
        int letterQ = 0;
        int letterR = 0;
        int letterS = 0;
        int letterT = 0;
        int letterU = 0;
        int letterV = 0;
        int letterW = 0;
        int letterX = 0;
        int letterY = 0;
        int letterZ = 0;


        char[] charArray = sentenceToLowerCase.toCharArray();
        for (char chars : charArray) {
            if (chars == 'a') {
                letterA++;
            }
            if (chars == 'b') {
                letterB++;
            }
            if (chars == 'c') {
                letterC++;
            }
            if (chars == 'd') {
                letterD++;
            }
            if (chars == 'e') {
                letterE++;
            }
            if (chars == 'f') {
                letterF++;
            }
            if (chars == 'g') {
                letterG++;
            }
            if (chars == 'h') {
                letterH++;
            }
            if (chars == 'i') {
                letterI++;
            }
            if (chars == 'j') {
                letterJ++;
            }
            if (chars == 'k') {
                letterK++;
            }
            if (chars == 'l') {
                letterL++;
            }
            if (chars == 'm') {
                letterM++;
            }
            if (chars == 'n') {
                letterN++;
            }
            if (chars == 'o') {
                letterO++;
            }
            if (chars == 'p') {
                letterP++;
            }
            if (chars == 'q') {
                letterQ++;
            }
            if (chars == 'r') {
                letterR++;
            }
            if (chars == 's') {
                letterS++;
            }
            if (chars == 't') {
                letterT++;
            }
            if (chars == 'w') {
                letterW++;
            }
            if (chars == 'x') {
                letterX++;
            }
            if (chars == 'y') {
                letterY++;
            }
            if (chars == 'z') {
                letterZ++;
            }
        }

        int[] arr = {letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH,
                letterI, letterJ, letterK, letterL, letterM, letterN, letterO, letterP, letterQ,
                letterR, letterS, letterT, letterU, letterV, letterW, letterX, letterY, letterZ};
        graphBar(arr);
        System.out.println("a b c d e f g h i j k l m n o p q r s t u v w x y z ");
    }

    static void countLetters(String sentenceWithoutSpaces) {
        int numberOfLetters = sentenceWithoutSpaces.length();
        System.out.println("number of letters: " + numberOfLetters);
    }

    static void countWords(String sentenceToLowerCase) {
        int countWords = 0;
        String[] words = sentenceToLowerCase.split(" ");
        for (String word : words) {
            countWords++;
        }
        System.out.println("number of words: " + countWords);
    }

    static void countVowels(String sentenceToLowerCase) {
        int countVowels = 0;
        for (int i = 0; i < sentenceToLowerCase.length(); i++) {
            char ch = sentenceToLowerCase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowels++;
            }
        }
        System.out.println("number of Vowels: " + countVowels);
    }

    static void palinDrome(StringBuilder sentenceInStringBuilder, String sentenceToLowerCase) {
        String isItPalinDrome;
        String reverseSentence = sentenceInStringBuilder.reverse().toString();

        if (sentenceToLowerCase.equals(reverseSentence)) {
            isItPalinDrome = "yes it is";
        } else {
            isItPalinDrome = "No it isn't";
        }
        System.out.println("is the sentence a palindrome?: " + isItPalinDrome);
    }


    static void graphBar(int[] arr) {
        int len = arr.length;
        int max = 0;

        for (int i = 0; i < len; i++)   //find max of array
        {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        char[][] dis1 = new char[len][max];
        for (int j = 0; j < len; j++)   //store the array in horizontal order
        {
            for (int i = 0; i < max - arr[j]; i++)
                dis1[j][i] = ' ';

            for (int k = max - arr[j]; k < max; k++) {
                dis1[j][k] = '*';

            }

        }

        for (int i = 0; i < max; i++)  //print the array in transpose order
        {
            for (int j = 0; j < len; j++)
                System.out.print(dis1[j][i] + " ");
            System.out.println();
        }
    }
}





