package ap.helloworld;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        // Declare variables
        int sum;
        int operand1;
        int operand2;
        String stringOperand1;
        String stringOperand2;
        
        // Initialise scanner object
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter the first number to be added: ");
        stringOperand1 = myScanner.nextLine();
        
        System.out.println("Please enter the second number to be added: ");
        stringOperand2 = myScanner.nextLine();
        
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        sum = operand1 + operand2;
        
        System.out.println("Sum is: " + sum);
    }
}
