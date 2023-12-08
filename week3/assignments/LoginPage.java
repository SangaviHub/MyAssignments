package week3.assignments;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("Performing common tasks in Login page");
	}
	
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.clickElement();
		login.findElement();
		login.enterText();
		login.performCommonTasks();
		BasePage b = new BasePage();
		b.performCommonTasks();
	}

}
