package com.jannedekraker.week6;

import java.util.Scanner;

public class Ass3NestedForLoop {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("up to which tables do you want in a table? ");
        int howBig = inputKeyboard.nextInt();
        header(howBig);
        tableMaker(howBig);
    }



    static void header (int howBig){
        String header = "  * |";
        String line = "-----";

        System.out.printf(header);
        for( int answer = 1; answer <= howBig; answer++){
            System.out.printf( "%5s",answer);
        }
        System.out.println("");

        for ( int answer = 1; answer <=(howBig+1); answer++){
            System.out.printf(line);
        }

        System.out.println("");}


static void tableMaker(int howBig){
    for (int table = 1; table <= howBig; table++) {
        System.out.printf( "%5s", table + " |");
        for( int answer = 1; answer <= howBig; answer++){
            System.out.printf( "%5s", table*answer);
        }
        System.out.println(" ");
    }
}
}



