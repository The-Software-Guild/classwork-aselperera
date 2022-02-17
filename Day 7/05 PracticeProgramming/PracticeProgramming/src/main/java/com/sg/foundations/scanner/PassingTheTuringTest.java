package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args){
        // Declare variables
        String userName, aiName, userColour, aiColour, userFood, aiFood;
        int userNumber, aiNumber;

        // Initialise variables
        aiName = "HAL";
        aiColour = "Cherry Red";
        aiFood = "cherries";
        aiNumber = -7;
        
        // Initialise scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Print
        System.out.println("Hello there!");
        System.out.println("What's your name?");
        userName = myScanner.nextLine();
        System.out.println("\nHi, " + userName + "! I'm " + aiName + ".");
        System.out.println("What's your favourite colour?");
        userColour = myScanner.nextLine();
        System.out.println("\nHuh, " + userColour + "? Mine's " + aiColour + ".");
        System.out.println("\nI really like " + aiFood + ". They're my favourite fruit, too.");
        System.out.println("What's your favourite fruit, " + userName + "?");
        userFood = myScanner.nextLine();
        System.out.println("\nReally? " + userFood + "? That's wild!");
        System.out.println("Speaking of favourites, what's your favourite number?");
        userNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println("\n" + userNumber + " is a cool number. Mine's " + aiNumber + ".");
        System.out.println("Did you know " + userNumber + " * " + aiNumber + " is " + userNumber*aiNumber + "? That's a cool number too!");
        System.out.println("\nWell, thanks for talking to me, " + userName + "!");
    }
}
