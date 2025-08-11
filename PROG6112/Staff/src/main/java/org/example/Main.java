package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current staff number: ");
        int staffNumber = sc.nextInt();
        System.out.println("Enter the staff hiring location: ");
        String staffLocation = sc.next();

        StaffHiring hiring = new StaffHiring(staffNumber,staffLocation);

        hiring.PrintStaffHiringProces
    s();
    }
}