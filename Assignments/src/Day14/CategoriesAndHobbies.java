package Day14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesAndHobbies {
	static WebDriver driver;

	public static boolean advPresent() {

		boolean advVisible;
		try {
			advVisible = driver.findElement(By.xpath("(//button[contains(@data-click,'close')])[1]")).isDisplayed();

		} catch (Exception e) {
			advVisible = false;
		}
		return advVisible;
	}

	public static void main(String[] args) throws InterruptedException {
//		Open the browser		
		driver = new ChromeDriver();
//		Maximize the Window
		driver.manage().window().maximize();

//		Navigate to the application
		driver.get("https://www.barnesandnoble.com/");

//		Click on I'll Pass button in the advertisement page to close
		if (advPresent()) {
			driver.findElement(By.xpath("(//button[contains(@data-click,'close')])[1]")).click();
		}

//		Hover the mouse over Gift,Home&Office Tab
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("expanded")));
		WebElement giftHomeandOffice = driver.findElement(By.linkText("Gift, Home & Office"));
		Actions action = new Actions(driver);
		action.moveToElement(giftHomeandOffice).perform();

////	Click on Hobbies link from the Categories List

		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Hobbies")));

		driver.findElement(By.linkText("Hobbies")).click();

//		Select "Best Sellers" from the Sort By drop down list
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sortProducts1-replacement")));
		driver.findElement(By.id("sortProducts1-replacement")).click();
		driver.findElement(By.linkText("Highly Rated")).click();

	}
//This also is correct
}
