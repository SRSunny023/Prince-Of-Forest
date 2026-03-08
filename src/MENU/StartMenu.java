package MENU;

import CHARACTER.Player;
import UTILITY.Utility;

import java.util.Scanner;

/**
 * Manages the transition between the initial game launch and gameplay.
 * <p>
 * This class provides the primary interface for players after character creation,
 * allowing access to game chapters, character statistics, and exit options.
 */

public class StartMenu{

    /**
     * Displays the post-main-menu start screen and handles navigation.
     * <p>
     * This method runs an infinite loop that allows the player to start the
     * adventure, view unlocked chapters, or inspect their {@link Player} stats.
     *
     * @param p the {@link Player} instance whose progress and stats are being managed
     */

    public static void startMenu(Player p){

        while(true){

            Utility.clearScreen();

            System.out.println("Welcome " + p.name + " to Prince of Forest!");
            System.out.println();

            System.out.print("1. Start\n2. Chapters\n3. Stats\n4. Exit\n\n");
            Scanner input = new Scanner(System.in);

            int choice = Utility.getIntInput("Enter Your Choice: ", 1, 4);

            if(choice==1){
                ChapterMenu.chapterMenu(p);
                Utility.pressToContinue(input);

            } else if(choice==2){
                Utility.clearScreen();
                ChapterList.chapterListMenu();
                Utility.pressToContinue(input);

            } else if(choice==3){
                Utility.clearScreen();
                p.printStats();
                System.out.println();
                Utility.pressToContinue(input);

            } else if(choice==4){
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