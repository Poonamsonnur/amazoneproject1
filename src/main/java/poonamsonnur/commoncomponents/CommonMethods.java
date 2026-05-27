package poonamsonnur.commoncomponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class CommonMethods {

    WebDriver driver;

    // Constructor
    public CommonMethods(WebDriver driver) {

        this.driver = driver;
    }

    // Scroll Up
    public void scrollToUP() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,-500)");
    }

    // Scroll Down
    public void scrollToDown() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");
    }
}