package com.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
	
	@Test(dependsOnMethods="sample.testNG.WorksOnDate.todayDate")
	public void alert() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("//a[contains(@href,'#Textbox')]"));
		btn.click();

		WebElement btn1 = driver.findElement(By.xpath("//button[contains(@onclick,'promptbox()')]"));
		btn1.click();

		Alert al = driver.switchTo().alert();
		al.sendKeys("Kannan");
		al.accept();

		WebElement txt = driver.findElement(By.id("demo1"));
		String text = txt.getText();
		System.out.println(text);
		
		driver.quit();
	}
}
