package MyOwnAutoShopProject;

public class Car {
	int speed;
	double regularPrice;
	String color;
	
	Car(){
		
	}
 
	Car(int s, double p, String c){
		this.speed = s;
		this.regularPrice = p;
		this.color = c;
	}
	
	double getSalePrice(double tax)
	{
		return this.regularPrice + tax;
	}
	
	void display() {
		System.out.println("Speed = "+speed);
		System.out.println("Regular Price = "+regularPrice);
		System.out.println("Color = "+color);
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.speed = 50;
		c.regularPrice = 700000;
		c.color = "black";
		c.display();
		
	}

}
