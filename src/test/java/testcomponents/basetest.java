package testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest {

	public WebDriver driver;
	public Properties prop;

	@BeforeMethod
	public void initializeDriver() throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/global.properties");

		prop.load(fis);

		String browser = prop.getProperty("browser").trim();

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();   // ✅ FIXED LINE
		}

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	}

	@AfterMethod
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}
}
