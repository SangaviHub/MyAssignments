package week3.assignments;




public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		StringBuffer sb  = new StringBuffer();
		
		
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					words[j] = words[i].replace(words[i]," ");
				}
			}
			sb.append(words[i]).append(" ");
		}
		
		System.out.println(sb.toString());
		}
		
			
	}
