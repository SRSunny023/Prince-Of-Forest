package UTILITY;

import java.util.Scanner;

/**
 * Provides general-purpose helper methods for console management and input validation.
 */

public class Utility{

    /**
     * Clears the console screen by printing multiple blank lines.
     */

    public static void clearScreen(){
        for(int i=0; i<30; i++){
            System.out.println();
        }
    }




    /**
     * Pauses program execution until the user presses the Enter key.
     *
     * @param input the {@link Scanner} object used to capture the user's keystroke
     */

    public static void pressToContinue(Scanner input){
        System.out.print("Press Any Key To Continue... ");
        input.nextLine();
        input.nextLine();
    }



    /**
     * Prompts the user for an integer and ensures it falls within a specific range.
     *
     * @param prompt the message displayed to the user
     * @param min    the minimum acceptable integer value
     * @param max    the maximum acceptable integer value
     * @return the valid integer entered by the user
     */

    public static int getIntInput(String prompt, int min, int max){
        Scanner input = new Scanner(System.in);
        int choice;
        while(true){
            try{
                System.out.print(prompt);
                choice = input.nextInt();
                if(choice<min || choice>max){
                    System.out.println("Invalid Input! Choose Between (" + min + " - " + max + " )");
                    pressToContinue(input);
                } else{
                    return choice;
                }
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                pressToContinue(input);
            }
        }
    }




    /**
     * Prompts the user for an integer and ensures it matches one of four specific options.
     * This is primarily used for directional movement choices.
     *
     * @param prompt the message displayed to the user
     * @param a      the first valid option
     * @param b      the second valid option
     * @param c      the third valid option
     * @param d      the fourth valid option
     * @return the valid integer matching one of the four options
     */

    public static int getDirectionInput(String prompt, int a, int b, int c, int d){
        Scanner input = new Scanner(System.in);
        int choice;
        while(true){
            try{
                System.out.print(prompt);
                choice = input.nextInt();
                if(choice!=a && choice!=b && choice!=c && choice!=d){
                    System.out.println("Invalid Input! Choose " + a + ", " + b + ", " + c + " or " + d);
                    pressToContinue(input);
                } else{
                    return choice;
                }
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                pressToContinue(input);
            }
        }
    }
}