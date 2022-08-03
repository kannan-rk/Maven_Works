package com.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Adactin {
	
	/*@Test
	public void depends() {;
System.out.println("Depends on Methods:");
	}*/
	
//	@Test(dependsOnMethods="depends")
	public static void main() throws IOException, InterruptedException {
		BaseClass baseClass = new BaseClass();

		baseClass.getDriver();

		baseClass.loadUrl("https://adactinhotelapp.com/");

		baseClass.maximize();

		WebElement txtUserName = baseClass.findElementById("username");

		String userName = baseClass.getData("Datas", 1, 0);
		baseClass.type(txtUserName, userName);

		WebElement txtPassword = baseClass.findElementById("password");

		String password = baseClass.getData("Datas", 1, 1);
		baseClass.type(txtPassword, password);

		WebElement btnLogin = baseClass.findElementById("login");
		baseClass.click(btnLogin);

		WebElement dDnLocation = baseClass.findElementById("location");
		baseClass.selectByIndex(dDnLocation, 1);

		WebElement dDnHotel = baseClass.findElementById("hotels");
		baseClass.selectByIndex(dDnHotel, 2);

		WebElement dDnRoomType = baseClass.findElementById("room_type");
		baseClass.selectByIndex(dDnRoomType, 1);

		WebElement dDnNoOfRooms = baseClass.findElementById("room_nos");
		baseClass.selectByIndex(dDnNoOfRooms, 2);

		WebElement txtIn = baseClass.findElementById("datepick_in");
		String data = baseClass.getData("Datas", 1, 6);
		baseClass.type(txtIn, data);

		WebElement txtOut = baseClass.findElementById("datepick_out");
		String data2 = baseClass.getData("Datas", 1, 7);
		baseClass.type(txtOut, data2);

		WebElement dDnAdultsPerRoom = baseClass.findElementById("room_nos");
		baseClass.selectByIndex(dDnAdultsPerRoom, 1);

		WebElement dDnChildrensPerRoom = baseClass.findElementById("child_room");
		baseClass.selectByIndex(dDnChildrensPerRoom, 1);

		WebElement btnSubmit = baseClass.findElementById("Submit");
		baseClass.click(btnSubmit);

		WebElement radioBtn = baseClass.findElementById("radiobutton_0");
		baseClass.click(radioBtn);

		WebElement btnCont = baseClass.findElementById("continue");
		baseClass.click(btnCont);

		WebElement fstName = baseClass.findElementById("first_name");
		String data3 = baseClass.getData("Datas", 1, 10);
		baseClass.type(fstName, data3);

		WebElement lstName = baseClass.findElementById("last_name");
		String data4 = baseClass.getData("Datas", 1, 11);
		baseClass.type(lstName, data4);

		WebElement billAdd = baseClass.findElementById("address");
		String data5 = baseClass.getData("Datas", 1, 12);
		baseClass.type(billAdd, data5);

		WebElement cardNo = baseClass.findElementById("cc_num");
		String data6 = baseClass.getData("Datas", 1, 13);
		baseClass.type(cardNo, data6);

		WebElement dDnccType = baseClass.findElementById("cc_type");
		baseClass.selectByIndex(dDnccType, 1);

		WebElement dDnexpMonth = baseClass.findElementById("cc_exp_month");
		baseClass.selectByIndex(dDnexpMonth, 1);

		WebElement dDnexpYear = baseClass.findElementById("cc_exp_year");
		baseClass.selectByIndex(dDnexpYear, 12);

		WebElement cvvNum = baseClass.findElementById("cc_cvv");
		String data7 = baseClass.getData("Datas", 1, 14);
		baseClass.type(cvvNum, data7);

		WebElement btnBook = baseClass.findElementById("book_now");
		baseClass.click(btnBook);

		baseClass.Sleep(15000);

		WebElement orderId = baseClass.findElementById("order_no");
		String attribute = baseClass.getAttribute(orderId, "value");

		baseClass.writeData("Datas", 1, 15, attribute);
		System.out.println(attribute);

	}
}
