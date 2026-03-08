package CHARACTER;

/**
 * Represents a prince archetype in the game.
 * <p>
 * This class serves as a template for the different character types
 * a player can choose at the start of the game, defining their
 * base statistics and unique special powers.
 */

public class Princes{

    public String name,powers;
    public int hp,atk,def;

    /**
     * Constructs a new Prince archetype with specific statistics.
     *
     * @param name   the name of the archetype
     * @param hp     the starting health points
     * @param atk    the starting attack power
     * @param def    the starting defense value
     * @param powers the name of the special power
     */

    public Princes(String name, int hp, int atk, int def, String powers){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.powers = powers;
    }

    /**
     * Prints the prince's attributes and powers to the console in a formatted block.
     */

    public void displayPrinceInfo(){
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + atk);
        System.out.println("Defence: " + def);
        System.out.println("Power: " + powers);
        System.out.println();
    }
}