package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class array_page {
	public WebDriver driver = CrossBrowser.getDriver();
	String loginUrl = ConfigReader.getSignInPage();
	
	By datastructuredropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By arraysdropdown = By.xpath("//a[text()='Arrays']");
	By output = By.id("output");
	By runButton = By.xpath("//button[contains(text(),'Run')]");
	
	By arraysInPython = By.xpath("//a[contains(text(),'Arrays in Python')]");
	By arraysUsingList = By.xpath("//a[contains(text(),'Arrays Using List')]");
	By basicOperationsInLists = By.xpath("//a[contains(text(),'Basic Operations in Lists')]");
	By applicationsOfArray = By.xpath("//a[contains(text(),'Applications of Array')]");
	
	By practiceQuetions = By.xpath("//a[contains(text(),'Practice Questions')]");
	By searchArray = By.xpath("//a[contains(text(),'Search the array')]");
	By maxConsecutive = By.xpath("//a[contains(text(),'Max Consecutive Ones')]");
	By findEvenNumbers=By.xpath("//a[contains(text(),'Even Number')]");
	By sortedArray=By.xpath("//a[contains(text(),'Sorted Array')]");
	
	public void arraySignIn() {
		driver.get(loginUrl);
	}
	
	public void selectArray() {
		driver.findElement(datastructuredropdown).click();
		driver.findElement(arraysdropdown).click();
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
	public void clickArraysInPython(){
		driver.findElement(arraysInPython).click();
		
	}
	public void clickArraysUsingList() {
		driver.findElement(arraysUsingList).click();
	}
	public void clickBasicOperationsInLists() {
		driver.findElement(basicOperationsInLists).click();
	}
	public void clickApplicationsOfArray() {
		driver.findElement(applicationsOfArray).click();
	}
	 public String getErrorText() throws InterruptedException
     {
  	   Thread.sleep(2000);
  	   String errorMsg = driver.switchTo().alert().getText();
  	   LoggerLoad.info("Error Message Is : "+errorMsg);
  	   driver.switchTo().alert().accept();
  	   return errorMsg;
     }
	 public void clickPracticeQuestions() {
		 driver.findElement(practiceQuetions);
	 }

	 public void clickSearchArray() {
		 driver.findElement(searchArray).click();
	 }
	 public void clickRun() {
		 driver.findElement(runButton).click();
	 }
	 public void clickMaxCOnsecutive() {
		 driver.findElement(maxConsecutive).click();
	 }
	 public void clickFindEvenNumbers() {
		 driver.findElement(findEvenNumbers).click();
	 }
	 public void clickSortedArray() {
		 driver.findElement(sortedArray).click();
	 }

}



