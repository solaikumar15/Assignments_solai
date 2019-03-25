package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;

	@FindBy(name = "userName")
	private WebElement user;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement signin;

	// WebElemnt of the Login class to be initialized on the driver
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginApplication() {

		user.sendKeys("mercury");
		password.sendKeys("mercury");
		signin.click();

	}

}
