package Day17;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ScreenShotAssignment {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
	}
	@Test 
	public void testApplication() throws IOException {
	try {	
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("pass")).sendKeys("Superman");
		driver.findElement(By.name("passLast0")).sendKeys("Junior");
		driver.findElement(By.name("creditnumber")).sendKeys("123-456-7890");
		driver.findElement(By.name("buyFlights")).click();
		
		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	catch(Exception e) {
		takeScreenshot();
		Assert.assertTrue(false);
	}
	}
	private void takeScreenshot() throws IOException {
		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("C:\\SeleniunScreeshots\\ScreenGrab" + (new Random().nextInt()) + ".jpg"));		
	}
	@AfterTest
	
	public void closeBrowser() {
		driver.close();
	}

}
