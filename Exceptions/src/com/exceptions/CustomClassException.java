package com.exceptions;

public class CustomClassException {

	static void validateAge(int age) throws CustomException {

		if (age < 18) {
			throw new CustomException("Age must be 18 or above");
		} else {
			System.out.println("age is valid");
		}
	}

	public static void main(String[] args) {

		try {
			CustomClassException.validateAge(3);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
