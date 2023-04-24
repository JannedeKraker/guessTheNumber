package com.jannedekraker.week7.birds.sortbirds;

import com.jannedekraker.week7.birds.Bird;

public class Turkey extends Bird {
    int lengthFeather;
    String sound;


    public Turkey(int lengthOfWing, String colorBeak, String colorOfFeathers, int lengthFeather, String sound) {
        super(lengthOfWing, colorBeak, colorOfFeathers);
        this.lengthFeather = lengthFeather;
        this.sound = sound;
    }

    public int getLengthFeather() {
        return lengthFeather;
    }

    public void setLengthFeather(int lengthFeather) {
        this.lengthFeather = lengthFeather;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    @Override
    public void soundBird() {
        System.out.println("kloek kloek kloek kloek");
    }
}

