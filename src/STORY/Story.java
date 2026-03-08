package STORY;

import CHARACTER.*;

import java.util.Random;

/**
 * Handles the narrative elements and environmental interactions of the game.
 * <p>
 * This class contains methods to display story chapters and text-based
 * events when the player interacts with different map tiles.
 */

public class Story {

    /**
     * Displays the introduction and objective for Chapter 1.
     *
     * @param p the {@link Player} object used to retrieve character details like name
     */

    public static void showChapter1Story(Player p) {

        System.out.println("======================================");
        System.out.println("           PRINCE OF FOREST           ");
        System.out.println("======================================");
        System.out.println("Chapter 1: Forest of Shadows");
        System.out.println();

        System.out.println("Prince " + p.name + ", heir of the Persian Empire,");
        System.out.println("was returning from a royal journey when");
        System.out.println("a mysterious storm surrounded his caravan.");
        System.out.println();

        System.out.println("When the storm ended, he found himself");
        System.out.println("alone in a strange forest.");
        System.out.println();

        System.out.println("This place is called the Forest of Shadows,");
        System.out.println("a cursed land filled with traps, enemies,");
        System.out.println("and forgotten treasures.");
        System.out.println();

        System.out.println("To escape, the prince must find the exit.");
        System.out.println("But something in the shadows is watching...");
        System.out.println();

        System.out.println("Objective: Reach the Exit (E) on the 7x7 map.");
        System.out.println("======================================");

    }




    /**
     * Prints a random atmospheric description when the player enters an empty area.
     *
     * @param num a random index determining which story flavor text to display
     */

    public static void emptyStory(int num){
        switch(num){
            case 0:
                System.out.println("The forest is quiet. Only the wind moves the leaves.\n");
                break;
            case 1:
                System.out.println("Dry leaves crunch under the prince's footsteps.\n");
                break;
            case 2:
                System.out.println("An owl watches silently from a tree branch.\n");
                break;
            case 3:
                System.out.println("A cold fog drifts through the trees.\n");
                break;
            case 4:
                System.out.println("The prince walks carefully through thick bushes.\n");
                break;
            case 5:
                System.out.println("Strange footprints appear on the ground.\n");
                break;
            case 6:
                System.out.println("The shadows of the forest grow longer.\n");
                break;
            case 7:
                System.out.println("A sudden wind passes between the trees.\n");
                break;
            case 8:
                System.out.println("An old broken cart lies abandoned here.\n");
                break;
            case 9:
                System.out.println("The prince feels something watching him from afar.\n");
                break;
        }
        System.out.println();
    }




    /**
     * Processes a trap event, displaying the story and applying stat penalties.
     *
     * @param num the ID of the specific trap encountered
     * @param p   the {@link Player} whose stats will be reduced by the trap
     */

