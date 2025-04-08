// IT-145 Found in App Development
// 14-2-2024
import java.util.Scanner;


public class Paint2 {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scnr = new Scanner(System.in);
        // Declare variables to store wall dimensions, wall area, paint needed, and cans needed
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        // Constants for conversion factors
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();


        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block

        cansNeeded = Math.ceil(gallonsPaintNeeded); // Round up to the nearest integer
        System.out.println("Cans needed: " + cansNeeded + " can(s)" );
    }
}
