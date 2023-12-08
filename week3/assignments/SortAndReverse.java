package week3.assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAndReverse {

	public static void main(String[] args) {
		String[] str = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		for(String s:str) {
			list.add(s);
		}
		Collections.sort(list);
		
		for(int k = list.size()-1;k>=0;k--) {
			list1.add(list.get(k));
		}
		System.out.println(list1);
	}

}
