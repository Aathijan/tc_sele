package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company {

	public static void main(String[] args) throws InterruptedException {
	
		
		//Set the property of the Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aathil J\\eclipse-workspace\\NewCollegeBatch\\Driver\\chromedriver.exe");
		
		//Initialize the webdriver Interface
		
		WebDriver driver = new ChromeDriver();
		
		//Launch the Url

		driver.get("https://omayo.blogspot.com/");

		
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement thead = table.findElement(By.tagName("thead"));
		WebElement trow = thead.findElement(By.tagName("tr"));
		List<WebElement> thdata = trow.findElements(By.tagName("th"));
		for(int i=0;i<thdata.size();i++) {
			WebElement thdatas = thdata.get(i);
			String text = thdatas.getText();
			System.out.println(text);
		}
		
		
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> trows = tbody.findElements(By.tagName("tr"));
		for(int i=0;i<trows.size();i++) {
			WebElement tdrow = trows.get(i);
			List<WebElement> tdata = tdrow.findElements(By.tagName("td"));
			for(int j=0;j<tdata.size();j++) {
			WebElement tdatas = tdata.get(j);
			String text = tdatas.getText();
			System.out.println(text);
			System.out.println(text);
			System.out.println(text);
			
			}
	
		}
		
		
		
	}

}
