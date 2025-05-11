/*****************************************************************
 * Ingredient Adjuster                                           *
 * This program calculates the amount of ingredients required    *
 * to make a specified number of cookies based on a standard     *
 * recipe.                                                       *
 *****************************************************************/

import java.util.Scanner;

public class IngredientAdjuster {

    /**************************************************************
     * Main Method                                                *
     * Prompts the user for the number of cookies to bake,        *
     * calculates the required ingredients, and displays the      *
     * amounts.                                                   *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Constant Declarations                                  *
        // Fixed values representing recipe ratios and batch size *
        //*********************************************************
        final double SUGAR_PER_BATCH = 1.5;       // Cups of sugar for 48 cookies
        final double BUTTER_PER_BATCH = 1.0;      // Cups of butter for 48 cookies
        final double FLOUR_PER_BATCH = 2.75;      // Cups of flour for 48 cookies
        final int COOKIES_PER_BATCH = 48;         // Standard batch size

        //*********************************************************
        // Variable Declarations                                  *
        // To store user input and calculated values              *
        //*********************************************************
        int desiredCookies;                      // User input for the number of cookies
        double sugarNeeded;                      // Calculated cups of sugar
        double butterNeeded;                     // Calculated cups of butter
        double flourNeeded;                      // Calculated cups of flour

        //*********************************************************
        // Input Section                                          *
        // Prompting the user to enter the desired number of      *
        // cookies to bake                                        *
        //*********************************************************
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number of cookies you want to make: ");
        desiredCookies = keyboardInput.nextInt();

        //*********************************************************
        // Calculation Section                                    *
        // Compute the required ingredients based on the ratio    *
        //*********************************************************
        sugarNeeded = (SUGAR_PER_BATCH / COOKIES_PER_BATCH) * desiredCookies;
        butterNeeded = (BUTTER_PER_BATCH / COOKIES_PER_BATCH) * desiredCookies;
        flourNeeded = (FLOUR_PER_BATCH / COOKIES_PER_BATCH) * desiredCookies;

        //*********************************************************
        // Output Section                                         *
        // Display the required amounts of each ingredient        *
        //*********************************************************
        System.out.println();
        System.out.printf("%-25s %.2f cups\n", "Sugar needed:", sugarNeeded);
        System.out.printf("%-25s %.2f cups\n", "Butter needed:", butterNeeded);
        System.out.printf("%-25s %.2f cups\n", "Flour needed:", flourNeeded);

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Resource Cleanup                                       *
        // Close the scanner to prevent resource leaks            *
        //*********************************************************
        keyboardInput.close();
        System.exit(0);
    }
}
