package com.bridgelabz.snakeladderprogram;

public class ReportTheGame {

	public static void main(String[] args) {
		
	int position = 0;
	int numRoll =0 ;

	while (position < 100){
		
		numRoll ++;
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
	}
	System.out.println(" Count Of Roll :" + numRoll);
	System.out.println("Congratulation ..you have to won");
}	
}


