package com.jannedekraker.week7.birds.sortbirds;

import com.jannedekraker.week7.birds.Bird;

public class Sparrow extends Bird {
String sexOfSparrow;
    public Sparrow(int lengthOfWing, String colorBeak, String colorOfFeathers, String sexOfSparrow) {
        super(lengthOfWing, colorBeak, colorOfFeathers);
        this.sexOfSparrow = sexOfSparrow;
    }

    public String getSexOfSparrow() {
        return sexOfSparrow;
    }

    public void setSexOfSparrow(String sexOfSparrow) {
        this.sexOfSparrow = sexOfSparrow;
    }
}
