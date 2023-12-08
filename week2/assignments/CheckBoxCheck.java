package week2.assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxCheck {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='ui-growl ui-widget'])[1]")).isDisplayed());
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
		driver.findElement(By.xpath("(//h5[text()='Tri State Checkbox']/following::div)[5]")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='ui-growl-title']")).isDisplayed());
		driver.findElement(By.xpath("(//h5[text()='Toggle Switch']/following::div)[3]")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Disabled']/preceding::div[contains(@class,'ui-state-disabled')]"));
		Assert.assertTrue(ele.isEnabled());
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.close();
		
		
		
		

	}

}
