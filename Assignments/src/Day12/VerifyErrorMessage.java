package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("email")).sendKeys("arunachalam.kumar@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("solai123");
		
		driver.findElement(By.id("loginbutton")).click();		
		
		String expectedErrorMessage = "The password that you've entered is incorrect. Forgotten password?";
		//Below line is incorrect. so I am commenting it out
		//WebElement actualErrorMessage = driver.findElement(By.partialLinkText("faq=134401680031995"));
		//Get the actual error message like this -
		String actualErrorMessage = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
				
		if(expectedErrorMessage.equals(actualErrorMessage)) {
			System.out.println("Test Case Passed");
			}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.close();
	}

}
