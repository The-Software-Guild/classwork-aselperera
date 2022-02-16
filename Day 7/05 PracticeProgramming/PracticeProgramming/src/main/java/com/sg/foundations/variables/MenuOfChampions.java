package com.sg.foundations.variables;

public class MenuOfChampions {
    public static void main(String[] args) {
        // Declare variables
        String itemOne, itemTwo, itemThree;
        float priceOne, priceTwo, priceThree;
        
        // Initialise variables
        itemOne = "Idiot sandwich";
        priceOne = 500.00f;
        itemTwo = "Fish so raw it's still finding Nemo";
        priceTwo = 80.00f;
        itemThree = "Burnt ice cream";
        priceThree = 9.99f;
        
        // Formatting
        String indent = " ".repeat(12);
        
        // Print
        System.out.println("""
                           
                           .-"-.     .-"-.     .-"-.     .-"-.     .-"-.     .-"-.
                                "-.-"     "-.-"     "-.-"     "-.-"     "-.-"     "-.-"
                           """);
        System.out.println(indent + "WELCOME TO HELL'S KITCHEN RESTAURANT!");
        System.out.println(indent + "Today's Menu Is...");
        System.out.println("""
                           
                           .-"-.     .-"-.     .-"-.     .-"-.     .-"-.     .-"-.
                                "-.-"     "-.-"     "-.-"     "-.-"     "-.-"     "-.-"
                           """);
        System.out.println(indent + "£ " + String.format("%.02f", priceOne) + " *** " + itemOne);
        System.out.println(indent + "£ " + String.format("%.02f", priceTwo) + " **** " + itemTwo);
        System.out.println(indent + "£ " + String.format("%.02f", priceThree) + " ***** " + itemThree);
    }
}
