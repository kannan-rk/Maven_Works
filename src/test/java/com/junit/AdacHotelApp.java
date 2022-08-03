package com.junit;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.pages.BookConfirmPage;
import com.pages.BookHotelPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class AdacHotelApp extends BaseClass {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
	}

	@Before
	public void beforeMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}

	@Test
	public void AdactinHotelApp() throws IOException, InterruptedException {

		// Login
		LoginPage loginPage = new LoginPage();
		loginPage.login(getData("Datas", 1, 0), getData("Datas", 1, 1));

		// Search hotel
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		Assert.assertEquals("Verify after login", "Hello RKKannan18!",
				getAttribute(searchHotelPage.getTxtWelcomePage(), "value"));

		searchHotelPage.searchHotel(getData("Datas", 1, 2), getData("Datas", 1, 3), getData("Datas", 1, 4),
				getData("Datas", 1, 5), getData("Datas", 1, 6), getData("Datas", 1, 7), getData("Datas", 1, 8),
				getData("Datas", 1, 9));

		// Select hotel
		SelectHotelPage selectHotelPage = new SelectHotelPage();
		Assert.assertEquals("Verify select hotel text", "Select Hotel", getText(selectHotelPage.getTxtSelectHotel()));

		selectHotelPage.selectHotel();

		// Book hotel
		BookHotelPage bookHotelPage = new BookHotelPage();
		Assert.assertEquals("Verify Book a Hotel text", "Book A Hotel", getText(bookHotelPage.getTxtBookAHotel()));

		bookHotelPage.bookHotel(getData("Datas", 1, 10), getData("Datas", 1, 11), getData("Datas", 1, 12),
				getData("Datas", 1, 13), getData("Datas", 1, 14), getData("Datas", 1, 15), getData("Datas", 1, 16),
				getData("Datas", 1, 17));

		// Book confirm
		BookConfirmPage bookConfirmPage = new BookConfirmPage();
		Assert.assertEquals("Verify Book Confirmation text", "Booking Confirmation", getText(bookConfirmPage.getTxtBookConfirmation()));
		bookConfirmPage.bookConfirm();

		// Book cancel
		CancelBookingPage cancelBookingPage = new CancelBookingPage();
		Assert.assertEquals("Verify booking cancell text", "", getText(cancelBookingPage.getTxtBookingHasCancelled()));
		cancelBookingPage.cancelBooking();

	}

	@After
	public void afterMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}

}
