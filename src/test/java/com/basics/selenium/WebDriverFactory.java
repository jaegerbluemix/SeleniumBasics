package test.java.com.basics.selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class WebDriverFactory {

	private WebDriver driver;

	public WebDriverFactory() {

	}

	public WebDriver Create(String Browsertype) {

		switch (Browsertype) {
		case BrowserType.GOOGLECHROME:
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case BrowserType.FIREFOX:
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "geckodriver.exe");
			driver = new FirefoxDriver();
			// If the drivers exe are added to %PATH% variable, then use below format.
			// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			// capabilities.setCapability("marionette", true);
			// WebDriver driver = new FirefoxDriver(capabilities);
			break;
		case BrowserType.IE:
			System.setProperty("webdriver.ie.driver",
					File.separator + "drivers" + File.separator + "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		default:
			System.out.println("Not a Valid Browser. . .");
			break;
		}

		return driver;
	}

}
