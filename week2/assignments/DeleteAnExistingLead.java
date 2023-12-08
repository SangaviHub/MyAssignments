package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;

public class DeleteAnExistingLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		WebElement e = driver.findElement(By.xpath("//span[text()='Phone']"));
		e.click();
		WebElement d = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(d));
		((JavascriptExecutor)driver).executeScript("arguments[0].click;",d);
		d.sendKeys("8765432789");
		d.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.findElement(By.xpath("(//img[@class='x-grid3-sort-icon'])[1]")).click();
		WebDriverWait wat = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement web = wat.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",web);
		String s = driver.findElement(By.xpath("(//span[text()='Company Name']/following::span)[1]")).getText();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(s);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String  msg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(msg.equals("No records to display"))
			System.out.println(msg);
		driver.close();
		

	}

}
