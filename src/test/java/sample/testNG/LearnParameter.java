package sample.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnParameter {

	@Parameters({"userName","password"})
	@Test
	private void adactin(String user, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement userId = driver.findElement(By.id("username"));
		userId.sendKeys(user);
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
}
