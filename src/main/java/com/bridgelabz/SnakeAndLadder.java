package com.bridgelabz;
/*
 * @author : Nikhil Deshmukh
 * Snake and Ladder game played with single player at start position 0
 */
public class SnakeAndLadder {
    // Declaring Instance Variable
    int playerPosition = 0;

    //Method to display player position
    public void showPosition() {
        System.out.println("Player Position: " + playerPosition);
    }

    public static void main(String[] args) {
        // Displaying welcome message
        System.out.println("Welcome to Snake and Ladder Simulation");
        // Creating object for Player
        SnakeAndLadder player = new SnakeAndLadder();
        player.showPosition();
    }
}
