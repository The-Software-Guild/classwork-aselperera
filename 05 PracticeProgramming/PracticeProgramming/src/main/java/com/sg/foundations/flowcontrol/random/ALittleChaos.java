package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {

    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(51) + 50 + ", "); // Formerly nextInt(101)
        System.out.print(randomizer.nextInt(51) + 50 + ", "); // nextInt(51) means numbers will be generated between 0 and 50
        System.out.print(randomizer.nextInt(51) + 50 + ", "); // +50 means these numbers will be shifted to betwen 50 and 100
        System.out.print(randomizer.nextInt(51) + 50 + ", "); // We are only generating random numbers between 50 and 100
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.println(randomizer.nextInt(51) + 50); // You can include random numbers in a math statement
    }
}