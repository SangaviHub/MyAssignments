package week1.day2;;

public class Browser {
	public String launchBrowser(String browserName) {
		
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser b = new Browser();
		String  name = b.launchBrowser("ChromeBrowser");
		System.out.println("Now "+name+" launched successfully");
		b.loadUrl();

	}

	
}
