package com.exceptions;

public class CustomCheckedExceptionExample {

	public static void AgeCheck(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		} else {
			System.out.println("eligible");
		}

	}

	public static void main(String[] args) {

		try {
			CustomCheckedExceptionExample.AgeCheck(12);
			;
		} catch (InvalidAgeException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			System.out.println("Finally Executed");
		}
	}

}
