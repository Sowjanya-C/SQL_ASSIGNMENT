package com.sonata;

public class Product {
	int proID;
	String proName;
	double proPrice;
	
	Product() {}
	
	Product(int id, String name, double price) {
		this.proID=id;
		this.proName=name;
		this.proPrice=price;
	}
	public void display() {
		System.out.println(proID);
		System.out.println(proName);
	}
	public double totalPrice(double CGST, double SGST) {
		return this.proPrice+CGST+SGST;
	}

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.proID = 101;
		p1.proName = "sofa";
		p1.proPrice = 40000;
		p1.display();
		System.out.println(p1.totalPrice(400, 400));
		
		Product p2 = new Product(102, "Dining Table", 50000);
		p2.display();
		System.out.println(p2.totalPrice(500, 500));
	}

}
