package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();
		for(int k : arr) {
			list.add(k);
		}
		Collections.sort(list);
		System.out.println("The sorted List..");
		System.out.println(list);
		for(int i=0;i<list.size()-1;i++) {
			int n = (list.get(i))+1;
			if(n!=list.get(i+1)) {
				l3.add(n);
			}
		}
		System.out.println("The Missing elements from the list of sequence numbers are..");
		System.out.println(l3);
	}

}
