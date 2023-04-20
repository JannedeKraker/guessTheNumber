package com.jannedekraker.week3;

import java.util.Scanner;

public class Decripter {
    public static void main(String[] args) {
        int n=5 ;
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("enter your secret message: ");
        String decriptCode = inputKeyboard.nextLine();
        char[] charArray = decriptCode.toCharArray();
        String result = "";

        for (char c: charArray){
            char r = (char)(c - n);
            result += r;
        }
        System.out.println(result);
    }

}


