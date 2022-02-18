package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {
        // Initialise variables
        boolean isCorrect = false;
        int userNumber;
        
        // Generate random number
        Random rng = new Random();
        int aiNumber = rng.nextInt(201) - 100; // Range between -100 and 100
        
        // Initialise scanner
        Scanner userInput = new Scanner(System.in);
        
        // Print
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        
        // Control flow
        do {
            System.out.println("Your guess: ");
            userNumber = Integer.parseInt(userInput.nextLine());
            
            if (userNumber == aiNumber) {
                System.out.println("Wow, nice guess! That was it!");
                isCorrect = true;
            } else if (userNumber < aiNumber) {
                System.out.println("Ha, nice try - too low! Try again!\n");
            } else if (userNumber > aiNumber) {
                System.out.println("Ha, nice try - too high! Try again!\n");
            }
        } while (!isCorrect);
    }
}
