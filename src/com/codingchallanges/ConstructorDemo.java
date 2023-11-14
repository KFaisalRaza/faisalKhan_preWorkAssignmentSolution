package com.codingchallanges;

public class ConstructorDemo {

	int number1 = 0;
	int number2 = 0;

	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
	}

	public ConstructorDemo(int a, int b) {
		this.number1 = a;
		this.number2 = b;
	}

	public void Sum() {
		System.out.println("Sum is: " + (number1 + number2));
	}

	public static void main(String[] args) {
		ConstructorDemo demo1 = new ConstructorDemo();
		ConstructorDemo demo2 = new ConstructorDemo(4, 5);
		demo1.Sum();
		demo2.Sum();
	}
}
