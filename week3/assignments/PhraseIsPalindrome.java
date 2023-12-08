package week3.assignments;

public class PhraseIsPalindrome {

	public static void main(String[] args) {
		String str = "race a car";
		String msg = str.toLowerCase();
		System.out.println(msg);
		String k = msg.replaceAll("[-+.^:,]", " ");
		System.out.println(k);
		String j = k.replaceAll("[^A-Za-z0-9]", " ");
		System.out.println(j);
		String con = " ";
		String rev = " ";
		String[] s = j.split(" ");
		for(String y : s) {
			con = con + y;
		}
		System.out.println("Concatenating the Given string");
		System.out.println(con);
		String temp = con;
		char[] ch = temp.toCharArray();
		for(int i=ch.length-1;i>0;i--) {
			rev = rev + ch[i];
		}
		System.out.println("After Reversing a given string");
		System.out.println(rev);
		if(temp.equals(rev)) {
			System.out.println("True,It is Palindrome");
		}
		else {
			System.out.println("False,It is not Palindome");
		}
			
		

	}

}
