package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito()
	{
		System.out.println("opening incognito");
	}
	
	public void clearCache()
	{
		System.out.println("claering cache");
	}

	
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openIncognito();
		c.clearCache();
		
		c.openURL();
		c.navigateBack();
		c.closeBrowser();
	}
}
