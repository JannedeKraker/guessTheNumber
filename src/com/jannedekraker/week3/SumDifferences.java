package com.jannedekraker.week3;

import java.util.Scanner;

//In deze opdracht moet via de terminal een geheel positief getal opgegeven worden.
//Het getal moet opgevraagd worden met behulp van de nextInt-methode uit de Scanner-klasse.
//Zorg ervoor dat verkeerde invoer goed wordt afgehandeld door het programma.
//Vervolgens moet de som van alle even getallen van 1 tot en met het opgegeven getal worden berekend.
//Ook moet de som van alle oneven getallen van 1 tot en met het opgegeven getal worden berekend. Als laatste moet het verschil van deze twee sommen worden geprint.
//Een voorbeeld van de uitvoer is:
// a%2=0 dan is het een even getal anders oneven
public class SumDifferences {
    public static void main(String[] args) {

        int sum = 0;
        int sum2 = 0;
        int number = 0;
        System.out.println("enter a whole number: ");
        boolean hasCorrectInput = false;
        while (!hasCorrectInput) {
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
            } catch (Exception exception) {
                System.out.println("please put in a valid positive number!");
                continue;
            }
            hasCorrectInput = true;
        }

        for (int i = 0; i <= number; i = i + 2) {
            sum = sum + i;
            }
        System.out.println("the sum of even numbers through "+ number + " is: " + sum);
        for (int h = 1; h <= number; h = h + 2) {
        sum2 = sum2 + h;

    }
    System.out.println("the sum of odd numbers through "+ number + " is: " + sum2);
        System.out.println("the difference between the two sums is :" + (sum - sum2));
}
    }







