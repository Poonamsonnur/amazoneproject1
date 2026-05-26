package poonamsonnur.commoncomponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CommonMethods {
	
	// will write all reusable methods here like wait, scrolling , common actios 
	public WebDriver driver;
	
	
 public CommonMethods(WebDriver driver) {
		
		this.driver = driver;
}
	
 
	public void scrollToDown() {
		//System.out.println(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");	
		
	}
	public void scrollToUP() {
		//System.out.println(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,0)");	
		
	}

}
