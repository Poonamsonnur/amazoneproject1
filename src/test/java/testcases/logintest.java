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
		Thread.sleep(500);
		// Select Women
		loginpage.SelectWomen();
		Thread.sleep(500);

		// Logout
		commonMethods.scrollToUP();
		Thread.sleep(500);
		loginpage.logout();
	}
}