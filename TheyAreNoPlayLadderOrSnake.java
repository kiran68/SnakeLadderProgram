package com.bridgelabz.snakeladderprogram;


import java.util.Random;
 
   public class TheyAreNoPlayLadderOrSnake {
  public static void main(String[] args) {
	  int option = 0;

 int diceRoll = (int) Math.floor(Math.random()  * 6) +1;
 
 System.out.println("Dice the roll" + " " + diceRoll);
  option = (int)Math.floor(Math.random() *  3);
 int playerPosition = 0;
 
 if (option == 0) {
	 playerPosition = playerPosition + option;
	 System.out.println("Player Are Stop Our Same Place" );
 }
 else if (option == 1) {
      playerPosition = playerPosition + diceRoll;
      System.out.println("Player Are Moves Ahed");
	}
 else if (option == 2) {
	 playerPosition = playerPosition - diceRoll;
	 System.out.println("Player Are Movie Behind");
	 if (playerPosition <0) {
		 playerPosition = 0;
	 }
 }
   }
   }
