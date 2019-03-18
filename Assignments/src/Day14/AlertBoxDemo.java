package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {
	public static void main(String[] args) {
//		Open the browser
		WebDriver driver = new ChromeDriver();
//		Maximize the Window
		driver.manage().window().maximize();

//		Navigate to the application
		driver.get("https://whitecircleschool.com/alertboxdemo/");

//		Click on Try Button
		//Here you had to write the logic to check if aler box is present
		driver.findElement(By.cssSelector("body > div.elementor.elementor-599 > div > div > section.elementor-element.elementor-element-9860042.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section > div > div > div > div > div > div > div > button")).click();

//		Click on OK button		
		driver.switchTo().alert().accept();
		
	}


}
