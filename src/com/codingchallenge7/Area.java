package com.codingchallenge7;

public class Area {

	private final float pi = 3.14f;

	Area(int radius) {
		System.out.println("Area of the circle is: " + (pi * radius * radius));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = new Area(9);

	}

}
