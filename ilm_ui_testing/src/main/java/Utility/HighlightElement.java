package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HighlightElement {
	public static WebDriver driver;
	/*
	public HighlightElement(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	*/
	 
	
	public static void highLighterMethod(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", element);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", element);
	}

	public static void highLighterMethod_List(WebDriver driver, By by) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", by);
    }

	
}
