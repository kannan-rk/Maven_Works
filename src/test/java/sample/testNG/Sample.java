package sample.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	@Test
	private void learnParameter() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("RKKannan18");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("itsRKsaha@22");

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

}
