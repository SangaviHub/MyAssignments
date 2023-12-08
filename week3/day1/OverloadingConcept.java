package week3.day1;

public class OverloadingConcept {
	
	public static void reportStep(String msg,String status) {
		System.out.println(msg);
		System.out.println(status);
				
	}
	
	public static void reportStep(String msg,String status,boolean snap) {
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
	}

	public static void main(String[] args) {
		
		reportStep("OverloadingFirstMethodStatus","Pass");
		reportStep("OverLoadingSecondMethodStatus","Pass",true);

	}

}
