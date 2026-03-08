package MENU;

import CHARACTER.Player;
import UTILITY.Utility;
import MATCH.*;

import java.util.Scanner;

/**
 * Manages the specific menu for the active game chapter.
 * <p>
 * This class acts as the bridge between the high-level start menu and the
 * actual gameplay matches, allowing players to start their journey or
 * check chapter-specific progress.
 */

public class ChapterMenu{

    /**
     * Displays the chapter navigation menu and processes user actions.
     * <p>
     * Provides options to begin the match, view current chapter information,
     * or inspect character statistics.
     *
     * @param p the {@link Player} instance currently progressing through the story
     */

    public static void chapterMenu(Player p){

        while(true){

            Utility.clearScreen();

            System.out.println("Welcome " + p.name + " To Forest of Shadows");
            System.out.println();
            System.out.print("1. Start Journey\n2. See Current Chapter\n3. Stats\n4. Exit\n\n");
            Scanner input = new Scanner(System.in);

            int choice = Utility.getIntInput("Enter Your Choice: ", 1, 4);

            if(choice==1){

                Utility.clearScreen();
                ChapterOne.chapterOneMenu(p);
                Utility.pressToContinue(input);

            } else if(choice==2){

                Utility.clearScreen();
                ChapterList.getChapterInfo(p.chapter);
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