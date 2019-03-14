package Day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Assignment1 {
	public static void main(String[] args) {
		
		try {

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");
		driver.manage().window().fullscreen();

		driver.findElement(By.id("email")).sendKeys("solai.muthukumar@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("Password123");

		driver.findElement(By.id("loginbutton")).click();

		String expectedErrorMessage = "The password you’ve entered is incorrect. Forgot Password?";
				
		System.out.println("Before partial link test");
		String actualErrorMessage = driver.findElement(By.tagName("a")).getText();
		
		System.out.println("Before Test Case 3 check" + actualErrorMessage);

		if (expectedErrorMessage.equals(actualErrorMessage)) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
		//driver.close();
	
	} catch (Exception e) {
		
		System.out.println("Error Message" + e.getLocalizedMessage());
	}
	}
}
