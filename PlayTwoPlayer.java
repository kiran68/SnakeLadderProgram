package com.bridgelabz.snakeladderprogram;

public class PlayTwoPlayer {
public static void main(String[] args) {
	int position;
	int playerOne;
	int playerTwo;

	while (position < 100) {
		int diceRoll = (int) Math.floor(Math.random() * 6) + 1;
		int input = (int) Math.floor(Math.random() * 3);

		if (input == 0) {
			System.out.println("No Play PlayerStays at " + position);

		} else if (input == 1) {
			position += diceRoll;

			if (position > 100) {
				position -= diceRoll;

			}

			else if (position == 100) {
				break;
			}
			System.out.println("Ladder.position moves to " + position);
		} else {
			// position -= diceRoll;
			position = position - diceRoll;
			if (position < 0) {
				position = 0;
			}
			System.out.println("Snake .player moves to " + position);
		}
		System.out.println("Congratulation ..you have to won");
		System.out.println("Congratulation ..you have to won");
	}
	
	

  class secodPlayer{
 // public void Player () {
	  
// PlayTwoPlayer obj = new PlayTwoPlayer();
// obj = position.nextInt();
	  //int position ;

	while (position < 100) {
		int diceRoll = (int) Math.floor(Math.random() * 6) + 1;
		int input = (int) Math.floor(Math.random() * 3);

		if (input == 0) {
			System.out.println("No Play PlayerStays at " + position);

		} else if (input == 1) {
			position += diceRoll;

			if (position > 100) {
				position -= diceRoll;

			}

			else if (position == 100) {
				break;
			}
			System.out.println("Ladder.position moves to " + position);
		} else {
			// position -= diceRoll;
			position = position - diceRoll;
			if (position < 0) {
				position = 0;
			}
			System.out.println("Snake .player moves to " + position);
		}
		
	System.out.println("Congratulation ..you have to won");
	
	}	
				
		
	}

  