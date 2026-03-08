package MATCH;

import MAP.ChapterOneMap;
import CHARACTER.*;
import UTILITY.Utility;
import ENEMY.ChapterOneEnemy;
import STORY.Story;
import FIGHT.*;

import java.util.Random;
import java.util.Scanner;

/**
 * Orchestrates the gameplay logic for the first chapter, "Forest of Shadows".
 * <p>
 * This class manages the exploration loop, movement tracking on the 2D map,
 * and triggers events such as combat, traps, and rewards based on player position.
 */

public class ChapterOne{

    /**
     * Runs the main gameplay loop for Chapter 1.
     * <p>
     * Initializes the player's starting position, handles directional movement
     * input, and resolves tile-based events until the player reaches the exit
     * or their health reaches zero.
     *
     * @param p the {@link Player} instance participating in the match
     */

    public static void chapterOneMenu(Player p){

        Scanner input = new Scanner(System.in);

        Story.showChapter1Story(p);
        System.out.println();

        Utility.pressToContinue(input);

        ChapterOneMap.chapterOneMap();

        int xPos = 3;
        int yPos = 3;

        ChapterOneMap.printEmptyMap(xPos, yPos);

        System.out.println();

        Random rand = new Random();

        boolean isRunning = true;

        while(isRunning){

            System.out.println("Where you Want to Move? North, South, East, West?");
            System.out.print("8 = North\t2 = South\t4 = West\t6 = East\n\n");

            int choice = Utility.getDirectionInput("Enter Your Choice: ", 2, 4, 6, 8);

            if(choice==2)       yPos+=1;
            else if(choice==4)  xPos-=1;
            else if(choice==6)  xPos+=1;
            else if(choice==8)  yPos-=1;
            else{
                System.out.println("Unexpected Error Happens!");
                Utility.pressToContinue(input);
                Utility.clearScreen();
            }

            Utility.clearScreen();

            String tile = ChapterOneMap.chapOneMap[yPos][xPos];
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
                        } else if(randR==1){
                            p.hp+=randNum;
                            System.out.println("HP Added: " + randNum);
                        } else if(randR==2){
                            p.atk+=randNum;
                            System.out.println("ATK Added: " + randNum);
                        } else{
                            p.xp+=randNum;
                            System.out.println("XP Added: " + randNum);
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
                    break;
                }

                case "O":{
                    Enemies e = ChapterOneEnemy.createEnemy();
                    Story.enemyAppearStory(e);
                    e.displayEnemiesInfo();
                    Utility.pressToContinue(input);
                    Fight.fightEnemy(p,e);
                    Utility.pressToContinue(input);
                    break;
                }

                case "E":{
                    System.out.println("END");
                    Enemies e = new Enemies("Lion", 100, 17, 10, 80);
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

            //ChapterOneMap.printChapOneMap(xPos,yPos);

            ChapterOneMap.printEmptyMap(xPos,yPos);
            System.out.println();
            System.out.println();
            p.printStats();

            if(p.hp<=0){
                System.out.println("Game Over! You Have Failed To Escape The Forest of Shadows");
                p.resetStats();
                return;
            }
        }

        System.out.println("The prince finally reaches the edge of the dark forest.");
        System.out.println("The shadows slowly fade as sunlight breaks through the trees.");
        System.out.println();
        System.out.println("After countless traps and enemies, Prince " + p.name);
        System.out.println("has survived the Forest of Shadows.");
        System.out.println();
        System.out.println("In the distance, he sees the ruins of an ancient temple.");
        System.out.println("A cold wind whispers...");
        System.out.println("\"Your journey has only begun...\"");
        System.out.println();
        System.out.println("=== Chapter 1 Complete ===\n");
        p.chapter+=1;
        Utility.pressToContinue(input);
    }
}