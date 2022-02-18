package com.sg.foundations.scanner;

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args) {
        // Declare variables
        int numberOne, numberTwo, numberThree, sum;
        
        // Initialise
        Scanner myScanner = new Scanner(System.in);
        
        // Print
        System.out.println("What is the first number you want to add?");
        numberOne = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the second number you want to add?");
        numberTwo = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the three number you want to add?");
        numberThree = Integer.parseInt(myScanner.nextLine());
        sum = numberOne + numberTwo + numberThree;
        System.out.println(numberOne + " + " + numberTwo + " + " + numberThree + " = " + sum);
    }
}
