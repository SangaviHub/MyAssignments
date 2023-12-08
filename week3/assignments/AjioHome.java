package week3.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AjioHome {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		e.click();
		e.sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//span[text()='category']")).click();
		driver.findElement(By.xpath("//span[text()='category']")).click();
		WebElement t = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']"));
		t.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement d = driver.findElement(By.xpath("//div[@class='length']/strong"));
		System.out.println(d.getText());
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='brand']"));
		for(WebElement s : list) {
			System.out.println(s.getText());
		}
		List<WebElement> list1= driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(WebElement h : list1) {
			System.out.println(h.getText());
		}
		driver.close();
	}

}
