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

        System.out.print("NAME\t\t\t\tHP\t\t\tATK\t\t\tDEF\t\t\tLVL\t\t\tXP\n\n");

        System.out.print(name + "\t\t\t" + hp + "\t\t\t" + atk + "\t\t\t" + def + "\t\t\t" + lvl + "\t\t\t" + xp + "\n\n");

        System.out.print("________________________________________________________________________\n\n");

        System.out.print("CHAPTER\t\tPOWERS\t\t\t\tHealPortion\t\t\tAttackPortion\t\t\tDefencePortion\n\n");

        System.out.print(chapter + "\t\t\t" + powers + "\t\t" + healPortion + "\t\t\t\t\t" + attackPortion + "\t\t\t\t\t\t" + defPortion + "\n");

        System.out.print("_________________________________________________________________________\n\n");

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