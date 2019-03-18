package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Instagram {
	
	public static void main(String[] args) throws InterruptedException {
		
//		Open the browser
		WebDriver driver = new ChromeDriver();
		
//		Maximize the window
		driver.manage().window().fullscreen();
		
//		Navigate to the application
		driver.get("https://www.facebook.com/");
		
//		Click on Instagram Application
		driver.findElement(By.linkText("Instagram")).click();	
		
		System.out.println("Test Case Passed");
//		A new Tab should open and Select Language option in the bottom of the screen
		WebElement language = driver.findElement(By.cssSelector("#react-root > section > footer > div > nav > ul > li:nth-child(11) > span > select"));
		Select select = new Select(language);
		select.selectByValue("it");
//		Select Language
	}

}
