package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@Before
	public void beforeMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}

	@Test
	public void login() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("RKKannan18");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("itsRKsaha@22");

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@After
	public void afterMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

}
