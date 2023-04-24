package com.jannedekraker.week7.birds;

import com.jannedekraker.week7.birds.sortbirds.Gull;
import com.jannedekraker.week7.birds.sortbirds.Sparrow;
import com.jannedekraker.week7.birds.sortbirds.Turkey;

//Opdracht:
//
//Creëer een programma met een hoofdklasse ‘vogel’ met een aantal kindklasses die de eigenschappen
// van de vogel erven. Maak daarbij gebruik van overriding en overloading.
//We vullen onze code van de Vogel.java en de andere rassen aan, door constructoren toe te voegen.
//
//Daag jezelf uit door bijvoorbeeld in Parkiet.java een constructor toe te voegen die twee parameters
// nodig heeft, terwijl je maar één parameter nodig hebt voor de Vogel.java klasse (zie vorige slides)
public class BirdCage {
    public static void main(String[] args) {
        Bird blackBird = new Bird(34, "orange", "brown");
        Gull gullOne = new Gull(50, "black", "white", "black-backed gull");
        Sparrow sparrowOne = new Sparrow(16, "black", "Brown, white and black", "male");
        Turkey turkeyOne = new Turkey(140, "orange", "bronze, red and blue", 33, "kloekerdekloek");

        System.out.print("Sound of a blackbird is: ");
        blackBird.soundBird();
        System.out.print("Sound of a Gull is: ");
        gullOne.soundBird();
        System.out.print("Sound of a sparrow is: ");
        sparrowOne.soundBird();
        System.out.print("Sound of a sparrow is: ");
        sparrowOne.soundBird("(lure call)");
        System.out.print("Sound of a turkey is: ");
        turkeyOne.soundBird();
    }
}
