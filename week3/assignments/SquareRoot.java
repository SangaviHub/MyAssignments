package week3.assignments;

public class SquareRoot {

	public static void main(String[] args) {
		int n = 16;
		int i=1, result = 1;
		while(result<=n) {
			i++;
			result=i*i;
		}
		System.out.println("The square root of given number is..");
		System.out.println(i-1);

	}

}
