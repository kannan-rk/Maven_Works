package com.junit;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class HotelApp extends BaseClass {

	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
	}

	@Test
	public void Adactin() throws IOException, InterruptedException, AWTException {
		WebElement txtUserName = findElementById("username");
		type(txtUserName, getData("Datas", 1, 0));

		WebElement txtPassword = findElementById("password");
		type(txtPassword, getData("Datas", 1, 1));

		WebElement btnLogin = findElementById("login");
		click(btnLogin);

		WebElement textLoginMsg = findElementById("username_show");
		String msg = getAttribute(textLoginMsg, "value");
		Assert.assertEquals("Verify welcome message", "Hello RKKannan18!", msg);

		WebElement dDnLocation = findElementById("location");
		selectByIndex(dDnLocation, 1);

		WebElement dDnHotel = findElementById("hotels");
		selectByIndex(dDnHotel, 2);

		WebElement dDnRoomType = findElementById("room_type");
		selectByIndex(dDnRoomType, 1);

		WebElement dDnNoOfRooms = findElementById("room_nos");
		selectByIndex(dDnNoOfRooms, 2);

		WebElement txtIn = findElementById("datepick_in");
		String data = getData("Datas", 1, 6);
		type(txtIn, data);

		WebElement txtOut = findElementById("datepick_out");
		String data2 = getData("Datas", 1, 7);
		type(txtOut, data2);

		WebElement dDnAdultsPerRoom = findElementById("room_nos");
		selectByIndex(dDnAdultsPerRoom, 1);

		WebElement dDnChildrensPerRoom = findElementById("child_room");
		selectByIndex(dDnChildrensPerRoom, 1);

		WebElement btnSubmit = findElementById("Submit");
		click(btnSubmit);

		Sleep(3000);

		WebElement txtSelectHotel = findElementByXpath("//td[text()='Select Hotel ']");
		String msgSelect = getText(txtSelectHotel);
		Assert.assertEquals("Verify select hotel", "Select Hotel", msgSelect);

		Sleep(10000);

		WebElement radioBtn = findElementById("radiobutton_0");
		click(radioBtn);

		WebElement btnCont = findElementById("continue");
		click(btnCont);

		WebElement txtBookAHotel = findElementByXpath("//td[text()='Book A Hotel ']");
		String msgBook = getText(txtBookAHotel);
		Assert.assertEquals("Verify book a hotel", "Book A Hotel", msgBook);

		WebElement fstName = findElementById("first_name");
		String data3 = getData("Datas", 1, 10);
		type(fstName, data3);

		WebElement lstName = findElementById("last_name");
		String data4 = getData("Datas", 1, 11);
		type(lstName, data4);

		WebElement billAdd = findElementById("address");
		String data5 = getData("Datas", 1, 12);
		type(billAdd, data5);

		WebElement cardNo = findElementById("cc_num");
		String data6 = getData("Datas", 1, 13);
		type(cardNo, data6);

		WebElement dDnccType = findElementById("cc_type");
		selectByIndex(dDnccType, 1);

		WebElement dDnexpMonth = findElementById("cc_exp_month");
		selectByIndex(dDnexpMonth, 1);

		WebElement dDnexpYear = findElementById("cc_exp_year");
		selectByIndex(dDnexpYear, 12);

		WebElement cvvNum = findElementById("cc_cvv");
		String data7 = getData("Datas", 1, 17);
		type(cvvNum, data7);

		WebElement btnBook = findElementById("book_now");
		click(btnBook);

		WebElement txtBookConfirm = findElementByXpath("(//td[@colspan='2'])[3]");
		String msgBookConfirm = getText(txtBookConfirm);
		Assert.assertEquals("Verify book confirmation", "Back", msgBookConfirm);

		Sleep(15000);

		WebElement orderId = findElementById("order_no");
		String attribute = getAttribute(orderId, "value");

		writeData("Datas", 1, 18, attribute);
		System.out.println(attribute);
		
		WebElement lnkBookedItry = findElementByXpath("//a[text()='Booked Itinerary']");
		click(lnkBookedItry);
		
		WebElement txtBox = findElementById("order_id_text");
		String data8 = getData("Datas", 1, 18);
		type(txtBox, data8);
		
		Sleep(3000);
		
		WebElement btnGo = findElementById("search_hotel_id");
		click(btnGo);
		
		Sleep(3000);
		
		WebElement btnCancel = findElementByXpath("(//input[@type='button'])[1]");
		click(btnCancel);
		
		Sleep(3000);
		
		/*
		for (int i = 1; i <12; i++) {
			robotTab();
		}
		
		robotEnter();
		*/
		
		acceptAlert();
		
		

	}

}
