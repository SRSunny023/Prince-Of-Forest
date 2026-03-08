package MENU;

import UTILITY.Utility;

/**
 * Manages the primary application menus and global actions.
 * <p>
 * This class provides the top-level interface for the game, including
 * the main launch menu, developer information, and the exit routine.
 */

public class Menu {

    /**
     * Displays the initial splash screen and main navigation options.
     * <p>
     * This is the first screen the player sees upon running the application.
     */

    public static void mainMenu(){
        System.out.println("Welcome to Prince of Forest");
        System.out.print("1. Start\n2. About\n3. Exit\n\n");
    }




    /**
     * Displays game information, including developer credits and
     * a brief overview of the game's chapter structure.
     */

    public static void about(){
        Utility.clearScreen();
        System.out.println("Game Name: Prince of Forest");
        System.out.println("Developer: Siamur Rahman Sunny");
        System.out.println("Programming Language: Java");
        System.out.println();
        System.out.print("There are 5 Chapters. You Have to Complete Each Chapter One by One To Finish the Game\n");
        System.out.print("Every Chapter has its unique map, enemies etc.");
        System.out.println();
    }




    /**
     * Terminates the game session and closes the application.
     * <p>
     * This method displays a shutdown message and invokes {@link System#exit(int)}
     * to end the process.
     */

    public static void exit(){
        Utility.clearScreen();
        System.out.println("Prince of Forest Successfully Exitted!");
        System.exit(0);
    }
}