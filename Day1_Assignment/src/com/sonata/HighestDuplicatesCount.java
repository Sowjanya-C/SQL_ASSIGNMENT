package com.sonata;
//To find highest frequent duplicate value in an array
import java.util.Arrays;

public class HighestDuplicatesCount {

	public static void main(String[] args) {
		int a[] = {10,50,20,10,30,20,10};
		Arrays.sort(a);
		int max_count=1, curr_count=1, res=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
				curr_count++;
			else
			{
				if(curr_count>max_count)
				{
					max_count = curr_count;
					res = a[i-1];
				}
				curr_count = 1;
			}
		}
		if(curr_count>max_count)
		{
			max_count = curr_count;
			res = a[a.length - 1];
		}
		System.out.println(res);

	}

}
