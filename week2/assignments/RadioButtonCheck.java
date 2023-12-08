package week2.assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class RadioButtonCheck {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		WebElement radio = driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		radio.click();
		radio.click();
		Assert.assertFalse(radio.isSelected());
		String str = driver.findElement(By.xpath("//input[@type='radio' and @value='Option3']")).getAttribute("checked");
		if(str.equalsIgnoreCase("true"))
		{
			System.out.println(driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).getText());
		}
		String s = driver.findElement(By.xpath("//input[@type='radio' and @value='21-40 Years']")).getAttribute("checked");
		if(s.equalsIgnoreCase("true"))
		{
			System.out.println(driver.findElement(By.xpath("//label[text()='21-40 Years']")).getText());
		}
		else
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		}
		driver.close();
		
	}

}
