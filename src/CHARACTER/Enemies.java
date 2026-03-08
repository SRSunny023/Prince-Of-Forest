package CHARACTER;

/**
 * Represents an enemy entity within the game world.
 * <p>
 * This class defines the combat attributes for various foes, including
 * their health points, offensive power, defensive capabilities, and
 * the experience points rewarded upon defeat.
 */

public class Enemies{

    public String name;
    public int hp,atk,def,xp;


    /**
     * Constructs a new Enemy with a full set of statistics.
     *
     * @param name the name of the enemy
     * @param hp   the starting health points
     * @param atk  the starting attack power
     * @param def  the starting defense value
     * @param xp   the experience reward for defeating this enemy
     */

    public Enemies(String name,int hp, int atk, int def, int xp){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.xp = xp;
    }


    /**
     * Default constructor for creating an uninitialized Enemy object.
     * <p>
     * This is typically used by factory classes like {@code ChapterOneEnemy}
     * before assigning specific values.
     */

    public Enemies(){}


    /**
     * Prints the enemy's current status and statistics to the console.
     */

    public void displayEnemiesInfo(){
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + atk);
        System.out.println("Defence: " + def);
        System.out.println("XP: " + xp);
        System.out.print("\n\n");
    }
}