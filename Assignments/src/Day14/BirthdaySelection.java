package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BirthdaySelection {
	
	public static void main(String[] args) {
//		Open the browser
		WebDriver driver = new ChromeDriver();

//		Maximize the Window
		driver.manage().window().maximize();

//		Navigate to the application
		driver.get("https://www.facebook.com/");

//		Select the Date of Birth (Day, Month, Year)
//		Select Month
       WebElement month = driver.findElement(By.id("month"));
       Select m = new Select(month);
       m.selectByValue("10");
       
//		Select Date  
     WebElement day = driver.findElement(By.id("day"));
     Select d = new Select(day);
     d.selectByVisibleText("5");
     
//		Select Year 
     WebElement year = driver.findElement(By.id("year"));
     Select y = new Select(year);
     y.selectByVisibleText("2000");
	
	}

}
