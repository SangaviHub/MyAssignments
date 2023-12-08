package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement d = driver.findElement(By.id("twotabsearchtextbox"));
		d.sendKeys("Phones");
		WebElement f = driver.findElement(By.id("nav-search-submit-button"));
		f.click();
		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(ele.size());
		List<Integer> i = new ArrayList<Integer>();
		for(WebElement w :ele) {
			
				System.out.println(w.getText());
				String text = w.getText();
				String r = text.replaceAll(",", "");
				int n = Integer.parseInt(r);
				i.add(n);
				System.out.println(i);
				Collections.sort(i);
				System.out.println(i);
				int m = Collections.min(i);
				System.out.println(m);
				
			}
		}

	}


