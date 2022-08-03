package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCardNo;

	@FindBy(id = "cc_type")
	private WebElement dDnCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement dDnCardExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement dDnCardExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCardCvvNo;

	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	
	@FindBy(id="order_no")
	private WebElement orderId;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtBookAHotel;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getdDnCardType() {
		return dDnCardType;
	}

	public WebElement getdDnCardExpMonth() {
		return dDnCardExpMonth;
	}

	public WebElement getdDnCardExpYear() {
		return dDnCardExpYear;
	}

	public WebElement getTxtCardCvvNo() {
		return txtCardCvvNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getTxtBookAHotel() {
		return txtBookAHotel;
	}

	public void bookHotel(String firstName, String lastName, String address, String cardNumber, String cardType,
			String cardExpMonth, String cardExpYear, String cardCvvNo) throws InterruptedException {
		type(getTxtFirstName(), firstName);
		type(getTxtLastName(), lastName);
		type(getTxtAddress(), address);
		type(getTxtCardNo(), cardNumber);
		selectOptionByText(getdDnCardType(), cardType);
		selectOptionByText(getdDnCardExpMonth(), cardExpMonth);
		selectOptionByText(getdDnCardExpYear(), cardExpYear);
		type(getTxtCardCvvNo(), cardCvvNo);
		click(getBtnBookNow());
		Sleep(10000);
	}

}
