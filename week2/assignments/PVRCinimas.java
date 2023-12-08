package week2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class PVRCinimas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement web  = driver.findElement(By.xpath("//span[text()='Genre']"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",web);
		Thread.sleep(500);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)","web");
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].click;",web);
		web.click();
		driver.findElement(By.xpath("(//span[text()='COMEDY'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Language']")).click();
		driver.findElement(By.xpath("//li[@aria-label='TAMIL']")).click();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)","b");
		WebElement c = driver.findElement(By.xpath("(//div[text()='New Release'])[3]"));
		Actions t = new Actions(driver);
		t.moveToElement(c).click(c).build().perform();
		//((JavascriptExecutor)driver).executeScript("arguments[0].click;",c);
		//c.click();
		WebElement b = driver.findElement(By.xpath("(//a[text()='Book Tickets'])[5]"));
		Actions d = new Actions(driver);
		d.moveToElement(b).click(b).build().perform();
		//((JavascriptExecutor)driver).executeScript("arguments[0].click;",b);
		//b.click();
		WebElement w = driver.findElement(By.xpath("//div[@class='date-item carousel-cell selected ng-star-inserted']"));
		Actions act = new Actions(driver);
		act.moveToElement(w).build().perform();
		driver.findElement(By.xpath("(//div[contains(@class,'cell ng-star-inserted')]/label[1])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//div[@class='cinema-title']/h4)[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//li[@class='ng-star-inserted']/span)[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			//WebElement y = driver.findElement(By.xpath("(//i[@class='ion-android-close'])[1]"));
					
			//if(y.isDisplayed())
			//	y.click();
			//else {
				//WebElement l = driver.findElement(By.xpath("//div[text()='Are you sure you want to cancel checking out?']"));
				driver.switchTo().alert().dismiss();
				
				//WebElement s = driver.findElement(By.xpath("//button[text()='No']"));
			//s.click();
			driver.findElement(By.xpath("(//i[@class='ion-android-close'])[1]")).click();
		//	}
		//WebElement y = driver.findElement(By.xpath("//button[text()='Accept']"));
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)","y");
		//y.click();
		
		//Actions d1 = new Actions(driver);
		//d1.moveToElement(y).click(y).build().perform();
		driver.findElement(By.xpath("//span[text()='E']/following::span[1]")).click();
		driver.findElement(By.xpath("//span[text()='E']/following::span[2]")).click();
		List<WebElement> li = driver.findElements(By.xpath("//ul[contains(@class,'seats-checkout')]/li"));
		for(WebElement e : li) {
			System.out.println(e.getText());
		}
		System.out.println(driver.findElement(By.xpath("(//span[text()='Total ']/following::span)[1]")).getText());
		driver.findElement(By.xpath("//div[@class='right-arrow-modal']/i")).click();
		driver.findElement(By.xpath("(//button[text()='Add'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='right-arrow-modal'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//span[text()='Total']/following::span)[1]")).getText());
		driver.findElement(By.xpath("//input[@placeholder='Your Full Name']")).sendKeys("Sang R");
		driver.findElement(By.xpath("//input[@placeholder='Your Email Address']")).sendKeys("Sangr95@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Your Phone Number']")).sendKeys("9852364715");
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='ion-android-close'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Yes'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
		
		

	}

}