    public static void trapStory(int num, Player p){
        Random rand = new Random();
        int randHp,randDef,randATK,randXP;
        if(num==1){
            System.out.println("The ground suddenly collapses!");
            System.out.println("The prince falls into a hidden pit.");
            System.out.println("He climbs out but loses health.\n");
            randHp = rand.nextInt(15);
            p.hp-=randHp;
            System.out.println("HP REDUCED: " + randHp);
        } else if(num==2){
            System.out.println("A hidden mechanism clicks!");
            System.out.println("Arrows shoot from the trees.");
            System.out.println("The prince is struck while dodging.\n");
            randHp = rand.nextInt(10);
            p.hp-=randHp;
            System.out.println("HP REDUCED: " + randHp);
        } else if(num==3){
            System.out.println("The prince steps on an old hunter's trap!");
            System.out.println("Sharp metal jaws snap shut.");
            System.out.println("He breaks free but is wounded.\n");
            randHp = rand.nextInt(12);
            randDef = rand.nextInt(2);
            p.hp-=randHp;
            p.def-=randDef;
            System.out.println("HP REDUCED: " + randHp);
            System.out.println("DEF REDUCED: " + randDef);
        } else if(num==4){
            System.out.println("Dark mist rises from the ground.");
            System.out.println("The cursed air drains the prince's strength.\n");
            randATK = rand.nextInt(5);
            p.atk-=randATK;
            System.out.println("ATK REDUCED: " + randATK);
        } else if(num==5){
            System.out.println("The prince touches a strange glowing rune.");
            System.out.println("A burst of dark magic burns him.\n");
            randHp = rand.nextInt(8);
            randDef = rand.nextInt(4);
            p.hp-=randHp;
            p.def-=randDef;
            System.out.println("HP REDUCED: " + randHp);
            System.out.println("DEF REDUCED: " + randDef);
        } else if(num==6){
            System.out.println("Thick spider webs cover the path.");
            System.out.println("Poisonous spiders bite the prince.\n");
            randHp = rand.nextInt(6);
            randATK = rand.nextInt(2);
            p.hp-=randHp;
            p.atk-=randATK;
            System.out.println("HP REDUCED: " + randHp);
            System.out.println("ATK REDUCED: " + randATK);
        } else if(num==7){
            System.out.println("A rotten tree suddenly falls!");
            System.out.println("The prince barely escapes but gets injured.\n");
            randHp = rand.nextInt(14);
            p.hp-=randHp;
            System.out.println("HP REDUCED: " + randHp);
        } else if(num==8){
            System.out.println("A cursed symbol lights up under his feet.");
            System.out.println("Dark energy shocks the prince.\n");
            randHp = rand.nextInt(5);
            randXP = rand.nextInt(10);
            p.hp-=randHp;
            p.xp-=randXP;
            System.out.println("HP REDUCED: " + randHp);
            System.out.println("XP REDUCED: " + randXP);
        } else if(num==9){
            System.out.println("Loose rocks slide from above!");
            System.out.println("The prince is hit before he can react.\n");
            randHp = rand.nextInt(10);
            randDef = rand.nextInt(2);
            p.hp-=randHp;
            p.def-=randDef;
            System.out.println("HP REDUCED: " + randHp);
            System.out.println("DEF REDUCED: " + randDef);
        } else{
            System.out.println("A hidden snake nest is disturbed!");
            System.out.println("A venomous snake bites the prince.\n");
            randHp = rand.nextInt(7);
            randATK = rand.nextInt(3);
            p.hp-=randHp;
            p.atk-=randATK;
            System.out.println("HP REDUCED: " + randHp);
            System.out.println("ATK REDUCED: " + randATK);
        }
        System.out.println();
    }




    /**
     * Prints a narrative description when the player finds a reward tile.
     * <p>
     * Describes the discovery of items like ancient chests, healing herbs,
     * or mysterious crystals based on the provided index.
     *
     * @param num a unique ID used to determine which reward story to display
     */

    public static void rewardStory(int num){

        if(num==0){

            System.out.println("You discover an ancient chest hidden under a tree root.");
            System.out.println("Inside lies shield and a shining dagger.");
            System.out.println("The prince feels stronger.\n");

        } else if(num==1){

            System.out.println("Behind a broken stone, the prince finds a small wooden box.");
            System.out.println("Inside are healing herbs used by forest monks.");

        } else if(num==2){

            System.out.println("A faint glow appears between the bushes.");
            System.out.println("The prince uncovers a mysterious crystal.");
            System.out.println("Its power fills him with energy.\n");

        } else{

            System.out.println("Near an old tree stump lies a forgotten treasure chest.");
            System.out.println("The prince opens it and finds rare royal coins.");
            System.out.println("Fortune smiles upon him.\n");

        }
    }




    /**
     * Displays a unique encounter message based on the type of enemy encountered.
     *
     * @param e the {@code Enemies} object representing the current opponent
     */

