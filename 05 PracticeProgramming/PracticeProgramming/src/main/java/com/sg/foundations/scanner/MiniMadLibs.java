package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        
        // Declare variables
        String nounOne, nounTwo, adjectiveOne, adjectiveTwo, pluralNounOne,
                pluralNounTwo, pluralNounThree, verbOne, verbTwo;
        int number;
        
        // Initialise scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Print questions
        System.out.println("I need a noun:");
        nounOne = myScanner.nextLine();
        System.out.println("Now an adjective:");
        adjectiveOne = myScanner.nextLine();
        System.out.println("Another noun:");
        nounTwo = myScanner.nextLine();
        System.out.println("And a number:");
        number = Integer.parseInt(myScanner.nextLine());
        System.out.println("Another adjective:");
        adjectiveTwo = myScanner.nextLine();
        System.out.println("A plural noun:");
        pluralNounOne = myScanner.nextLine();
        System.out.println("Another one:");
        pluralNounTwo = myScanner.nextLine();
        System.out.println("One more:");
        pluralNounThree = myScanner.nextLine();
        System.out.println("A verb (infinitive form):");
        verbOne = myScanner.nextLine();
        System.out.println("Same verb (past participle):");
        verbTwo = myScanner.nextLine();
        
        // Print results
        System.out.println("*** NOW LET'S GET MAD (libs) ***");
        System.out.println(nounOne + ": the " + adjectiveOne + " frontier."
                + " These are the voyages of the starship " + nounTwo + "." +
                "\nIt's " + number + "-year mission: to explore strange " +
                adjectiveTwo + " " + pluralNounOne + ", to seek out " +
                adjectiveTwo + " " + pluralNounTwo + "\nand " +
                adjectiveTwo + " " + pluralNounThree + ", to boldly " +
                verbOne + " where no one has " + verbTwo + " before.");
    }
}
