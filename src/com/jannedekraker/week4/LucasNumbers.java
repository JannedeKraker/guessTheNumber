package com.jannedekraker.week4;

import java.util.Scanner;

public class LucasNumbers {
    public static void main(String[] args) {




        int startNumber = 2;
        int secondNumber = 1;
        int nextLucasNumber;
        int i;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("enter a natural number");
        int n = keyboardInput.nextInt();

        if (n <= 0){
            System.out.println("the number is 0 or negative, that is not allowed. Try again:");
            n = keyboardInput.nextInt();

        }
        if (n >= 43) {
                System.out.println("the number is too big, it doesn't fit. try again:");
                n = keyboardInput.nextInt();
        }
        else

        for (i = 1; i <= n; i++) {
            nextLucasNumber = startNumber + secondNumber;
            System.out.print( nextLucasNumber + " ");
            startNumber = secondNumber;
            secondNumber = nextLucasNumber;

        }
    }
}
