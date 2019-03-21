package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTAssignment {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void openbrowser(String browser) {

		if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.setCapability("marionette", false);
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
	}

	@Test
	public void verifySignInBtnStatus() {
		boolean signinBtnStatus = driver.findElement(By.id("login-submit")).isEnabled();
		Assert.assertFalse(signinBtnStatus);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
