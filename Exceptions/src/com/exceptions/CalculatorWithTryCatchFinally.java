package com.exceptions;

import java.util.Scanner;

public class CalculatorWithTryCatchFinally {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter First Number");
			int num1 = Integer.parseInt(scanner.nextLine());

			System.out.println("Enter Second Number");
			int num2 = Integer.parseInt(scanner.nextLine());

			System.out.println("Enter Opertor (+,-,*,/):");
			char opertors = scanner.nextLine().charAt(0);

			int result;
			switch (opertors) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				throw new IllegalArgumentException("Invalid Opertor");
			}
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("Error : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			System.out.println("Thank You For Using calculator");
		}
	}
}
