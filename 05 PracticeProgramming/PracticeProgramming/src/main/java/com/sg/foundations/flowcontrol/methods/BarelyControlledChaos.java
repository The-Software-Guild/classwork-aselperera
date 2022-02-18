package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {
        
        // Set up random number
        Random rng = new Random();

        String colour = generateColour(rng);
        String animal = generateAnimal(rng);
        String colourAgain = generateColour(rng);
        int weight = generateNumber(rng, 5, 200); // with a range between 5 - 200
        int distance = generateNumber(rng, 10, 20); // with a range between 10 - 20
        int number = generateNumber(rng, 10000, 20000); // with a range between 10000 - 20000
        int time = generateNumber(rng, 2, 6); // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + colour + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colourAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    // Method 1: Generate colour
    public static String generateColour(Random rng) {
        String[] colours = {"red", "blue", "green", "yellow", "orange"};
        return colours[rng.nextInt(5)];
    }
    
    // Method 2: Generate animal
    public static String generateAnimal(Random rng) {
        String[] animals = {"platypus", "sealion", "eagle", "doplhin", "cat"};
        return animals[rng.nextInt(5)];
    }

    // Method 3: Generate number
    public static int generateNumber(Random rng, int min, int max) {
        return rng.nextInt(max-min+1) + min;
    }
}