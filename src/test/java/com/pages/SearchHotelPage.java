package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
public SearchHotelPage() {
	PageFactory.initElements(driver, this);
}

	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotel;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckIn;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOut;

	@FindBy(id = "room_nos")
	private WebElement dDnAdultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	
	@FindBy(id="username_show")
	private WebElement txtWelcomePage;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getTxtWelcomePage() {
		return txtWelcomePage;
	}

	public void searchHotel(String location, String hotels, String roomType, String noOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		selectOptionByText(getdDnLocation(), location);
		selectOptionByText(getdDnHotel(), hotels);
		selectOptionByText(getdDnRoomType(), roomType);
		selectOptionByText(getdDnNoOfRooms(), noOfRooms);
		type(getTxtCheckIn(), checkInDate);
		type(getTxtCheckOut(), checkOutDate);
		selectOptionByText(getdDnAdultsPerRoom(), adultsPerRoom);
		selectOptionByText(getdDnChildrenPerRoom(), childrenPerRoom);
		click(btnSubmit);
	}

}
