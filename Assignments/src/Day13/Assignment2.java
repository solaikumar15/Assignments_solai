package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.barnesandnoble.com/");
		
		//It is not fullscreen, it is maximize()
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("bx-element-937133-txSrrII")));
			
		driver.findElement(By.id("bx-element-937133-txSrrII")).click();
		
//		WebDriverWait wait1 = new WebDriverWait(driver,5);
//		wait1.until(ExpectedConditions.elementToBeClickable(By.id("userLinks")));
		
		WebElement signIn = driver.findElement(By.id("userLinks"));
		Actions action = new Actions (driver);
		action.moveToElement(signIn).perform();
		System.out.println("Test case pass");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.linkText("loginForgotPassword")).click();
		
		driver.findElement(By.id("email")).sendKeys("solai.muthukumar@gmail.com");
		
		driver.findElement(By.id("resetPwSubmit")).click();
		
		driver.findElement(By.id("resetPwSubmit")).click();
		
			}

}
