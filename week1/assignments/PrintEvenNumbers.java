package week1.assignments;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		System.out.println("The even numbers are...");
		for(int i =0;i<15;i++) {
			if(i%2==0) 				
				System.out.println(i);
		}
		System.out.println("The odd numbers are...");
		for(int i =0;i<15;i++) {
			if(i%2!=0)
				System.out.println(i);

		}
}
}
