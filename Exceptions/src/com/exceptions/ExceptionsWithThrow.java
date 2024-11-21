package com.exceptions;

public class ExceptionsWithThrow {

	public void playGame(int score) {
		if (score < 0) {
			throw new IllegalArgumentException("Score Cannot be Negative");
		} else {
			System.out.println("Score :" + score);
		}
	}

	public static void main(String[] args) {

		ExceptionsWithThrow obj = new ExceptionsWithThrow();
		
		try {
			obj.playGame(-12);
		}catch(IllegalArgumentException e) {
			System.out.println("Error caught :" + e.getMessage());
		}finally {
			System.out.println("Thanks for Palying game");
		}
	}
}
