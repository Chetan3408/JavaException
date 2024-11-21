package com.exceptions;

public class UncheckedException {

	public static void main(String[] args) {

		int[] number = { 2, 3, 4 };

		try {
			System.out.println("Value : " + number[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : Array index out of Bounds" + e.getMessage());
		}

	}

}
