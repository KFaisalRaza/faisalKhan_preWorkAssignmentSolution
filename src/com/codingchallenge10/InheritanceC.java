package com.codingchallenge10;

import java.util.Scanner;

class InheritanceA {
	private float radius = 0.0f;
	private float pi = 22 / 7;
	Scanner sc = new Scanner(System.in);

	public void circleArea() {
		System.out.println("Enter radius of circle.");
		this.radius = sc.nextFloat();
		System.out.println("Area of circle is: " + (pi * this.radius * this.radius)+"\n");
	}
}

class InheritanceB extends InheritanceA{
	private float length = 0.0f;
	private float breadth = 0.0f;
	Scanner sc1 = new Scanner(System.in);

	public void rectangleArea() {
		System.out.println("Enter lenth and breadth of rectangle.");
		this.length = sc1.nextFloat();
		this.breadth = sc1.nextFloat();
		System.out.println("Area of rectangle is: " + (this.length * this.breadth)+"\n");
	}
}

public class InheritanceC extends InheritanceB{
	private float breadth = 0.0f;
	private float height = 0.0f;
	Scanner sc2 = new Scanner(System.in);

	public void traingleArea() {
		System.out.println("Enter breadth and height of traingle.");
		this.breadth = sc2.nextFloat();
		this.height = sc2.nextFloat();
		System.out.println("Area of traingle is: " + (this.breadth * this.height) / 2 + "\n");
	}
	
	public static void main(String[] args) {
		InheritanceC inheritanceC = new InheritanceC();
		inheritanceC.circleArea();
		inheritanceC.rectangleArea();
		inheritanceC.traingleArea();
	}
}
