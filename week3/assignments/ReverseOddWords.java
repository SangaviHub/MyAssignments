package week3.assignments;


public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		String rev =" ";
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0;i<words.length;i++) {
			
			if(i%2!=0) {
				char[] ch = words[i].toCharArray();
				for(int k=ch.length;k>0;k--) {
					rev+=ch[k-1];
				}
				sb.append(rev).append(" ");
			}
			else {
				sb.append(words[i]).append(" ");
			}
		}
		System.out.println(sb.toString());
				
				
		

	

}
}
