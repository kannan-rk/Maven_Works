package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement ratioBtn;

	@FindBy(id = "continue")
	private WebElement btnContinue;
	
	@FindBy(className="login_title")
	private WebElement txtSelectHotel;

	public WebElement getRatioBtn() {
		return ratioBtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}

	public void selectHotel() {
		click(getRatioBtn());
		click(getBtnContinue());
	}

}
