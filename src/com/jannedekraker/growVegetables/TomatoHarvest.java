package com.jannedekraker.growVegetables;
import com.jannedekraker.harvestTime.calculateMonth;
import java.util.Scanner;

//- onderdeel van een package
// - importeert een andere package
//- bevat meerdere comments
// - bevat een class
// - Heeft variabelen met verschillende (non) access variables
// - Heeft methoden met verschillende (non) access variables
// - compileert
// -  wanneer kan ik mijn tomaten oogsten?
//  het duurt 6 maanden na zaaien
 class tomatoHarvest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What month did you sow your tomato plants?");
        final String answerQuestionOne = input.next();

        System.out.println("You can harvest your tomatos in " + calculateMonth.calcMonth(answerQuestionOne));

    }
}
