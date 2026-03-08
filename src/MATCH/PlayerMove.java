package MATCH;

import UTILITY.Utility;
import java.util.Scanner;

/**
 * The {@code PlayerMove} class provides functionality to move a player
 * within the forest grid in the Prince-Of-Forest game.
 * The player can move in four directions: North, South, East, and West.
 * The class ensures that the player does not move outside the forest boundaries.
 */

public class PlayerMove {

    /**
     * Updates the player's position based on user input.
     * This method repeatedly prompts the player to choose a direction (North, South, East, West)
     * until a valid move is made within the forest boundaries (0 to 6 for both X and Y coordinates).
     *
     * @param pos an array of length 2 representing the player's current position;
     *            {@code pos[0]} is the X-coordinate, {@code pos[1]} is the Y-coordinate.
     *            After the method executes, {@code pos} is updated with the new position.
     */

    public static void playerMove(int[] pos){

        int newX = pos[0];
        int newY = pos[1];

        while(true){

            System.out.println("Where you Want to Move? North, South, East, West?");
            System.out.print("8 = North\t2 = South\t4 = West\t6 = East\n\n");

            Scanner input = new Scanner(System.in);
            int choice = Utility.getDirectionInput("Enter Your Choice: ", 2, 4, 6, 8);

            if(choice==2)       newY+=1;
            else if(choice==4)  newX-=1;
            else if(choice==6)  newX+=1;
            else if(choice==8)  newY-=1;
            else{
                System.out.println("Unexpected Error Happens!");
                Utility.pressToContinue(input);
                Utility.clearScreen();
                break;
            }

            if(newX<0 || newX>6 || newY<0 || newY>6){
                System.out.println("You cannot move outside the forest!");
                Utility.pressToContinue(input);
                newX = pos[0];
                newY = pos[1];
            } else{
                break;
            }
        }
        pos[0] = newX;
        pos[1] = newY;
    }
}