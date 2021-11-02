package com.sonata;
//To reverse the elements in an array
public class ReverseArrayOfIntegerValues {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5}; int i;
		System.out.println("Reverse of array :");
		System.out.print("{");
		for(i=a.length-1; i>0; i--)
		{
			System.out.print(a[i]+",");
		}
		System.out.println(a[i]+"}");
	}

}
