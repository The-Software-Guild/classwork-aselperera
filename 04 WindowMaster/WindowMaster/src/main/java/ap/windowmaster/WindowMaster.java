package ap.windowmaster;

import java.util.Scanner;

/**
 * @author aselperera
 */
public class WindowMaster {
    public static void main(String [] args) {
        // Declare variables
        float height;
        float width;
        float areaOfWindow;
        float perimeterOfWindow;
        float cost;
        float glassCost; // Per square foot; formerly 3.50
        float trimCost; // Per linear foot; formerly 2.25
        int numberOfWindows;
        
        // Initialise scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Get input from user
        try {
            System.out.println("Please enter the window height in feet: ");
            height = Float.parseFloat(myScanner.nextLine());
            System.out.println("Please enter the window width in feet: ");
            width = Float.parseFloat(myScanner.nextLine());
            System.out.println("Please enter the glass cost per sq foot: ");
            glassCost = Float.parseFloat(myScanner.nextLine());
            System.out.println("Please enter the trim cost per foot: ");
            trimCost = Float.parseFloat(myScanner.nextLine());
            System.out.println("Please enter the number of windows: ");
            numberOfWindows = Integer.parseInt(myScanner.nextLine());
            
            // Calculations
            areaOfWindow = height * width;
            perimeterOfWindow = 2 * (height + width);

            // Costs
            cost = numberOfWindows * glassCost * areaOfWindow + trimCost * perimeterOfWindow;

            // Display results to user
            System.out.println("Window height = " + height);
            System.out.println("Window width = " + width);
            System.out.println("Window area = " + areaOfWindow);
            System.out.println("Window perimeter = " + perimeterOfWindow);
            System.out.println("Total cost = " + cost);
            
        } catch(NumberFormatException ex) {
            System.out.println("Input could not be parsed into an integer");
        }
    }
}
