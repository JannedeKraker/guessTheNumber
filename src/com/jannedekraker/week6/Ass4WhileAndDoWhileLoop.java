package com.jannedekraker.week6;
// Transformeer de code naar een while en een do-while loop
//
// int [] list = new int [5];
//
//for (int i = 0; i < 5; i++) {
//      list [i] = i + 2;
//}
public class Ass4WhileAndDoWhileLoop {
    public static void main(String[] args) {

         int [] list1 = new int [5];

for (int i = 0; i < 5; i++) {
      list1 [i] = i + 2;
}
        for (int i: list1
             ) {
            System.out.print(i);
        }
        System.out.println("");

        int [] list2 = new int [5];
        int count1 = 0;
        while(count1<5){
            list2 [count1] = count1 + 2;
            count1++;
        }
        for (int i: list2
        ) {
            System.out.print(i);
        }
        System.out.println(" ");

        int [] list3 = new int [5];
        int count2 = 0;
        do{
            list3 [count2] = count2 + 2;
            count2++;
        }
        while(count2<5);

        for (int i: list3
        ) {
            System.out.print(i);
        }

    }
}
