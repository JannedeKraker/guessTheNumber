package com.jannedekraker.week6;
// Opdracht:
//Schrijf een methode genaamd fibonacci(int n) die gebruik maakt van recursie en een ternary if
//De methode mag slechts één regel lang zijn.
public class Ass1TernaryIf {
    public static void main(String[] args) {
      int n = 6;
        System.out.println(fibonacci(n));


    }
    public static int fibonacci(int n){
        return n < 2 ? n : fibonacci(n-1) + fibonacci(n-2);
    }
}
//  int result = Sum(10);
//        System.out.println(result);}

//     ---------------------------------------------------
//      static void fibonacci(int n){ deze methode moet ik nog schrijven maar
//      ik weet niet wat de output moet zijn.
//
//
//        }

// deze methode en die methode hieronder zijn dezelfde methodes
// alleen heb ik deze methode veranderd zodat hij recursie en ternary if gebruikt,
// zoals gevraagd in de opdracht.
// -----------------------------------------
// public static int Sum(int k) {
// if (k > 0) {
//         return k + Sum(k - 1);
//         } else {
//         return 0;
//      }
// }
// -----------------------------------------
//public static int Sum(int k) {
// return (k > 0) ? k + Sum(k - 1) : 0;
// }
//}

