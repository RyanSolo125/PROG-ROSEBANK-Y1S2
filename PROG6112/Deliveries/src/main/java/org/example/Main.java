package org.example;

public class Main {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar"};
        String[] years = {"Deliveries 2018", "Deliveries 2019", "Deliveries 2020"};
        int[][] deliveries = {
                {128, 135, 139},
                {155, 129, 175},
                {120, 130, 180}
        };

        System.out.print("-------------------------------------------------------------" + '\n');
        System.out.print("DELIVERIES MADE REPORT" + '\n');
        System.out.print("-------------------------------------------------------------" + '\n');

        System.out.printf("%-20s%-10s%-10s%-10s\n",
                " ", months[0], months[1], months[2]);

        for (int i = 0; i < deliveries.length; i++) {
            System.out.printf("%-20s", years[i]);
            for (int j = 0; j < deliveries[i].length; j++) {
                System.out.printf("%-10d", deliveries[i][j]);
            }
            System.out.println();
        }

        System.out.print("\n-------------------------------------------------------------" + '\n');
        System.out.print("YEARLY TOTALS" + '\n');
        System.out.print("-------------------------------------------------------------" + '\n');

        for (int i = 0; i < deliveries.length; i++) {
            int total = deliveries[i][0] + deliveries[i][1] + deliveries[i][2];
            System.out.printf("\n%-20s%-5s", years[i], total);

        }
    }
}
