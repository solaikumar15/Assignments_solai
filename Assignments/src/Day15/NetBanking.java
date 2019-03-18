package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NetBanking {
	static WebDriver driver;
//	public static boolean advtPresent() {
//		
//		boolean advtVisible = true;
//		try {
//		advtVisible= driver.findElement(By.id("div-close")).isDisplayed();	
//		}
//		catch(Exception e) {
//			advtVisible = false;
//		}
//		return advtVisible; 
//	}
	
	
	public static void main(String[] args) throws InterruptedException {
	//	Open the browser
	driver = new ChromeDriver();
//	Maximize the window
	driver.manage().window().fullscreen();	
	
//	Navigate to the application
	driver.get("https://www.hdfcbank.com/");
	
//	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("loginsubmit")));
	
//	Click  on the Login button to open a new window
	driver.findElement(By.id("loginsubmit")).click();
	
//	if (advtPresent()){
//		driver.findElement(By.id("div-close")).click();
//	}
// close the advertisement by clicking the 	
	driver.findElement(By.id("div-close")).click();	

	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CONTINUE TO NETBANKING")));

	
//	click on CONTINUE TO NETBANKING
	driver.findElement(By.linkText("CONTINUE TO NETBANKING")).click();
	
//	Enter Customer ID as: 35426789
	driver.switchTo().frame(2);
	driver.findElement(By.name("fldLoginUserId")).sendKeys("35426789");

}
}
