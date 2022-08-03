package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookConfirmPage extends BaseClass {
	public BookConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private WebElement orderId;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookItry;
	
	@FindBy(className="login_title")
	private WebElement txtBookConfirmation;
	
	public WebElement getOrderId() {
		return orderId;
	}
	
	public WebElement getBookItry() {
		return bookItry;
	}

	public WebElement getTxtBookConfirmation() {
		return txtBookConfirmation;
	}

	public void bookConfirm() throws IOException {
		String attribute = getAttribute(getOrderId(),"value");
		writeData("Datas", 1, 18, attribute);
		click(getBookItry());
	}
	
}
