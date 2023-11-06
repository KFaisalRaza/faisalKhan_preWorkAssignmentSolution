package com.prework;

import java.util.Scanner;

public class Main {
	public void checkPalindrome() {
		System.out.println("Enter a number to check.");
		Scanner sc5 = new Scanner(System.in);
		int number = sc5.nextInt();
		int count = 0;
		int checkNumber = number;
		while (number > 0) {
			count = (count * 10) + number % 10;
			number = number / 10;
		}
		if (count == checkNumber) {
			System.out.println("Given number is a palindrome number.\n");
		} else {
			System.out.println("Given number is not a palindrome number.\n");
		}
	}

	private void printPattern() {
		// TODO Auto-generated method stub
		System.out.println("Enter a number.");
		Scanner sc4 = new Scanner(System.in);
		int size = sc4.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = i; j <= size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void checkPrimeNumber() {
		// TODO Auto-generated method stub
		System.out.println("Enter a number.");
		Scanner sc3 = new Scanner(System.in);
		int number = sc3.nextInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Given number is a prime number.\n");
		} else {
			System.out.println("Given number is not a prime number.\n");
		}
	}

	public void printFibonacciSeries() {
		System.out.println("Enter a range for the series.");
		Scanner sc2 = new Scanner(System.in);
		int input = sc2.nextInt();
		int firstNumber = 0, secondNumber = 1;
		if (input == 1) {
			System.out.print(0);
			System.out.println();
		} else if (input == 2) {
			System.out.print(0 + ",");
			System.out.print(1);
			System.out.println();
		} else {
			System.out.print(0 + ",");
			System.out.print(1 + ",");
		}
		int sum = 0;
		for (int i = 3; i <= input; i++) {
			sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			if (i == input) {
				System.out.print(sum + "\n");
			} else {
				System.out.print(sum + ",");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj = new Main();

		int choice = 0;
		Scanner sc1 = new Scanner(System.in);
		do {
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			choice = sc1.nextInt();
			switch (choice) {
			case 1:
				obj.checkPalindrome();
				break;
			case 2:
				Scanner sc4 = new Scanner(System.in);
				obj.printPattern();
				break;
			case 3:
				obj.checkPrimeNumber();
				break;
			case 4:
				obj.printFibonacciSeries();
				break;
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}
		} while (choice != 0);
		System.out.println("Exited Successfully!!!");
		sc1.close();
	}

}
