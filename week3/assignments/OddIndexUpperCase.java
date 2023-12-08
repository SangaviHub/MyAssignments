package week3.assignments;

public class OddIndexUpperCase {

	public static void main(String[] args) {
		String s = "changeme";
		char[] ch = s.toCharArray();
		
		StringBuffer t = new StringBuffer();
		
			for(int j=0;j<ch.length;j++) {
				char c = ch[j];
				if(j%2!=0) {
					c  = Character.toUpperCase(c);
				}
					t.append(c);
			}
			System.out.println(t.toString());
		}
		
	
	}


