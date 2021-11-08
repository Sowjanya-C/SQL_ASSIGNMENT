package com.sonata;

public class Triangle extends Shape {
	
	@Override
	public double area() {
		return (width*height)/2;
	}
	Triangle(double w, double h)
	{
		this.width = w;
		this.height = h;
	}

	public static void main(String[] args) {
		Shape t1 = new Triangle(10,15);
		System.out.println("Area of Triangle = "+t1.area());

	}

}
