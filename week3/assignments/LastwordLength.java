package week3.assignments;

import java.util.ArrayList;
import java.util.List;

public class LastwordLength {

	public static void main(String[] args) {
		String  s = "luffy is still joyboy";
		String[] msg = s.split(" ");
		List<String> list = new ArrayList<String>();
		for(String k : msg) {
			list.add(k);
		}
		System.out.println("Number of words in String are..");
		System.out.println(list.size());
		System.out.println("The last word in given string is..");
		System.out.println(list.get((list.size())-1));
		String m = list.get((list.size())-1);
		System.out.println("The length of last word is..");
		System.out.println(m.length());

	}

}
