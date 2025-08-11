package org.example;


//imports
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    // make arraylist
        ArrayList<String> names = new ArrayList<String>();

        names.add("Lux");
        names.add("Anex");
        names.add("Sma"); //
        names.add("Nanka");
        names.add("Anitha"); //
        names.add("Ruth");
        names.add("Matt");

        //replace 2 names
        names.set(3, "Hope");
        names.set(5, "Mirad");


        //remove lux and matt
        names.remove("Lux");
        names.remove("Matt");


    }
}