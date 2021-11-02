package com.sonata;
//To find and display the greatest of three numbers
public class GreatestNumber {

	public static void main(String[] args) {
		int a = 12, b = 25, c = 89;
		if(a>b && a>c)
			System.out.println(a+" is the greatest number");
		else if (b>c && b>a)
			System.out.println(b+" is the greatest number");
		else
			System.out.println(c+" is the greatest number");
	}

}
