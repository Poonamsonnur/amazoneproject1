package poonamsonnur.pages;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import poonamsonnur.commoncomponents.CommonMethods;

public class loginpage extends CommonMethods {
	
	public WebDriver driver;
	CommonMethods commonMethods;
	
	public loginpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		 commonMethods = new CommonMethods(driver);
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement email;
	
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	@FindBy (xpath= "//button[normalize-space()='Sign Out']")
	WebElement signout;
	
	@FindBy (xpath= "(//div[@class='py-2 ml-3']//input)[2]")
	WebElement womencheck;
	
	
	public void GoTo() {
		
		 driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		}
	
	
	public void login( String email1 ,String   pwd) {
	email.sendKeys(email1);
	password.sendKeys(pwd);
	login.click();
			
	}
	
	public void logout() {
		signout.click();
		
	}
	
	public void SelectWomen() throws InterruptedException {
		commonMethods.scrollToDown();
		Thread.sleep(200);
		womencheck.click();
	}

	

	
		
	
	
	

	
	



}