    public static void enemyAppearStory(Enemies e){

        switch(e.name){

            case "Goblin":
                System.out.println("A sneaky Goblin jumps from behind a fallen tree!");
                System.out.println("It snarls and blocks the prince's path.");
                break;

            case "WildCat":
                System.out.println("A Wild Cat slowly steps out from the bushes.");
                System.out.println("Its sharp eyes lock onto the prince.");
                break;

            case "WildPup":
                System.out.println("A hungry Wild Pup circles around cautiously.");
                System.out.println("It growls and prepares to attack.");
                break;

            case "ForestRabbit":
                System.out.println("A Forest Rabbit suddenly leaps from the grass.");
                System.out.println("Something in this cursed forest has driven it mad!");
                break;

            case "ForestSnake":
                System.out.println("A Forest Snake slithers across the path.");
                System.out.println("Its fangs gleam as it coils to strike.");
                break;

            case "BandIt":
                System.out.println("A masked Bandit jumps from behind a tree!");
                System.out.println("\"Your gold or your life!\" he shouts.");
                break;

            case "BullDog":
                System.out.println("A massive Bull Dog charges from the shadows!");
                System.out.println("Its powerful jaws snap loudly.");
                break;

            case "Wolf":
                System.out.println("A fierce Wolf emerges from the darkness.");
                System.out.println("Its glowing eyes follow every move.");
                break;

            case "GoblinArcher":
                System.out.println("A Goblin Archer appears on a nearby rock.");
                System.out.println("It quickly pulls an arrow from its quiver.");
                break;

            case "ForestBearCub":
                System.out.println("A young Forest Bear Cub blocks the path.");
                System.out.println("It roars and charges despite its size.");
                break;

            case "ForestTroll":
                System.out.println("The ground trembles...");
                System.out.println("A massive Forest Troll steps out from the trees.");
                break;

            case "DarkGoblin":
                System.out.println("A Dark Goblin crawls out of the shadows.");
                System.out.println("Its glowing eyes burn with dark magic.");
                break;

            case "ShadowWolf":
                System.out.println("A Shadow Wolf forms from the darkness.");
                System.out.println("Its body blends with the forest shadows.");
                break;

            case "ForestOgre":
                System.out.println("A towering Forest Ogre blocks the path.");
                System.out.println("It roars loudly and lifts its giant weapon.");
                break;

            case "WildBoar":
                System.out.println("A furious Wild Boar bursts through the bushes!");
                System.out.println("Its sharp tusks point directly at the prince.");
                break;

            default:
                System.out.println("Something emerges from the forest shadows...");
        }

        System.out.println("\nPrepare for battle!\n\n");
    }



    /**
     * Displays a dramatic cinematic introduction when the player faces a Boss enemy.
     *
     * @param e the {@code Enemies} object representing the Boss
     */

    public static void bossAppearStory(Enemies e){

        switch(e.name){

            case "Lion":{

                System.out.println("The forest suddenly becomes silent...");
                System.out.println("Even the wind stops moving through the trees.");
                System.out.println();
                System.out.println("A deep roar echoes across the Forest of Shadows.");
                System.out.println("From the darkness, a massive Lion steps forward.");
                System.out.println();
                System.out.println("Its golden eyes stare directly at the prince.");
                System.out.println("This creature is the ruler of the forest.");
                System.out.println();
                System.out.println("Boss Incoming: " + e.name);
                System.out.println("Prepare for the final battle of this chapter!\n");

            }

            case "Tiger":{

                System.out.println("The forest suddenly becomes silent...");
                System.out.println("Even the wind stops moving through the trees.");
                System.out.println();
                System.out.println("A deep roar echoes across the Forest of Shadows.");
                System.out.println("From the darkness, a massive Lion steps forward.");
                System.out.println();
                System.out.println("Its golden eyes stare directly at the prince.");
                System.out.println("This creature is the ruler of the forest.");
                System.out.println();
                System.out.println("Boss Incoming: " + e.name);
                System.out.println("Prepare for the final battle of this chapter!\n");

            }
            default:
                System.out.println("Something emerges from the forest shadows...");

        }
    }
}