package com.jannedekraker.week5;

public class StringBuilderPractise {
    public static void main(String[] args) {


        StringBuilder newString = new StringBuilder("Hoi");
        System.out.println(newString);
        newString.append(23);
        newString.append("hallo");
        newString.append(1.5);
        newString.insert(4, 78);
        System.out.println(newString);
        newString.append("Hoeveel kan hier nog bij?");
        System.out.println(newString);

        String tekst = "Hallo Wereld Hallo Wereld";

        String tekst2 = "Hallo Wereld";



        }


    }
