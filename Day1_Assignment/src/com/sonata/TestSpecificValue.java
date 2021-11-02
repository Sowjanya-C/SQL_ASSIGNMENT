package com.sonata;
//To find whether a specific value is present in array or not
public class TestSpecificValue {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int i, value = 3;
		for(i=0; i<a.length; i++)
		{
			if(a[i]==value)
			{
				System.out.println(value+" is present at position "+(i+1));
			}
		}

	}

}
