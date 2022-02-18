package ap.factorizer;

import java.util.Scanner;
import java.util.Arrays;

public class Factorizer {
    public static void main(String[] args) {
        // Declare variables
        int userInput;
        int[] factors = new int[0];
        int factorsSum = 0;
        
        // Initialise scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Ask for user input
        System.out.println("What number would you like to factor? ");
        userInput = Integer.parseInt(myScanner.nextLine());
        
        // Factors
        System.out.println("The factors of " + userInput + " are:");
        for (int i = 1; i < userInput; i++) {
            if (userInput % i == 0) {
                factors = Arrays.copyOf(factors, factors.length+1);
                factors[factors.length - 1] = i;
                factorsSum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + userInput + " has " + factors.length + " factors.");
        
        // Perfect number
        if (factorsSum == userInput) {
            System.out.println(userInput + " is a perfect number.");
        } else {
            System.out.println(userInput + " is not a perfect number.");
        }
        
        // Prime number
        if (factors.length == 2) {
            System.out.println(userInput + " is a prime number.");
        } else {
            System.out.println(userInput + " is not a prime number.");
        }
    }
}
