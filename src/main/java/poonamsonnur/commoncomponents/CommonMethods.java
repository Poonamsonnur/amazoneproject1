package poonamsonnur.commoncomponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	private WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void scrollToDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	}

	public void scrollToUP() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}
}