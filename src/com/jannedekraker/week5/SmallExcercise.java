package com.jannedekraker.week5;

import java.util.Locale;
import java.util.Scanner;

//Opdracht
//Gegeven een willekeurige string als invoer, reverse deze string:
//Abcdef -> fedcba​
//
//Bonus: Geef ook aan wanneer een string een palindroom is.
//
//        Lepel -> lepel
//        Palindroom!

//        opdracht al gemaakt maar mag nu niet met reverse, omdat hij dan te makkelijk is.
//        Scanner inputKeyboard = new Scanner(System.in);
//        System.out.println("What word shall I turn for you?");
//        String turnAround = inputKeyboard.nextLine();
//
//        String turnAroundLower = turnAround.toLowerCase(Locale.ROOT);
//        StringBuilder word = new StringBuilder(turnAroundLower);
//        StringBuilder turnAroundWord = word.reverse();
//
//        String stringTurnAroundWord = turnAroundWord.toString();
//        System.out.println(turnAroundWord);
//
//        if (stringTurnAroundWord.equals(turnAroundLower)) {
//            System.out.println("It is a palindrome");
//        }
//
//
//    }
//}
public class SmallExcercise {
    public static void main(String[] args) {

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("What word shall I turn for you?");
        String turnAround = inputKeyboard.nextLine();
        String turnAroundLower = turnAround.toLowerCase(Locale.ROOT);
        StringBuilder word = new StringBuilder();

        for  (int i = turnAroundLower.length(); i > 0; i--) {
           word.append(turnAroundLower.charAt(i-1));




        }
        System.out.println(word);

    }
}



