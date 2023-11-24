package com.codingchallenge12;

class A {

	public void Car() {
		System.out.println("I am method A.");
	}
}

class B extends A {

	public void Car() {
		System.out.println("I am method B.");
	}
}

public class Run_time_polymorphism {

	public static void main(String[] args) {
		A obj = new A();
		obj.Car();
		A obj1 = new B();
		obj1.Car();
	}
}
