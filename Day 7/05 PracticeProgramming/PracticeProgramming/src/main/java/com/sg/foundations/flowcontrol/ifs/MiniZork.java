package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you live. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("In the blink of an eye, a set of dagger-like teeth close over your hand.");
                System.out.println("You pull back what remains of your limb, screaming in excruciating pain.");
                System.out.println("You bleed out on the spot and die.");
            }
        } else if (action.equals("go to the house")) {
            System.out.println("The house is dimly lit by candlelight and smells foul.");
            System.out.println("The smell appears to be emanating from a trapdoor in the floor.");
            System.out.println("Do you open the trapdoor or expore the rest of the house?");
            action = userInput.nextLine();
            
            if (action.equals("open the trapdoor")) {
                System.out.println("You walk down a flight of steps into a long, brightly lit tunnel.");
                System.out.println("You hear chanting at the end of the tunnel.");
                System.out.println("Do you walk down the tunnel or go back upstairs?");
                action = userInput.nextLine();
                
                if (action.equals("walk down the tunnel")) {
                    System.out.println("You pass a magical speaker playing the chanting.");
                    System.out.println("It appears to be for scaring people away. Unfazed you proceed.");
                    System.out.println("You come to a room overflowing with gold and celebrate!");
                } else if (action.equals("go back upstairs")) {
                    System.out.println("A sinister hooded figure appears at the top of the steps.");
                    System.out.println("Before you can reach for your dagger he grabs you by the throat.");
                    System.out.println("You are strangled to death.");
                }
                
            } else if (action.equals("explore the house")) {
                System.out.println("Suddenly a man appears behind you, cloaked in black.");
                System.out.println("Seeing another human being, you let your guard down.");
                System.out.println("In your moment of weakness, he hacks you to death.");
            }
        }
    }
}