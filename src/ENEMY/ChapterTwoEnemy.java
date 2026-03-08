package ENEMY;

import CHARACTER.Enemies;
import UTILITY.Utility;

import java.util.Random;
import java.util.Scanner;


/**
 * Factory class for spawning enemies specifically for Chapter 2.
 * <p>
 * This class contains the logic to randomly select and initialize
 * one of the various enemy archetypes found in the "Forest of Shadows."
 */

public class ChapterTwoEnemy {

    /**
     * Randomly selects and creates a new enemy instance.
     * <p>
     * The method uses a random number generator to pick from 14 different
     * enemy types, each with its own predefined health, attack, defense,
     * and XP reward values.
     *
     * @return a fully initialized {@link Enemies} object representing the encountered foe
     */

    public static Enemies createEnemy(){

        int numberOfEnemies = 14;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Enemies e = new Enemies();

        int randNum = rand.nextInt(numberOfEnemies);

        switch(randNum){
            case 0:{
                e = new Enemies("Deer", 50, 8, 3, 15);
                return e;
            }
            case 1:{
                e = new Enemies("WildDog", 55, 9, 3, 16);
                return e;
            }
            case 2:{
                e = new Enemies("SwampFrog", 45, 8, 2, 15);
                return e;
            }
            case 3:{
                e = new Enemies("Crab", 40, 7, 2, 14);
                return e;
            }
            case 4:{
                e = new Enemies("MangroveBird", 35, 6, 2, 12);
                return e;
            }
            case 5:{
                e = new Enemies("Panther", 70, 12, 5, 22);
                return e;
            }
            case 6:{
                e = new Enemies("Rhino", 75, 13, 6, 24);
                return e;
            }
            case 7:{
                e = new Enemies("Crocodile", 80, 14, 6, 26);
                return e;
            }
            case 8:{
                e = new Enemies("MagroveBandit", 65, 12, 5, 20);
                return e;
            }
            case 9:{
                e = new Enemies("WildBear", 75, 13, 6, 24);
                return e;
            }
            case 10:{
                e = new Enemies("SwampTroll", 95, 16, 8, 38);
                return e;
            }
            case 11:{
                e = new Enemies("DarkPanther", 90, 15, 7, 36);
                return e;
            }
            case 12:{
                e = new Enemies("GiantCrocodile", 100, 17, 9, 40);
                return e;
            }
            case 13:{
                e = new Enemies("OrcArcher", 85, 15, 8, 35);
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