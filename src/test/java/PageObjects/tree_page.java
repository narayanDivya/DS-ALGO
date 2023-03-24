package PageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class tree_page {
	
	public static WebDriver driver = CrossBrowser.getDriver();
	String loginUrl = ConfigReader.getSignInPage();
	String editorUrl = ConfigReader.getTryEditor();
	String treeHomeUrl = ConfigReader.getTreePage();
	String validCode = "print 'Hello world'";
	String invalidCode = "Hello World";
	
	By username = By.id("id_username");
	By password = By.id("id_password");
	By loginbtn = By.xpath("//input[@value='Login']");
	By datastructuredropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By Treedropdown = By.xpath("//a[text()='Tree']");
	
	//Tree page
	By tryHereButton = By.xpath("//a[contains(text(),'Try here>>>')]");
	By enterCodeLine = By.xpath("//textarea[@tabindex='0']");
	By runButton = By.xpath("//button[contains(text(),'Run')]");
	By output = By.id("output");
	
	By overview = By.xpath("//a[contains(text(),'Overview of Trees')]");
	By terminology = By.xpath("//a[contains(text(),'Terminologies')]");
	By typesOftrees = By.xpath("//a[contains(text(),'Types of Trees')]");
	By treeTraversals=By.xpath("//a[contains(text(),'Tree Traversals')]");
	By traversalsIllustration = By.xpath("//a[contains(text(),'Traversals-Illustration')]");
	By binaryTrees = By.xpath("//a[contains(text(),'Binary Trees')]");
	By typesOfBinaryTrees = By.xpath("//a[contains(text(),'Types of Binary Trees')]");
	By implementationInPython = By.xpath("//a[contains(text(),'Implementation in Python')]");
	By binaryTreeTraversals = By.xpath("//a[contains(text(),'Binary Tree Traversals')]");
	By implementationOfBinaryTrees = By.xpath("//a[contains(text(),'Implementation of Binary Trees')]");
	By applicationOfBinaryTrees = By.xpath("//a[contains(text(),'Applications of Binary trees')]");
	By binarySearchTrees = By.xpath("//a[contains(text(),'Binary Search Trees')]");
	By implementationOfBST = By.xpath("//a[contains(text(),'Implementation Of BST')]");
	
	
	public void signInPage() {
		driver.get(loginUrl);
	}
	
	public void enterDetails() {
		driver.findElement(username).sendKeys("Numpy@sdet101_11");
		driver.findElement(password).sendKeys("testsdet101");
		driver.findElement(loginbtn).click();
		
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void selectTreePage() {
		driver.findElement(datastructuredropdown).click();
		new WebDriverWait(driver, Duration.ofSeconds(3))
		.until(ExpectedConditions.visibilityOfElementLocated(Treedropdown));
		driver.findElement(Treedropdown).click();
	}
	public void clickOverview() {
		driver.findElement(overview).click();
	}
	public void clickTryHere() {
		driver.findElement(tryHereButton).click();
	}
	
	public void enterValidCode() {
		driver.findElement(enterCodeLine).sendKeys(validCode);
		driver.findElement(runButton).click();
	}
	public void enterInvalidcode() {
		driver.findElement(enterCodeLine).sendKeys(invalidCode);
		//driver.findElement(runButton).click();
	}
	public void clickRunButton()throws InterruptedException {
		LoggerLoad.info("User clicked Run button");
		//Thread.sleep(1000);
		driver.findElement(runButton).click();
		
	}
	public void navigateToTryEditor(){
		driver.get(editorUrl);
	}
	public void getOutput() {
		String outputValue = driver.findElement(output).getText();
		LoggerLoad.info("Output value is: "+outputValue);
		
	}
	
	/* public String getErrormsg() {
		String errormsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errormsg;
	}
	
	public void findAlert()throws InterruptedException {
	try {
		     // Thread.sleep(1000);
			driver.findElement(runButton).click();
	}catch(UnhandledAlertException e) {
		Alert alertPopUp = driver.switchTo().alert();
		String alertmessage = alertPopUp.getText();
		LoggerLoad.info("The alert message is "+alertmessage);
		alertPopUp.accept();
	}
	}
	public void clearCode() {
		driver.findElement(enterCodeLine).click();
		driver.findElement(enterCodeLine).sendKeys(Keys.CONTROL,"a");
		driver.findElement(enterCodeLine).sendKeys(Keys.DELETE);
	} */
	
		
	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}
	 public void clickTerminologies() {
		 driver.findElement(terminology).click();
	 }
	
	 public void clickTypesOfTrees() {
		 driver.findElement(typesOftrees).click();
	 }
	 public void clickTreeTraversals() {
		 driver.findElement(treeTraversals).click();
	 }
	 public void clickTraversalsIllustration() {
		 driver.findElement(traversalsIllustration).click();
	 }
	 public void clickBinaryTrees() {
		 driver.findElement(binaryTrees).click();
	 }
	 public void clickTypesOfBinaryTrees() {
		 driver.findElement(typesOfBinaryTrees).click();
	 }
	 public void clickImplementationInPython() {
		 driver.findElement(implementationInPython).click();
	 }
	 public void clickBinaryTreeTraversals() {
		 driver.findElement(binaryTreeTraversals).click();
	 }
	 public void clickImplementationOfBinaryTrees() {
		 driver.findElement(implementationOfBinaryTrees).click();
	 }
	 public void clickApplicationsOfBinaryTrees() {
		 driver.findElement(applicationOfBinaryTrees).click();
	 }
	public void clickBinarySearchTrees() {
		driver.findElement(binarySearchTrees).click();
	}
	public void clickImplementationOfBST() {
		driver.findElement(implementationOfBST).click();
	}
	
}
