package testcases;

import org.testng.annotations.Test;

import poonamsonnur.pages.loginpage;
import poonamsonnur.commoncomponents.CommonMethods;
import testcomponents.basetest;

public class logintest extends basetest {

	loginpage loginpage;
	CommonMethods commonMethods;

	@Test
	public void ValidLoginAndSelectWomenAndLogout() throws InterruptedException {

		loginpage = new loginpage(driver);
		commonMethods = new CommonMethods(driver);

		// Login
		loginpage.login("poonamsonnur@gmail.com", "Poonam@123");
		// Select Fashion
		//commonMethods.scrollToDown();

		loginpage.Selectfashion();
		Thread.sleep(500);
	
		// Logout
//		commonMethods.scrollToUP();

		loginpage.logout();
		
		
	}
	
	
}