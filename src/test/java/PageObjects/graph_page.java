package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class graph_page {
	public WebDriver driver = CrossBrowser.getDriver();
	String loginUrl = ConfigReader.getSignInPage();
	By datastructuredropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By graphdropdown = By.xpath("//a[text()='Graph']");
	By output = By.id("output");
	By runButton = By.xpath("//button[contains(text(),'Run')]");
	
	By graphPage = By.xpath("//a[text()='Graph' and @href='graph']");
	By graphRepresentations = By.xpath("//a[contains(text(),'Graph Representations')]");
	
	
	public void graphSignIn() {
		driver.get(loginUrl);
	}
	
	public void selectGraph() {
		driver.findElement(datastructuredropdown).click();
		driver.findElement(graphdropdown).click();
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void getOutput() {
		String outputValue = driver.findElement(output).getText();
		LoggerLoad.info("Output value is: "+outputValue);
		
	}
	
	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}
	public void clickGraphPage() {
		driver.findElement(graphPage).click();
	}
	public void clickGraphRepresentations() {
		driver.findElement(graphRepresentations).click();
	}
}
