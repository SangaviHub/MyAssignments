package week1.assignments;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		boolean flag=true;
		System.out.println("Type any number to find whether its prime or not......");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i=2;i<n;i++) {
			if(n%i==0)
				flag=false;
		}
		if(flag)
			System.out.println("The Given Number "+n+" is Prime");
		else
			System.out.println("The Given Number "+n+" is not Prime");
	}

}
