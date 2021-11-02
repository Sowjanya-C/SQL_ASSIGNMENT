package com.sonata;

public class TShirt {
	String color;
	String material;
	String design;
	
	TShirt(String col){
		this.color = col;
	}
	
	TShirt(String col, String matr){
		this.color = col;
		this.material = matr;
	}
	
	TShirt(String col, String matr, String des){
		this.color = col;
		this.material = matr;
		this.design = des;
	}
	
	public void display()
	{
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
	}

	public static void main(String[] args) {
		TShirt s = new TShirt("red");
		s.display();
		TShirt l = new TShirt("blue", "cotton");
		l.display();
		TShirt xl = new TShirt("pink", "nylon", "round neck");
		xl.display();
		

	}

}
