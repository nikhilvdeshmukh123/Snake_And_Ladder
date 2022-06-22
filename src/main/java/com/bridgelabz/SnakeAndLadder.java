package com.bridgelabz;

import java.util.Random;
/*
 * @author : Nikhil Deshmukh
 * Report the number of times the dice was played to win the game
 * and also the position after every die role
 */
public class SnakeAndLadder {

    // Constant
    public static final int IS_NO_PLAY = 0;
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;

    // Declaring Instance Variable
    int playerPosition = 0;
    int diceCount = 0;

    // Random Class Object for Generating Random Numbers
    Random randomNo = new Random();

    //Method to display player position
    public void showPosition() {
        System.out.println("Player Position: " + playerPosition);
    }

    // Method to Roll the die and get no between 1 to 6
    public int rollDie() {
        int dieNo = randomNo.nextInt(6) + 1;
        // Incrementing the Dice Count on each die roll
        diceCount++;
        System.out.println("Dice Count : " + diceCount);
        return dieNo;
    }

    //Method to check for rolling option
    public void optionPlay(int dieNo) {
        int optionNo = randomNo.nextInt(3) + 1;
        System.out.println("Option No : " + optionNo);

        switch (optionNo) {
            case IS_NO_PLAY:
                System.out.println("Player got NO PLAY");
                break;
            case IS_LADDER:
                System.out.println("Yahoo!!! Player got LADDER");
                playerPosition += dieNo;
                // If Player Position greater than 100 then skip the Play
                if (playerPosition > 100) {
                    System.out.println("Sorry The Position is Out of Board.");
                    playerPosition -= dieNo;
                }
                break;
            case IS_SNAKE:
                System.out.println("OOPS!!! Player got SNAKE");
                playerPosition -= dieNo;
                if (playerPosition < 0) {
                    playerPosition = 0;
                }
                break;
        }
    }

    public static void main(String[] args) {
        // Displaying welcome message
        System.out.println("Welcome to Snake and Ladder Simulation");
        // Creating object for Player
        SnakeAndLadder player = new SnakeAndLadder();
        // Showing player position
        player.showPosition();
        // Iterating upto Player got Position 100
        while (player.playerPosition != 100) {
            // Showing Die Rolling number
            int dieNo = player.rollDie();
            System.out.println("Die Number for Player: " + dieNo);
            // Player options
            player.optionPlay(dieNo);
            player.showPosition();
        }
    }
}