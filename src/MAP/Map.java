package MAP;

import java.util.Random;

/**
 * Manages the procedural generation and display of the Chapter 1 game map.
 * <p>
 * This class uses a 2D array to store the locations of the start point,
 * exit, enemies, rewards, and traps within a 7x7 grid.
 */

public class Map {

    /** The number of rows and columns in the map grid. */
    public static int row = 7, col = 7;

    /**
     * The 2D array representing the map layout.
     * <p>
     * Key: 'S' (Start), 'E' (Exit), 'O' (Enemy/Opponent),
     * 'R' (Reward), 'T' (Trap), null (Empty).
     */
    public static String[][] chapOneMap = new String[row][col];


    /**
     * Procedurally generates the Chapter 1 map.
     * <p>
     * It clears the previous map, sets the starting position at (3,3),
     * randomly places an exit at a corner, and distributes events (O, R, T)
     * across each row to ensure unique placement.
     */

    public static void chapterOneMap(){

        Random rand = new Random();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                chapOneMap[i][j] = null;
            }
        }

        chapOneMap[3][3] = "S";

        int endRow = rand.nextBoolean() ? 0 : row-1;
        int endCol = rand.nextBoolean() ? 0 : col-1;

        chapOneMap[endRow][endCol] = "E";

        for(int i=0; i<row; i++){

            if(i == 3) continue;

            int oIndex = rand.nextInt(col);

            int rIndex = rand.nextInt(col);
            while(rIndex == oIndex){
                rIndex = rand.nextInt(col);
            }

            int tIndex = rand.nextInt(col);
            while(tIndex == oIndex || tIndex == rIndex){
                tIndex = rand.nextInt(col);
            }

            if(chapOneMap[i][oIndex] == null)
                chapOneMap[i][oIndex] = "O";

            if(chapOneMap[i][rIndex] == null)
                chapOneMap[i][rIndex] = "R";

            if(chapOneMap[i][tIndex] == null)
                chapOneMap[i][tIndex] = "T";
        }
    }




    /**
     * Prints the full map to the console, revealing all hidden events.
     *
     * @param xPos the current X-coordinate (column) of the player
     * @param yPos the current Y-coordinate (row) of the player
     */

    public static void printChapOneMap(int xPos, int yPos){

        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){

                if(i==yPos && j==xPos)
                    System.out.print("P\t");
                else if(chapOneMap[i][j] == null)
                    System.out.print(".\t");
                else
                    System.out.print(chapOneMap[i][j] + "\t");

            }
            System.out.println();
        }

    }




    /**
     * Prints a "fog of war" version of the map where only the player's
     * position is visible.
     * <p>
     * All other tiles are masked as dots (.), keeping rewards and traps hidden.
     *
     * @param xPos the current X-coordinate of the player
     * @param yPos the current Y-coordinate of the player
     */

    public static void printEmptyMap(int xPos, int yPos){

        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){

                if(i==yPos && j==xPos)
                    System.out.print("P\t");
                else
                    System.out.print(".\t");

            }
            System.out.println();
        }
    }
}