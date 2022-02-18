package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        // Declare variables
        int counter = 1;
        boolean isClean = false;
        
        // Initialise random numbers
        Random rng = new Random();
        double randomValue;
        
        do {
            System.out.println("Clean your room!! (x" + counter + ")");
            
            randomValue = rng.nextDouble();
            if (randomValue < 0.1 * counter) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                isClean = true;
            }
            counter++;
            if (counter > 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!!"
                + " YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        } while(!isClean);
    }
}
