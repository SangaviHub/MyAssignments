package week3.day2;

public class Amazon extends CanaraBank {
	
	public void cashOnDelivery() {
		System.out.println("Yes,Cash on Delivery");
	}

	public void upiPayments() {
		System.out.println("UPI Payemts-Yes");
		
	}

	public void cardPayments() {
		System.out.println("Card Payments-NO");
		
	}

	public void internetBanking() {
		System.out.println("Internet Banking-No");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Statement for Payment Transferred");
		
	}

	
	

	public static void main(String[] args) {
		
		Amazon a = new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.internetBanking();
		a.recordPaymentDetails();
		a.upiPayments();
	
}
	
}
