package CHARACTER;

/**
 * Represents the playable character in the game, extending the base prince archetype.
 * <p>
 * This class adds progression systems such as levels (lvl) and experience points (xp),
 * tracking for the current story chapter, and an inventory system for consumable potions.
 *
 * @see Princes
 */

public class Player extends Princes{

    public int lvl,xp,chapter,healPortion,attackPortion,defPortion;
    public int initialHP,initialATK,initialDEF;


    /**
     * Constructs a new Player with full stats, progression data, and inventory.
     *
     * @param name           the character's name
     * @param hp             current health points
     * @param atk            current attack power
     * @param def            current defense value
     * @param powers         the character's special ability
     * @param lvl            starting level
     * @param xp             starting experience points
     * @param chapter        current story chapter
     * @param healPortion    number of healing potions owned
     * @param attackPortion  number of attack-buffing potions owned
     * @param defPortion     number of defense-buffing potions owned
     */

    public Player(String name, int hp, int atk, int def, String powers, int lvl, int xp, int chapter, int healPortion, int attackPortion, int defPortion){
        super(name, hp, atk, def, powers);
        this.lvl = lvl;
        this.xp = xp;
        this.chapter = chapter;
        this.healPortion = healPortion;
        this.attackPortion = attackPortion;
        this.defPortion = defPortion;

        // Save initial values for resets
        initialHP = hp;
        initialATK = atk;
        initialDEF = def;
    }


    /**
     * Displays a full summary of the player's current status and inventory.
     * <p>
     * This method includes safety checks to ensure no values are displayed as
     * negative numbers before printing to the console.
     */

    public void printStats(){
        if(hp<0)            hp=0;
        if(atk<0)           atk=0;
        if(def<0)           def=0;
        if(xp<0)            xp=0;
        if(healPortion<0)   healPortion=0;
        if(attackPortion<0) attackPortion=0;
        if(defPortion<0)    defPortion=0;
        System.out.println("NAME: " + name);
        System.out.println("HP: " + hp);
        System.out.println("ATTACK: " + atk);
        System.out.println("DEFENCE: " + def);
        System.out.println("LEVEL: " + lvl);
        System.out.println("XP: " + xp);
        System.out.println("CHAPTER: " + chapter);
        System.out.println("POWERS: " + powers);
        System.out.println("Heal Portion: " + healPortion);
        System.out.println("Attack Portion: " + attackPortion);
        System.out.println("Defence Portion: " + defPortion);
    }


    /**
     * Reverts all player statistics and inventory counts back to their
     * initial starting values. Usually called during a Game Over scenario.
     */

    public void resetStats(){
        hp = initialHP;
        atk = initialATK;
        def = initialDEF;
        lvl = 0;
        xp = 0;
        chapter = 1;
        healPortion = 0;
        attackPortion = 0;
        defPortion = 0;
    }
}