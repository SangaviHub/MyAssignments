package week3.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = {3, 2, 11, 4, 6, 7};
		int[] b = {1, 2, 8, 4, 9, 7};
		
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();
		
		for(int n : a) {
			l1.add(n);
		}
		System.out.println(l1);
		
		for(int l : b) {
			l2.add(l);
		}
		System.out.println(l2);
		System.out.println("Intesection of numbers in List are..");
		for(int k : l1) {
			if(l2.contains(k)) {
				l3.add(k);
			}
		}
		
		System.out.println(l3);
		

	}

}
