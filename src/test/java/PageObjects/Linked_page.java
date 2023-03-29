package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class Linked_page {

	public WebDriver driver = CrossBrowser.getDriver();
	String loginUrl = ConfigReader.getSignInPage();
	By datastructuredropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By linkdropdown = By.xpath("//a[text()='Linked List']");
	By output = By.id("output");
	By runButton = By.xpath("//button[contains(text(),'Run')]");
	
	By introduction= By.xpath("//a[@href='introduction']");
	By creatinglinkedlist = By.xpath("//a[@href='creating-linked-list']");
	By practicequestions= By.xpath("//a[text()='Practice Questions']");
	//By practicequestions =  By.xpath("//a[href='/linked-list/practice\']");
	By typesoflinkedlist = By.xpath("//a[@href='types-of-linked-list']");
	By transversallist = By.xpath("//a[@href='traversal']");
	By insertionlink = By.xpath("//a[@href='insertion-in-linked-list']");
	By deletion = By.xpath("//a[@href='deletion-in-linked-list']");
	By implementLinkedListConst = By.xpath("//a[@href='implement-linked-list-in-python']");
	
	
	public void LinkedListSignIn() {
		driver.get(loginUrl);
	}
	
	public void selectLinkedList() {
		driver.findElement(datastructuredropdown).click();
		driver.findElement(linkdropdown).click();
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
	public void introduction() {
		driver.findElement(introduction).click();
		
	}
	public void implementLinkList() {
		driver.findElement(implementLinkedListConst).click();
	}
	public void creating_linked_list_page() {
		// TODO Auto-generated method stub
		driver.findElement(creatinglinkedlist).click();
	}

	public void typesoflinkedlistlink() {
		driver.findElement(typesoflinkedlist).click();
		
	}

	public void traversals_illustration_link() {
		driver.findElement(transversallist).click();
		
	}

	public void insertion_link() {
		driver.findElement(insertionlink).click();
		
	}

	public void deletionlink() {
		driver.findElement(deletion).click();
		
	}
	

		
		
}

