package MyOwnAutoShopProject;

public class Truck extends Car {
	
	int weight;
	
	Truck(int s, double p, String c, int w)
	{
		super(s,p,c);
		this.weight=w;
	}
	double getSalePrice() {
		if(this.weight>2000)
			return this.regularPrice - (this.regularPrice * 0.1);
		else
			return this.regularPrice - (this.regularPrice * 0.2);
	}

	public static void main(String[] args) {
		Truck t = new Truck(120,2000000,"yellow",3000);
		t.display();
        System.out.println("Price after discount : "+t.getSalePrice());

	}

}
