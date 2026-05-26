package testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import poonamsonnur.commoncomponents.CommonMethods;
import poonamsonnur.pages.loginpage;

public class basetest {
	
	public WebDriver driver;

		
	
	// this will have driver initialized, teaup , teardwon 
	
	
 public WebDriver driverInitialization() throws IOException {
	 
	 Properties prop = new Properties();
	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java/poonamsonnur//resources//GlobalData.properties");
	 
	 prop.load(fis);
	 String browsername = prop.getProperty("browser");
	 
	 if (browsername.equalsIgnoreCase("chrome")) {
		 
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	
	 }
	 else if (browsername.equalsIgnoreCase("Firfox")) {
		 //firefox driver setup
		 
	  }
	 else if (browsername.equalsIgnoreCase("edge")) {
		 //edge driver setup
		 
	  }
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize(); 
	 
	 return driver;
	 
 }
 
 @BeforeTest
 public poonamsonnur.pages.loginpage launchApp() throws IOException {
	 
	 driver = driverInitialization();
	 loginpage  loginpage = new loginpage(driver);
	
	  loginpage.GoTo();
	  return loginpage;

	 
 }
 
// @AfterTest
// public void teardown() {
//	 driver.quit();
// }
// 
 

}
