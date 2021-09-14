package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\intel\\eclipse-workspace\\Demoo\\driver\\chromedriver.exe" ); 
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement src = driver.findElement(By.xpath("//input[@type='text']"));
		src.sendKeys("Realme");
		WebElement clk = driver.findElement(By.xpath("//input[@type='submit']"));
		clk.click();	

		
	}
}
