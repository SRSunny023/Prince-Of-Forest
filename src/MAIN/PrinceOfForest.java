package MAIN;

import UTILITY.Utility;
import MENU.Menu;
import MENU.PrinceList;

import java.util.Scanner;


/**
 * The entry point for the Prince of Forest application.
 * This class manages the primary application loop, handling navigation
 * between the main menu, character creation, and information screens.
 */

public class PrinceOfForest{

    /**
     * The main execution loop of the program.
     * Displays the main menu and processes user input to trigger specific
     * game actions like starting a new game, viewing the "About" section,
     * or exiting.
     *
     * @param args command-line arguments (not used)
     */

    public static void main(String[] args){

        while(true){

            Menu.mainMenu();

            int choice = Utility.getIntInput("Enter Your Choice: ", 1, 3);
            Scanner input = new Scanner(System.in);

            if(choice==1){

                PrinceList.createPrince();
                Utility.pressToContinue(input);
                Utility.clearScreen();

            } else if(choice==2){

                Menu.about();
                Utility.pressToContinue(input);
                Utility.clearScreen();

            } else if(choice==3){

                Menu.exit();

            } else{

                System.out.println("Unexpected Error Happens!");
                Utility.pressToContinue(input);
                Utility.clearScreen();
                break;

            }

        }

    }

}