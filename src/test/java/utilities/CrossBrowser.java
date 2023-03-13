package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	public static WebDriver driver;
	
	public WebDriver setupDriver (String browser) throws Throwable {
				
		if(browser.equalsIgnoreCase("Chrome")) {
			LoggerLoad.info("Testing in Chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			
			LoggerLoad.info("Testing in Firefox browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			
			LoggerLoad.info("Testing in Edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		else {
			throw new IllegalArgumentException("Invalid browser name");
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public static void closeDriver() {
		
		driver.quit();
	}
	

}
