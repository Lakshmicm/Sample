package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\intel\\eclipse-workspace\\Demoo\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Lakshmi");
		WebElement ltnme = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 ltnme.sendKeys("Srinivasan");
	}
}
