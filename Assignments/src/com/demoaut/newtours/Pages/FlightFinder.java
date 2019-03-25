package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	WebDriver driver;

	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=\"radio\"]:nth-child(2)")
	private WebElement businessClass;
	@FindBy(name = "airline")
	private WebElement airline;
	@FindBy(name = "findFlights")
	private WebElement submit;

	// WebElemnt of the Login class to be initialized on the driver
	public FlightFinder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectFlightApplication() {
		businessClass.click();
		Select select = new Select(airline);
		select.selectByVisibleText("Pangea Airlines");
		submit.click();
	}

}
