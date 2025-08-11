package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        int [][] Array1 ={ {20,50,10}, {80,25,15}, {60,100,35}, {40,75,45} };


        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1[i].length; j++) {

                System.out.print(Array1[i][j] + "\t");
            }

            System.out.println();
        }
    }
}