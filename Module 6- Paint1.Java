// IT 145
import java.util.Scanner;
import java.util.InputMismatchException;

public class Paint1 {
    // Declaring the attributes
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        // Constant variable: square feet per gallon of paint
        final double squareFeetPerGallons = 350.0;
        
        // Loop to validate user input for wall height
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                if(wallHeight <= 0.0) {
                    System.out.println("Invalid Height\n");
                }        
            }
            catch(InputMismatchException e) {
                // Handle InputMismatchException if non-numeric input is entered
                System.out.println("Invalid Input\n");
                scnr.next();
            }
        } while(wallHeight <= 0.0);
        
        // Loop to validate user input for wall width
        do {
            try {       
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
                if(wallWidth <= 0.0) {
                    System.out.println("Invalid Width\n");
                }
            }
            catch(InputMismatchException e) {
                // Handle InputMismatchException if non-numeric input is entered
                System.out.println("Invalid Input\n");
                scnr.next();
            }
        } while(wallWidth <= 0.0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
    }
}
