package com.sonata;
//To find duplicate values in an array
public class DuplicateValues {

	public static void main(String[] args) {
		int a[] = {10,20,30,30,40,50,40,60,20};
		System.out.println("Duplicate values in an array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}
