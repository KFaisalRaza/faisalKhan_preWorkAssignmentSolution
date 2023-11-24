package com.codingchallenge13;

public class Polymorphism {

	public void findArea(int length, int breadth) {
		System.out.println("Area of rectangle:" + (length * breadth));
	}

	public void findArea(int length, int height, int width) {
		System.out.println("Area of cuboid:" + (2 * ((length * height) + (length * width) + (height * width))));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p = new Polymorphism();
		p.findArea(2, 4);
		p.findArea(1, 2, 3);
	}

}
