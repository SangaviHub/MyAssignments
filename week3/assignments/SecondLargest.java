package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr =  {3, 2, 11, 4, 6, 7};
		List<Integer> list = new ArrayList<Integer>();
		for(int n : arr) {
			list.add(n);
		}
		Collections.sort(list);
		System.out.println("List in Sorted order..");
		for(int k : list) {
			System.out.println(k);
		}
		int l = list.size();
		System.out.println("The second Largest Element in List..");
		System.out.println(list.get(l-2));

	}

}
