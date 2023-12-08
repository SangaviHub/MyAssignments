package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
                                                                                                                     

public class TestLeafDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(crmsfa.getText());// Element verification
		crmsfa.click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(source);
		dd.selectByIndex(4);
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mark = new Select(marketing);
		mark.selectByValue("CATRQ_AUTOMOBILE");
		mark.selectByVisibleText("Car and Driver");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select s = new Select(industry);
		s.selectByValue("IND_HARDWARE");
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select o = new Select(owner);
		o.selectByVisibleText("Partnership");
		driver.close();

	}

}
