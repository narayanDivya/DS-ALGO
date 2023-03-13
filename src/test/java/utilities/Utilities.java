package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utilities {
	
	public static WebDriver driver = CrossBrowser.getDriver();
	
	public void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static boolean clickElement(WebElement element) throws NoSuchElementException {
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
			if(ele.isDisplayed() && ele.isEnabled()) {
				ele.click();
			}else {
				throw new ElementNotInteractableException("Element is not interactable");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
