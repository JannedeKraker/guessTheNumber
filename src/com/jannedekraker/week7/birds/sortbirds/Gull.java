package com.jannedekraker.week7.birds.sortbirds;

import com.jannedekraker.week7.birds.Bird;

public class Gull extends Bird {

    String sortGull;
    public Gull(int lengthOfWing, String colorBeak, String colorOfFeathers, String sortGull) {
        super(lengthOfWing, colorBeak, colorOfFeathers);
        this.sortGull = sortGull;
    }

    public String getSortGull() {
        return sortGull;
    }

    public void setSortGull(String sortGull) {
        this.sortGull = sortGull;
    }
}
