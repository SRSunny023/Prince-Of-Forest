package MATCH;

import ENEMY.ChapterTwoEnemy;
import MAP.Map;
import CHARACTER.*;
import UTILITY.Utility;
import STORY.Story;
import FIGHT.*;

import java.util.Random;
import java.util.Scanner;

/**
 * Orchestrates the gameplay logic for the second chapter, "Mangrove Forest".
 * This class manages the exploration loop, movement tracking on the 2D map,
 * and triggers events such as combat, traps, and rewards based on player position.
 */

public class ChapterTwo{

    /**
     * Runs the main gameplay loop for Chapter 2.
     * Initializes the player's starting position, handles directional movement
     * input, and resolves tile-based events until the player reaches the exit
     * or their health reaches zero.
     *
     * @param p the {@link Player} instance participating in the match
     */

    public static void chapterTwoMenu(Player p){

        Scanner input = new Scanner(System.in);

        Story.showChapter2Story(p);
        System.out.println();

        Utility.pressToContinue(input);

        Map.chapterOneMap();

        int xPos = 3;
        int yPos = 3;

        Map.printEmptyMap(xPos, yPos);

        System.out.println();

        Random rand = new Random();

        boolean isRunning = true;

        while(isRunning){

            int[] pos = new int[2];

            pos[0] = xPos;
            pos[1] = yPos;

            PlayerMove.playerMove(pos);

            xPos = pos[0];
            yPos = pos[1];

            Utility.clearScreen();

            String tile = Map.chapOneMap[yPos][xPos];
            if(tile==null) tile = " ";

            switch(tile){
                case "R":{
                    int randR = rand.nextInt(4);

                    Story.rewardStory(randR);

                    int like = Utility.getIntInput("Do you want to pick it up? 1. Yes and 2. No: ", 1, 2);

                    if(like==1){
                        int randNum = rand.nextInt(10)+1;
                        if(randR==0){
                            p.def+=randNum;
                            System.out.println("DEF Added: " + randNum);
                            Map.chapOneMap[yPos][xPos] = null;
                        } else if(randR==1){
                            p.hp+=randNum;
                            System.out.println("HP Added: " + randNum);
                            Map.chapOneMap[yPos][xPos] = null;
                        } else if(randR==2){
                            p.atk+=randNum;
                            System.out.println("ATK Added: " + randNum);
                            Map.chapOneMap[yPos][xPos] = null;
                        } else{
                            p.xp+=randNum;
                            System.out.println("XP Added: " + randNum);
                            Map.chapOneMap[yPos][xPos] = null;
                        }
                        int randReward = rand.nextInt(6)+1;
                        if(randReward==1){
                            p.healPortion+=1;
                            System.out.println("You Have Got A Heal Portion");
                        } else if(randReward==2){
                            p.attackPortion+=1;
                            System.out.println("You Have Got A Attack Portion");
                        } else if(randReward==3){
                            p.defPortion+=1;
                            System.out.println("You Have Got A Defence Portion");
                        }
                        Utility.pressToContinue(input);
                    }
                    break;
                }

                case "T":{
                    int num = rand.nextInt(10)+1;
                    Story.trapStory(num,p);
                    Utility.pressToContinue(input);
                    Map.chapOneMap[yPos][xPos] = null;
                    break;
                }

                case "O":{
                    Enemies e = ChapterTwoEnemy.createEnemy();
                    Story.enemyAppearStory(e);
                    e.displayEnemiesInfo();
                    Utility.pressToContinue(input);
                    Fight.fightEnemy(p,e);
                    Utility.pressToContinue(input);
                    Map.chapOneMap[yPos][xPos] = null;
                    break;
                }

                case "E":{
                    System.out.println("END");
                    int randBoss = rand.nextInt(2);
                    Enemies e;
                    if(randBoss==0){
                        e = new Enemies("MangroveOgre", 110, 18, 10, 50);
                    } else{
                        e = new Enemies("Tiger", 115, 20, 12, 55);
                    }
                    Story.bossAppearStory(e);
                    e.displayEnemiesInfo();
                    Utility.pressToContinue(input);
                    Fight.fightEnemy(p,e);
                    Utility.pressToContinue(input);
                    if(p.hp>0){
                        isRunning = false;
                    }
                    break;
                }

                default:{
                    int randNumbers = rand.nextInt(10);
                    Story.emptyStory(randNumbers);
                    Utility.pressToContinue(input);
                }
            }

            Utility.clearScreen();

            Map.printEmptyMap(xPos,yPos);
            System.out.println();
            System.out.println();
            p.printStats();

            if(p.hp<=0){
                System.out.println("Game Over! You Have Failed To Escape The Mangrove Forest");
                p.resetStats();
                return;
            }
        }

        System.out.println("The prince finally escapes the deep waters of the mangrove.");
        System.out.println("The thick fog begins to clear as he steps onto solid ground.");
        System.out.println();

        System.out.println("After surviving deadly creatures and hidden dangers,");
        System.out.println("Prince " + p.name + " has conquered the Mangrove Forest.");
        System.out.println();

        System.out.println("Behind him, the swamp grows silent...");
        System.out.println("as if the forest itself was watching his every move.");
        System.out.println();

        System.out.println("Ahead, the land slowly transforms into dry sand");
        System.out.println("stretching endlessly under the blazing sun.");
        System.out.println("An ancient desert awaits beyond the horizon.");
        System.out.println();

        System.out.println("A distant voice echoes through the wind...");
        System.out.println("\"The trials are only getting harder...\"");
        System.out.println();

        System.out.println("=== Chapter 2 Complete ===\n");
        p.chapter+=1;
        Utility.pressToContinue(input);
    }
}