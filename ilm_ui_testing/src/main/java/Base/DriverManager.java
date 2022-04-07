package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Utility.Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
			
	@BeforeSuite
	public static void CreateDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Util.properties("config", "Applink"));
		driver.manage().window().maximize();
		webDriver.set(driver);
		webDriver.get().manage().timeouts()
				.implicitlyWait(Integer.parseInt((Util.properties("config", "ImplicitWait"))), TimeUnit.SECONDS);
	}

	@AfterSuite
	public synchronized void afterSuite() {
//		webDriver.get().close();
//		webDriver.get().quit();
	}

}