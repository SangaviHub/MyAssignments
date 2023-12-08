package week3.day1;

public class OccuranceCount {

	public static void main(String[] args) {
		int count= 0;
		String s =" TestLeaf";
		char[] arr = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]=='e') {
				count++;
			}
		}
		System.out.println("The occurance of 'e' in TestLeaf is..");
		System.out.println(count);

	}

}
