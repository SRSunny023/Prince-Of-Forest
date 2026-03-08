package FIGHT;
import CHARACTER.*;
import UTILITY.Utility;
import java.util.Scanner;
import java.util.Random;


/**
 * Handles the turn-based combat mechanics between the player and enemies.
 * <p>
 * This class processes damage calculations, status effects from potions,
 * and escape attempts based on randomized logic.
 */

public class Fight{

    /**
     * Executes a battle sequence between a player and an enemy.
     * <p>
     * The battle continues in a loop until the {@link Player} or the
     * {@link Enemies} instance reaches zero health, or the player successfully flees.
     *
     * @param p the player character engaging in the fight
     * @param e the enemy creature being fought
     */

    public static void fightEnemy(Player p, Enemies e){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        while(true){
            if(p.hp<=0){
                break;
            }
            if(e.hp<=0){
                System.out.println("You Successfully Defeated " + e.name);
                p.xp+=e.xp;
                System.out.println("You have awarded: " + e.xp + " XP!");

                int oldLevel = p.lvl;

                if(p.xp>=1800)      p.lvl = 10;
                else if(p.xp>=1370) p.lvl = 9;
                else if(p.xp>=1020) p.lvl = 8;
                else if(p.xp>=740)  p.lvl = 7;
                else if(p.xp>=520)  p.lvl = 6;
                else if(p.xp>=350)  p.lvl = 5;
                else if(p.xp>=220)  p.lvl = 4;
                else if(p.xp>=120)  p.lvl = 3;
                else if(p.xp>=50)   p.lvl = 2;
                else if(p.xp>=20)   p.lvl = 1;
                else                p.lvl = 0;

                if(p.lvl>oldLevel){
                    int levelUpBonus = rand.nextInt(7) + 4;
                    p.hp += levelUpBonus;
                    System.out.println("Congratulations! You reached Level " + p.lvl + " and gained " + levelUpBonus + " bonus HP!");
                }

                int randHP = rand.nextInt(9)+1;
                p.hp+=randHP;
                System.out.println("You have awarded: " + randHP + " HP!");
                break;
            }
            Utility.clearScreen();
            System.out.print("1. Sword Strike\n2. Power Slash\n3. Royal Guard\n4. Use Heal Portion\n5. Use Attack Portion\n6. Use Defence Portion\n7. Run\n\n");
            int choice = Utility.getIntInput("Enter Your Choice: ", 1, 7);
            switch(choice){
                case 1:{
                    int userFinalHit = rand.nextInt(p.atk + 1 )-rand.nextInt((e.def/2) + 1);
                    int enemyFinalHit = rand.nextInt(e.atk + 1)-rand.nextInt((p.def/2) + 1);
                    if(userFinalHit<0)  userFinalHit = 0;
                    if(enemyFinalHit<0) enemyFinalHit = 0;
                    p.hp-=enemyFinalHit;
                    e.hp-=userFinalHit;
                    System.out.println(p.name + " Attack: " + userFinalHit);
                    System.out.println(e.name + " Attack: " + enemyFinalHit);
                    System.out.println();
                    System.out.println(p.name + "HP: " + p.hp);
                    System.out.println(e.name + "HP: " + e.hp);
                    System.out.println();
                    Utility.pressToContinue(input);
                    break;
                }
                case 2:{
                    int userFinalHit = rand.nextInt(p.atk + 5)-rand.nextInt((e.def/2) + 1);
                    int enemyFinalHit = rand.nextInt(e.atk + 1)-rand.nextInt((p.def/2) + 2);
                    if(userFinalHit<0)  userFinalHit = 0;
                    if(enemyFinalHit<0) enemyFinalHit = 0;
                    p.hp-=enemyFinalHit;
                    e.hp-=userFinalHit;
                    System.out.println(p.name + " Attack: " + userFinalHit);
                    System.out.println(e.name + " Attack: " + enemyFinalHit);
                    System.out.println();
                    System.out.println(p.name + "HP: " + p.hp);
                    System.out.println(e.name + "HP: " + e.hp);
                    System.out.println();
                    Utility.pressToContinue(input);
                    break;
                }
                case 3:{
                    int enemyFinalHit = rand.nextInt(e.atk + 1) - rand.nextInt(p.def + 3);
                    if(enemyFinalHit<0) enemyFinalHit = 0;
                    p.hp-=enemyFinalHit;
                    System.out.println("Ops, You got " + enemyFinalHit + " damaged by " + e.name);
                    System.out.println();
                    System.out.println(p.name + "HP: " + p.hp);
                    System.out.println(e.name + "HP: " + e.hp);
                    System.out.println();
                    Utility.pressToContinue(input);
                    break;
                }
                case 4:{
                    if(p.healPortion>0){
                        p.hp+=10;
                        System.out.print("You Have Drinked The Heal Portion ");
                        System.out.println("And Your HP Increased By 10");
                        p.healPortion-=1;
                        Utility.pressToContinue(input);
                    } else{
                        System.out.println("Unfortunately You Have No Heal Portion to Use");
                        Utility.pressToContinue(input);
                    }
                    break;
                }
                case 5:{
                    if(p.attackPortion>0){
                        p.atk+=2;
                        System.out.print("You Have Drinked The Attack Portion ");
                        System.out.println("And Your Attack Increased By 2");
                        p.attackPortion-=1;
                        Utility.pressToContinue(input);
                    } else{
                        System.out.println("Unfortunately You Have No Attack Portion to Use");
                        Utility.pressToContinue(input);
                    }
                    break;
                }
                case 6:{
                    if(p.defPortion>0){
                        p.def+=2;
                        System.out.print("You Have Drinked The Defence Portion ");
                        System.out.println("And Your Defence Increased By 2");
                        p.defPortion-=1;
                        Utility.pressToContinue(input);
                    } else{
                        System.out.println("Unfortunately You Have No Defence Portion to Use");
                        Utility.pressToContinue(input);
                    }
                    break;
                }
                case 7:{
                    int randNum = rand.nextInt(5);
                    if(randNum==0){
                        System.out.println("You Successfully Run Away From The Enemy!");
                        Utility.pressToContinue(input);
                        return;
                    } else{
                        int randDamage = rand.nextInt(e.atk+1);
                        p.hp-=randDamage;
                        System.out.println("You Failed to Run Away and got damaged " + randDamage + " HP");
                    }
                    Utility.pressToContinue(input);
                    break;
                }
                default:{
                    System.out.println("Unexpected Error Happens!");
                    Utility.pressToContinue(input);
                    Utility.clearScreen();
                }
            }
        }
    }
}