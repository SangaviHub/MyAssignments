package week1.assignments;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Please Enter the Maximum number to print Fibonacci series...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int n1 = 0;
		int n2= 1;
		int n3 ;
		System.out.println("The series for Given number are...");
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<n;i++) {
		n3 = n1+n2;
		n1= n2;
		n2 = n3;
		System.out.println(n3);
		}

	}

}
