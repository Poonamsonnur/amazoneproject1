package poonamsonnur.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import poonamsonnur.commoncomponents.CommonMethods;

public class loginpage {

	public WebDriver driver;
	CommonMethods commonMethods;

	public loginpage(WebDriver driver) {

		this.driver = driver;
		commonMethods = new CommonMethods(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userEmail")
	WebElement email;

	@FindBy(id = "userPassword")
	WebElement password;

	@FindBy(id = "login")
	WebElement login;

	@FindBy(xpath = "//button[normalize-space()='Sign Out']")
	WebElement signout;

	@FindBy(xpath = "(//div[@class='py-2 ml-3']//input)[2]")
	WebElement womencheck;

	public void login(String email1, String pwd) {
		email.sendKeys(email1);
		password.sendKeys(pwd);
		login.click();
	}

	public void logout() {
		signout.click();
	}

	public void SelectWomen() {
		commonMethods.scrollToDown();
		womencheck.click();
	}
}