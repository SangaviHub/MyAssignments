package week1.day2;;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser bs = new Browser();
		String s = bs.launchBrowser("EdgeBrowser");
		System.out.println("Now "+s+" launched successfully");
		bs.loadUrl();

	}

}
