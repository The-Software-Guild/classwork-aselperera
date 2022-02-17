package com.sg.foundations.scanner;

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args) {
        // Declare variables
        String questionOne, questionTwo, questionThree, questionFour, answerOne, answerTwo, answerThree, answerFour;
        
        // Initialise
        questionOne = "1024 Gigabytes";
        questionTwo = "only planet that rotates clockwise";
        questionThree = "largest volcano ever";
        questionFour = "most abundant element in the atmostphere";
        
        // Set up scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Print questions
        System.out.println("What unit is equivalent to " + questionOne + "?");
        answerOne = myScanner.nextLine();
        System.out.println("Which planet is the " + questionTwo + " in our Solar System?");
        answerTwo = myScanner.nextLine();
        System.out.println("The " + questionThree + " discovered in our Solar System is located on which planet?");
        answerThree = myScanner.nextLine();
        System.out.println("What is the " + questionFour + "?");
        answerFour = myScanner.nextLine();
        
        // Print next section
        System.out.println("Wow, " + questionOne + " is a " + answerThree + "!");
        System.out.println("I didn't know that the " + questionThree + " was discovered on " + answerOne + "!");
        System.out.println("That's amazing that " + answerTwo + " is the " + questionFour + "...");
        System.out.println(answerFour + " is the " + questionTwo + ", neat!");
    }
}
