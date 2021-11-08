package com.sonata;

public class Square extends Shape {
	
	@Override
	public double area() {
		return length*length;
	}
	Square(double l)
	{
		this.length=l;
	}

	public static void main(String[] args) {
		Shape s1 = new Square(10);
		System.out.println("Area of Square = "+s1.area());

	}

}
