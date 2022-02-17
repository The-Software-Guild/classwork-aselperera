package com.sg.foundations.scanner;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {
        // Variables
        int miles, hotDogs, languages;

        // Initialise scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Print
        System.out.println("How many miles can you run?");
        miles = Integer.parseInt(myScanner.nextLine());
        System.out.println("What, that's it? I can run " + (miles*2+1) + " miles.");
        System.out.println("\nHow many hot dogs can you eat?");
        hotDogs = Integer.parseInt(myScanner.nextLine());
        System.out.println("Amateur hour. I can eat " + (hotDogs*2+1) + " hot dogs.");
        System.out.println("\nHow many languages do you know?");
        languages = Integer.parseInt(myScanner.nextLine());
        System.out.println("Well, I know " + (languages*2+1) + " languages. Pathetic!");
    }
}
