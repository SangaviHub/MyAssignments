package week3.assignments;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Enter the Username of login page");
	}
	
	public void enterPassword() {
		System.out.println("Enter the password for login page");
	}
	
	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		login.navigateToHomePage();
	}
}
