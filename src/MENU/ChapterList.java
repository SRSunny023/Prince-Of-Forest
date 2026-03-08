package MENU;

/**
 * Provides a catalog of game chapters and their corresponding enemy statistics.
 * <p>
 * This class is used to display data tables for different game stages,
 * including HP, Attack, Defense, and XP rewards for all enemies found in those areas.
 */

public class ChapterList{

    /**
     * Prints a formatted table of enemies and statistics for Chapter 1: Forest of Shadows.
     */

    public static void printChapterOne(){

        System.out.print("Chapter-1: Forest of Shadows\n\n");

        System.out.print("Enemy\t\t\tHP\t\t\tATK\t\t\tDEF\t\t\tXP\n");

        System.out.print("Goblin\t\t\t45\t\t\t7\t\t\t2\t\t\t10\nWildCat\t\t\t40\t\t\t8\t\t\t3\t\t\t9\n");
        System.out.print("WildPup\t\t\t35\t\t\t6\t\t\t2\t\t\t8\nForestRabbit\t25\t\t\t5\t\t\t1\t\t\t6\n");
        System.out.print("ForestSnake\t\t30\t\t\t6\t\t\t2\t\t\t7\nBandIt\t\t\t65\t\t\t11\t\t\t4\t\t\t16\n");
        System.out.print("BullDog\t\t\t70\t\t\t10\t\t\t5\t\t\t15\nWolf\t\t\t75\t\t\t12\t\t\t4\t\t\t17\n");
        System.out.print("GoblinArcher\t60\t\t\t11\t\t\t3\t\t\t14\nForestBearCub\t85\t\t\t13\t\t\t6\t\t\t20\n");
        System.out.print("ForestTroll\t\t95\t\t\t14\t\t\t7\t\t\t24\nDarkGoblin\t\t90\t\t\t13\t\t\t6\t\t\t22\n");
        System.out.print("ShadowWolf\t\t95\t\t\t14\t\t\t7\t\t\t23\nForestOgre\t\t99\t\t\t15\t\t\t9\t\t\t28\n");
        System.out.print("WildBoar\t\t99\t\t\t16\t\t\t8\t\t\t27\nLion\t\t\t100\t\t\t17\t\t\t10\t\t\t30\n");

        System.out.println();

    }

    /**
     * Prints a formatted table of enemies and statistics for Chapter 2: Mangrove Forest.
     */

    public static void printChapterTwo(){

        System.out.print("Chapter-2: Mangrove Forest\n\n");

        System.out.print("Enemy\t\t\tHP\t\t\tATK\t\t\tDEF\t\t\tXP\n");

        System.out.print("Deer\t\t\t50\t\t\t8\t\t\t3\t\t\t15\nWildDog\t\t\t55\t\t\t9\t\t\t3\t\t\t16\n");
        System.out.print("SwampFrog\t\t45\t\t\t8\t\t\t2\t\t\t15\nCrab\t\t\t40\t\t\t7\t\t\t2\t\t\t14\n");
        System.out.print("MangroveBird\t35\t\t\t6\t\t\t2\t\t\t12\nPanther\t\t\t70\t\t\t12\t\t\t5\t\t\t22\n");
        System.out.print("Rhino\t\t\t75\t\t\t13\t\t\t6\t\t\t24\nCrocodile\t\t80\t\t\t14\t\t\t6\t\t\t26\n");
        System.out.print("MangroveBandit\t65\t\t\t12\t\t\t5\t\t\t20\nWildBear\t\t75\t\t\t13\t\t\t6\t\t\t24\n");
        System.out.print("SwampTroll\t\t95\t\t\t16\t\t\t8\t\t\t38\nDarkPanther\t\t90\t\t\t15\t\t\t7\t\t\t36\n");
        System.out.print("GiantCrocodile\t100\t\t\t7\t\t\t9\t\t\t40\nOrcArcher\t\t85\t\t\t15\t\t\t8\t\t\t35\n");
        System.out.print("MangroveOgre\t110\t\t\t18\t\t\t10\t\t\t50\nTiger\t\t\t115\t\t\t20\t\t\t12\t\t\t55\n");

        System.out.println();

    }

    /**
     * Determines which chapter information to display based on the player's current progress.
     *
     * @param chapter the current chapter number reached by the player
     */

    public static void getChapterInfo(int chapter){
        if(chapter==1){
            printChapterOne();
        } else if(chapter==2){
            printChapterTwo();
        }
    }




    /**
     * Displays a full list of all available chapters and their enemy data.
     */

    public static void chapterListMenu(){
        printChapterOne();
        printChapterTwo();
    }
}