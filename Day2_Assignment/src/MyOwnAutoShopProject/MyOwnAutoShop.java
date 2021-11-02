package MyOwnAutoShopProject;

public class MyOwnAutoShop{
	
	public static void main(String[] args) {
		Sedan s = new Sedan(120,1500000,"red", 21);
	    System.out.println("Sedan Class");
	    s.display();
	   
	    
	    Ford f1 = new Ford(100,1000000,"pink",2021,50000);
        System.out.println("Ford Class");
	    f1.display();
	   
	    Ford f2 = new Ford(110,1700000,"blue",2020,100000);
	    f2.display();
	    
	    Truck t = new Truck(120,2000000,"yellow",3000);
	    
	    Car c = new Car(120,1300000,"green");
	    c.display();
	    
	 
	    
	    System.out.println("Sedan Price = " +s.getSalePrice());
	    System.out.println("Ford Price = " +f1.getSalePrice());
	    System.out.println("Truck Price = " +t.getSalePrice());
	    
	}

}
