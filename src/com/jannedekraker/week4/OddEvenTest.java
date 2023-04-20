package com.jannedekraker.week4;

public class OddEvenTest {

    public static boolean isOdd(int input){
        if(input % 2 != 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(3));
    }
}
