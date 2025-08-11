package org.example;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        int[][] numbers = {{8, 2, 5}, {5, 5, 3}, {7, 7, 2}, {8, 9, 10}, {7, 4, 3}, {7, 8, 9}};
        String[] place = {"Bathroom", "Kitchen", "Garden"};
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};


        System.out.print("--------------------------------------------------------------" + "\n");
        System.out.println("HOUSE MAKEOVER REPORT");
        System.out.print("--------------------------------------------------------------" + "\n");



        System.out.printf("%-10s%-10s%-10s%-10s\n", "     ", place[0], place[1], place[2]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%-10s", month[i]);
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%-10d", numbers[i][j]);
            }
            System.out.println();

        }

        System.out.print("--------------------------------------------------------------" + "\n");
        System.out.println("MONTHLY TOTALS");
        System.out.print("--------------------------------------------------------------" + "\n");

        for (int i = 0; i < month.length; i++) {
            int total = numbers[i][0] + numbers[i][1] + numbers[i][2];
            System.out.printf("\n" + "%-10s%-5s", month[i], total);
            if (total >= 15){
                System.out.printf("%-5s", "***");
            }
        }



    }
}

