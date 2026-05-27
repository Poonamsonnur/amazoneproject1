package poonamsonnur.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import poonamsonnur.commoncomponents.CommonMethods;

import java.time.Duration;

public class loginpage {

	public WebDriver driver;
	CommonMethods commonMethods;

	public loginpage(WebDriver driver) {

		this.driver = driver;
		commonMethods = new CommonMethods(driver);
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//input[@formcontrolname='userEmail']")
	WebElement email;

	@FindBy(id = "userPassword")
	WebElement password;

	@FindBy(id = "login")
	WebElement login;

	@FindBy(xpath = "//button[normalize-space()='Sign Out']")
	WebElement signout;

	@FindBy(xpath = "//body[1]/app-root[1]/app-dashboard[1]/section[1]/form[1]/div[3]/div[2]/input[1]")
	WebElement fashioncheck;
	

	public void login(String email1, String pwd) {
		email.sendKeys(email1);
		password.sendKeys(pwd);
		login.click();
	}

	public void logout() {
		signout.click();
	}

	public void Selectfashion() {
		//commonMethods.scrollToDown();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(fashioncheck));		
		fashioncheck.click();
	}

	public void GoTo() {
		// TODO Auto-generated method stub
		driver.get("https://rahulshettyacademy.com/client/#/dashboard/dash");
	}
}