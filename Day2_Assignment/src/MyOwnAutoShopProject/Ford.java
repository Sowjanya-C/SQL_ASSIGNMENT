package MyOwnAutoShopProject;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	
	Ford(int s, double p, String c, int y, int md)
	{
		super(s,p,c);
		this.year=y;
		this.manufacturerDiscount=md;
	}
	double getSalePrice() {
		return this.regularPrice - this.manufacturerDiscount;
	}

	public static void main(String[] args) {
		Ford f = new Ford(120, 1200000,"black",2021,100000);
		f.display();
		System.out.println("Price after manufacturer discount = "+f.getSalePrice());

	}

}
