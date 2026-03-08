package ENEMY;

import CHARACTER.Enemies;
import UTILITY.Utility;

import java.util.Scanner;
import java.util.Random;


/**
 * Factory class for spawning enemies specifically for Chapter 1.
 * <p>
 * This class contains the logic to randomly select and initialize
 * one of the various enemy archetypes found in the "Forest of Shadows."
 */

public class ChapterOneEnemy{

    /**
     * Randomly selects and creates a new enemy instance.
     * <p>
     * The method uses a random number generator to pick from 15 different
     * enemy types, each with its own predefined health, attack, defense,
     * and XP reward values.
     *
     * @return a fully initialized {@link Enemies} object representing the encountered foe
     */

    public static Enemies createEnemy(){

        int numberOfEnemies = 16;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Enemies e = new Enemies();

        int randNum = rand.nextInt(numberOfEnemies-1);

        switch(randNum){
            case 0:{
                e = new Enemies("Goblin", 50, 10, 3, 20);
                return e;
            }
            case 1:{
                e = new Enemies("WildCat", 45, 8, 12, 18);
                return e;
            }
            case 2:{
                e = new Enemies("WildPup", 40, 7, 2, 15);
                return e;
            }
            case 3:{
                e = new Enemies("ForestRabbit", 30, 5, 1, 10);
                return e;
            }
            case 4:{
                e = new Enemies("ForestSnake", 35, 6, 2, 12);
                return e;
            }
            case 5:{
                e = new Enemies("BandIt", 70, 15, 5, 30);
                return e;
            }
            case 6:{
                e = new Enemies("BullDog", 75, 12, 6, 28);
                return e;
            }
            case 7:{
                e = new Enemies("Wolf", 80, 14, 5, 32);
                return e;
            }
            case 8:{
                e = new Enemies("GoblinArcher", 65, 13, 4, 25);
                return e;
            }
            case 9:{
                e = new Enemies("ForestBearCub", 85, 16, 7, 35);
                return e;
            }
            case 10:{
                e = new Enemies("ForestTroll", 110, 20, 10, 50);
                return e;
            }
            case 11:{
                e = new Enemies("DarkGoblin", 100, 18, 8, 45);
                return e;
            }
            case 12:{
                e = new Enemies("ShadowWolf", 105, 19, 9, 48);
                return e;
            }
            case 13:{
                e = new Enemies("ForestOgre", 115, 21, 11, 55);
                return e;
            }
            case 14:{
                e = new Enemies("WildBoar", 95, 17, 7, 42);
                return e;
            }
            default:{

                System.out.println("Unexpected Error Happens!");
                Utility.pressToContinue(input);
                Utility.clearScreen();

            }
        }
        return e;
    }

}