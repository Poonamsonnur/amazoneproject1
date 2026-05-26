package testcases;

import org.testng.annotations.Test;

import poonamsonnur.commoncomponents.CommonMethods;
import poonamsonnur.pages.loginpage;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testcomponents.basetest;

public class logintest extends basetest {
	WebDriver driver;
	loginpage loginpage;
	CommonMethods CommonMethods;
	
	@Test
	public void ValidLogin() throws InterruptedException  {	
		loginpage = new loginpage(driver);
		loginpage.login("poonamsonnur@gmail.com", "Poonam@123");
		loginpage.SelectWomen();
			
	}
	

//	@Test
//	public void SelectWomen() throws InterruptedException {
//		loginpage loginpage = new loginpage(driver);
//		CommonMethods CommonMethods = new CommonMethods(driver);
//		loginpage.SelectWomen();
//		Thread.sleep(500);
//	}
//	
//	@Test
//	public void Logout() throws InterruptedException {
//		CommonMethods.scrollToUP();
//		Thread.sleep(500);
//		loginpage.logout();
//	}
////	
	
	
}
