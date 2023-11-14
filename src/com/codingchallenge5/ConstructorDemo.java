package com.codingchallenge5;

public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("I am default constructor.");
	}
	
	public ConstructorDemo(int number1, float number2, String str, char character) {
		System.out.println("I am Parameterized constructor. I take various arguments as input.");
		System.out.println("Sqaure of the is: " + (number1 * number2));
		System.out.println("Input string: " + str);
		System.out.println("Input characer: " + character);
	}
 public static void main(String [] args) {
	 ConstructorDemo demo1 = new ConstructorDemo();
	 ConstructorDemo demo2 = new ConstructorDemo(7, 9, "Faisal", 'c');
 }
}
