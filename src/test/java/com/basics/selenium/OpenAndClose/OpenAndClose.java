package test.java.com.basics.selenium.OpenAndClose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import test.java.com.basics.selenium.WebDriverFactory;

public class OpenAndClose {
	static WebDriver driver;

	@BeforeClass
	static void setUpBeforeClass() throws Exception {
		WebDriverFactory factory = new WebDriverFactory();
		driver = factory.Create(BrowserType.GOOGLECHROME);
		driver.manage().window().maximize();
	}

	@AfterClass
	static void tearDownAfterClass() throws Exception {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	void test() {
		driver.get("https://www.toolsqa.com/selenium-webdriver/how-to-use-geckodriver/");
	}

}
