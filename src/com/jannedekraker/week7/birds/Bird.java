package com.jannedekraker.week7.birds;

public class Bird {
    int lengthOfWing;
    String colorBeak;
    String colorOfFeathers;

    public Bird(int lengthOfWing, String colorBeak, String colorOfFeathers) {
        this.lengthOfWing = lengthOfWing;
        this.colorBeak = colorBeak;
        this.colorOfFeathers = colorOfFeathers;
    }

    public int getLengthOfWing() {
        return lengthOfWing;
    }

    public void setLengthOfWing(int lengthOfWing) {
        this.lengthOfWing = lengthOfWing;
    }

    public String getColorBeak() {
        return colorBeak;
    }

    public void setColorBeak(String colorBeak) {
        this.colorBeak = colorBeak;
    }

    public String getColorOfFeathers() {
        return colorOfFeathers;
    }

    public void setColorOfFeathers(String colorOfFeathers) {
        this.colorOfFeathers = colorOfFeathers;
    }
}
