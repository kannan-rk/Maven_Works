package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_id_text")
	private WebElement searchBookItry;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btnCancel;
	
	@FindBy(className="reg_error")
	private WebElement txtBookingHasCancelled;

	public WebElement getSearchBookItry() {
		return searchBookItry;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getTxtBookingHasCancelled() {
		return txtBookingHasCancelled;
	}

	public void cancelBooking() throws IOException, InterruptedException {
		String data = getData("Datas", 1, 18);
		type(getSearchBookItry(), data);
		click(btnGo);
		click(btnCancel);
		Sleep(2000);
		alertAccept();
	}

}
