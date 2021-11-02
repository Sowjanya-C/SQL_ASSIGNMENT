package MyOwnAutoShopProject;

public class Sedan extends Car {
	int length;
	
	Sedan(int s, double p, String c, int l)
	{
		super(s,p,c);
		this.length = l;
	}
	double getSalePrice() {
		if(this.length>20)
			return this.regularPrice - (this.regularPrice * 0.05);
		else
			return this.regularPrice - (this.regularPrice * 0.1);
	}

	public static void main(String[] args) {
		Sedan s = new Sedan(130, 1400000, "red",18);
		s.display();
		System.out.println("Price after discount = "+s.getSalePrice());

	}

}
