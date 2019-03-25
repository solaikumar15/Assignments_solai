package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	@FindBy(name="passFirst0")
	private WebElement firstName;
	@FindBy(name="passLast0")
	private WebElement lastName;
	@FindBy(name="creditnumber")
	private WebElement ccNumber;
	@FindBy(name="buyFlights")
	private WebElement securePurchase;
	
	// WebElemnt of the Login class to be initialized on the driver
	public BookAFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void flightConfirmationapplication(String fName, String lName, String creditCardNumber) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		ccNumber.sendKeys(creditCardNumber);
		securePurchase.click();
	}
	
}
