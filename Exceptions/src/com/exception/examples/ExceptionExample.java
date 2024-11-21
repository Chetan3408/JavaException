package com.exception.examples;

public class ExceptionExample {

	public static void main(String[] args) {

		try {
			int input = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception is Handled ");
		}
	}
}
