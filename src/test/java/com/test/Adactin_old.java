package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin_old {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement userId = driver.findElement(By.id("username"));
		userId.sendKeys("RKKannan18");
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys("itsRKsaha@22");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

		WebElement dDnLocation = driver.findElement(By.id("location"));
		Select select = new Select(dDnLocation);
		select.selectByIndex(1);

		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		Select select1 = new Select(dDnHotel);
		select1.selectByIndex(2);

		WebElement dDnRoom = driver.findElement(By.id("room_type"));
		Select select2 = new Select(dDnRoom);
		select2.selectByIndex(4);

		WebElement dDnRooms = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(dDnRooms);
		select3.selectByIndex(1);

		WebElement dDnIn = driver.findElement(By.id("datepick_in"));
		dDnIn.clear();
		dDnIn.sendKeys("09/07/2022");
		WebElement dDnOut = driver.findElement(By.id("datepick_out"));
		dDnOut.clear();
		dDnOut.sendKeys("10/07/2022");

		WebElement dDnAdults = driver.findElement(By.id("room_nos"));
		Select select4 = new Select(dDnAdults);
		select4.selectByIndex(1);

		WebElement dDnChildNos = driver.findElement(By.id("child_room"));
		Select select5 = new Select(dDnChildNos);
		select5.selectByIndex(1);

		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();

		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();

		WebElement btnCont = driver.findElement(By.id("continue"));
		btnCont.click();

		WebElement fstName = driver.findElement(By.id("first_name"));
		fstName.sendKeys("Ganesh");
		WebElement lstName = driver.findElement(By.id("last_name"));
		lstName.sendKeys("PL");
		WebElement billAdd = driver.findElement(By.id("address"));
		billAdd.sendKeys("abc block,def colony,ghi city");

		WebElement cardNo = driver.findElement(By.id("cc_num"));
		cardNo.sendKeys("4128456589766577");

		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select select6 = new Select(ccType);
		select6.selectByIndex(3);

		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(expMonth);
		select7.selectByVisibleText("February");

		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(expYear);
		select8.selectByVisibleText("2022");

		WebElement cvvNum = driver.findElement(By.id("cc_cvv"));
		cvvNum.sendKeys("536");
		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();
		Thread.sleep(15000);
		WebElement orderId = driver.findElement(By.id("order_no"));
		String text = orderId.getAttribute("value");
		System.out.println("OrderID:" + text);

	}

}
