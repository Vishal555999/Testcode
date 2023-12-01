package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		String chromepath = System.getProperty("user.dir") + "\\RESOURSES\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		ChromeOptions co = new ChromeOptions();
		driver = new ChromeDriver(co);
		// WebDriverManager.chromedriver().setup();

		co.addArguments("remote-allow-origins=*");
		co.addArguments("--disable-notifications");

		getDriver().get("");
		getDriver().manage().window().maximize();
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		getDriver().close();
	}

}
