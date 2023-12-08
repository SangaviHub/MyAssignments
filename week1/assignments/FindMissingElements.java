package week1.assignments;

import java.util.Arrays;

public class FindMissingElements {
	public static void main(String args[])
	{
		int count=0;
		int a[] = {1,4,3,2,8,6,7};
		System.out.println("The missing elements in the array...");
		Arrays.sort(a);		
		for(int i=a[0];i<a.length-1;i++) {
			if(i==a[count]) {
				count++;
			}
			else 				
				System.out.println(i);
		}
	}
}
