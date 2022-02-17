package com.sg.foundations.scanner;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        // Variables
        int age, maxHeartRate;
        float lowerZone, upperZone;
        
        // Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Print
        System.out.println("What is your age? ");
        age = Integer.parseInt(myScanner.nextLine());
        
        // Calculations
        maxHeartRate = 220 - age;
        lowerZone = 0.5f * maxHeartRate;
        upperZone = 0.85f * maxHeartRate;
        
        // Print
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + lowerZone + " - " + upperZone + " beats per minute.");
    }
}
