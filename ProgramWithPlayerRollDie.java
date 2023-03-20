package com.bridgelabz.snakeladderprogram;

import java.util.Random;
public class ProgramWithPlayerRollDie {
	public static void main(String[] args) {
		
	Random rollDice = new Random();
	int dice = rollDice.nextInt(6);
	dice++;
	System.out.println("You Rolled a :" + dice);
	
}
}
	
	
	


