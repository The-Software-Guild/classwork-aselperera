package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        // Initialise variables
        int userInput;
        int fizzBuzzCounter = 0;

        // Initialise scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        userInput = Integer.parseInt(myScanner.nextLine());
        
        // Fizz-buzz loop
        for (int i = 0; fizzBuzzCounter < userInput; i++) {
            
            if (i % 3 == 0 && i % 5 == 0 && i > 0) {
                System.out.println("fizz buzz");
                fizzBuzzCounter++;
            } else if (i % 3 == 0 && i > 0) {
                System.out.println("fizz");
                fizzBuzzCounter++;
            } else if (i % 5 == 0 && i > 0) {
                System.out.println("buzz");
                fizzBuzzCounter++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!!!");
    }
}
