package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//li[@data-id='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//li[@data-id='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.xpath("//span[@data-date='2']")).click();
		driver.findElement(By.xpath("//div[@id='search-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement web = driver.findElement(By.xpath("(//div[contains(@id,'service-operator-agent-name')]/h5)[1]"));
		System.out.println(web.getText());
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement w = driver.findElement(By.xpath("(//button[text()='Show Seats']/following::small)[5]"));
		System.out.println(w.getText());
		driver.findElement(By.xpath("(//div[contains(@id,'service-operator')]/button[text()='Show Seats'])[5]")).click();
		WebElement seat = driver.findElement(By.xpath("(//table[@id='seat-layout-details']/following::button[@class='seat sleeper'])[1]"));
		if(seat.isEnabled())
		{
			driver.findElement(By.xpath("(//table[@id='seat-layout-details']/preceding::button[@class='seat sleeper'])[1]")).click();
		}
		else
			seat.click();
		driver.findElement(By.xpath("(//div[contains(@class,'checkbox-container')]/input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'checkbox-container')]/input[@type='checkbox'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Seat Selected :']/span")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()='Base Fare :']/span")).getText());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
