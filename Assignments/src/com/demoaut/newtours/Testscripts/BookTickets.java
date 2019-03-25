package com.demoaut.newtours.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.BookAFlight;
import com.demoaut.newtours.Pages.FlightConfirmation;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

public class BookTickets {

	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");
	}

	@Test
	public void bookingTicketTest() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookAFlight bf = new BookAFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);

		lp.loginApplication();
		ff.selectFlightApplication();
		sf.bookFlightApplication();
		bf.flightConfirmationapplication("Superman", "Junior", "123-456-789");

		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = fc.getMessage().getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
