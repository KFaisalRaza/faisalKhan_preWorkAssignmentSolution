package com.codingchallenge8;

public class StaticFinalDemo {

	int var1 = 10;
	static int var2 = 10;

	// Your code here...
	public void method1() {
		System.out.println(var1++);
	}

	public void method2() {
		System.out.println(var2++);
	}

	public static void main(String[] args) {
		StaticFinalDemo obj1 = new StaticFinalDemo();
		StaticFinalDemo obj2 = new StaticFinalDemo();
		StaticFinalDemo obj3 = new StaticFinalDemo();

		// your code here...

		System.out.println("Using non-static keyword");
		obj1.method1();
		obj2.method1();
		obj3.method1();

		// your code here for method1

		System.out.println("\nUsing static keyword");
		obj2.method2();
		obj2.method2();
		obj2.method2();

		// your code here for method2

	}

}