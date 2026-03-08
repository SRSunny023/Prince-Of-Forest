package MENU;
import CHARACTER.Princes;
import CHARACTER.Player;
import java.util.Scanner;

import UTILITY.Utility;

/**
 * Handles the selection and initialization of the player's character.
 * <p>
 * This class contains the catalog of available prince archetypes and
 * manages the process of converting a selected archetype into a playable
 * {@link Player} instance.
 */

public class PrinceList{

    /**
     * Initializes an array with the predefined list of available prince archetypes.
     *
     * @param p the array of {@link Princes} to be populated with character data
     */

    public static void PrinceLists(Princes[] p){

        p[0] = new Princes("StoneHeart", 120, 15, 10, "BalancedAttack");
        p[1] = new Princes("MoonFire", 100, 20, 5, "FireSpell");
        p[2] = new Princes("WindRider", 110, 18, 8, "RapidStrike");
        p[3] = new Princes("BorIron", 140, 12, 15, "ShieldWall");
        p[4] = new Princes("LightFoot", 130, 14, 12, "HighXPGain");
        p[5] = new Princes("Shadarian", 100, 22, 6, "CriticalHit");
        p[6] = new Princes("Elaraden", 150, 12, 14, "HealingAura");
        p[7] = new Princes("RageBorn", 110, 25, 7, "RageAttack");
        p[8] = new Princes("StarShot", 115, 17, 9, "MultiShot");
        p[9] = new Princes("BawnBringer", 120, 12, 10, "HealingSpell");

    }




    /**
     * Prints the details of all available princes to the console.
     *
     * @param p       the array containing the prince archetypes
     * @param numOfP the total number of princes to display from the array
     */

    public static void printPrinces(Princes[] p, int numOfP){

        for(int i=0; i<numOfP; i++){
            System.out.println("Number: " + (i+1));
            p[i].displayPrinceInfo();
        }

    }




    /**
     * Orchestrates the character creation workflow.
     * <p>
     * This method displays the selection list, captures user input,
     * instantiates a new {@link Player} based on the choice, and
     * transitions the game to the {@link StartMenu}.
     */

    public static void createPrince(){

        Utility.clearScreen();

        int numberOfPrinces = 10;
        Princes[] princes = new Princes[numberOfPrinces];

        PrinceLists(princes);
        printPrinces(princes,numberOfPrinces);

        Scanner input = new Scanner(System.in);
        Player player = new Player("StoneHeart", 120, 15, 10, "BalancedAttack", 0, 0, 1, 0, 0, 0);

        int choice = Utility.getIntInput("Enter Your Choice: ", 1, 10);

        Utility.clearScreen();

        if(choice==1){
            player = new Player("StoneHeart", 120, 15, 10, "BalancedAttack", 0, 0, 1, 0, 0, 0);

        } else if(choice==2){
            player = new Player("MoonFire", 100, 20, 5, "FireSpell", 0, 0, 1, 0, 0, 0);

        } else if(choice==3){
            player = new Player("WindRider", 110, 18, 8, "RapidStrike", 0, 0, 1, 0, 0, 0);

        } else if(choice==4){
            player = new Player("BorIron", 140, 12, 15, "ShieldWall", 0, 0, 1, 0, 0, 0);

        } else if(choice==5){
            player = new Player("LightFoot", 130, 14, 12, "HighXPGain", 0, 0, 1, 0, 0, 0);

        } else if(choice==6){
            player = new Player("Shadarian", 100, 22, 6, "CriticalHit", 0, 0, 1, 0, 0, 0);

        } else if(choice==7){
            player = new Player("Elaraden", 150, 12, 14, "HealingAura", 0, 0, 1, 0, 0, 0);

        } else if(choice==8){
            player = new Player("RageBorn", 110, 25, 7, "RageAttack", 0, 0, 1, 0, 0, 0);

        } else if(choice==9){
            player = new Player("StarShot", 115, 17, 9, "MultiShot", 0, 0, 1, 0, 0, 0);

        } else if(choice==10){
            player = new Player("BawnBringer", 120, 12, 10, "HealingSpell", 0, 0, 1, 0, 0, 0);

        } else{
            System.out.println("Unexpected Error Happens!");
            Utility.pressToContinue(input);
            Utility.clearScreen();
        }

        System.out.println("Player Created Successfully!");
        System.out.println();
        System.out.println("Your Are Now " + player.name);
        System.out.println();
        Utility.pressToContinue(input);
        StartMenu.startMenu(player);

    }
}