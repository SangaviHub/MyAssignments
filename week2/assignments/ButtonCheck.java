package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

public class ButtonCheck {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title,"Dashboard");
		driver.navigate().back();
		Assert.assertFalse(driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled());
		WebElement position = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		//position.click();
		Point location = position.getLocation();
		System.out.println(location);
		WebElement css = driver.findElement(By.xpath("//span[text()='Save']"));
		//css.click();
		System.out.println(css.getCssValue("color"));
		WebElement size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		//size.click();
		Dimension re = size.getSize();
		System.out.println(re);
		driver.close();

	}

}
