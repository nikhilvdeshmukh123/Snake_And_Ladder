package com.bridgelabz;
/*
 * @author : Nikhil Deshmukh
 * The Player rolls the die to get a number between 1 to 6.
 *  - Use ((RANDOM)) to get the number between 1 to 6
 */
public class SnakeAndLadder {
    // Declaring Instance Variable
    int playerPosition = 0;

    //Method to display player position
    public void showPosition() {
        System.out.println("Player Position: " + playerPosition);
    }

    // Method to Roll the die and get no between 1 to 6
    public int rollDie() {
        int dieNo = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        return dieNo;
    }

    public static void main(String[] args) {
        // Displaying welcome message
        System.out.println("Welcome to Snake and Ladder Simulation");
        // Creating object for Player
        SnakeAndLadder player = new SnakeAndLadder();
        // Showing player position
        player.showPosition();
        // Showing Die Rolling number
        System.out.println("Die Number for Player: " + player.rollDie());
    }
}