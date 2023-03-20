package com.bridgelabz.snakeladderprogram;

public class PlayerStartWithZero {
public static void main(String[] args) {
	
	int SINGLE_PLAYER_POSITION = 0;
	
	double checkPosition = Math.floor(Math.random() * 10) % 1;
	System.out.println("Start Game With Position:" + checkPosition);
}
}
