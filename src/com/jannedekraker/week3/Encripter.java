package com.jannedekraker.week3;

import java.util.Scanner;

public class Encripter {
    public static void main(String[] args) {
        int n=5;
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("enter a punctuation string: ");
        String encriptCode = inputKeyboard.nextLine();
        char[] charArray = encriptCode.toCharArray();
        String result = "";

        for (char c: charArray){
            char r = (char)(c + n);
            result += r;
        }
        System.out.println(result);
        }

    }

