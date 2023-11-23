package week1.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Please Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum =  0,temp;
		temp=n;
		while(n>0) {
			int r = n%10;
			sum=(sum*10)+r; 
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println(temp+" The Given number is Palindrome");
		else
			System.out.println(temp+" The Given number is not Palindrome");
	}

}
