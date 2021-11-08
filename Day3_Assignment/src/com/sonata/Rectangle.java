package com.sonata;

public class Rectangle extends Shape{

	@Override
	public double area() {
		return length*width;
	}
	Rectangle(double l, double w)
	{
		this.length=l;
		this.width = w;
	}
	public static void main(String[] args) {
		Shape r1 = new Rectangle(10,20);
		System.out.println("Area of Rectangle = "+r1.area());
	}

}
