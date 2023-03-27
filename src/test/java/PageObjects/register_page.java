package PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;


public class register_page {

	public static WebDriver driver = CrossBrowser.getDriver();
	String homeUrl = ConfigReader.getHomePageUrl();
	String registrationUrl = ConfigReader.getRegistrationPage();

	By registerLink = By.linkText("Register");
	By user = By.id("id_username");
	By passWord = By.id("id_password1");
	By confirmPassword = By.id("id_password2");
	By registerBtn = By.xpath("//input[@value ='Register']");
	By alertMessage = By.xpath("//div[@class='alert alert-primary']");
	By signOut = By.xpath("//a[text()='Sign out']");

	public void openRegisterPage() throws IOException {

		driver.get(homeUrl);

	}

	public void clickRegister() throws IOException {

		new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.visibilityOfElementLocated(registerLink));
		driver.findElement(registerLink).click();
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickSubmit() {
		LoggerLoad.info("Click register");
		driver.findElement(registerBtn).click();
	}

	public String getEmptyUserMsg() {

		String emptyUser = driver.findElement(user).getAttribute("validationMessage");
		return emptyUser;

	}

	public String getEmptyPwd() {
		String emptyPwd = driver.findElement(passWord).getAttribute("validationMessage");
		return emptyPwd;

	}

	public String getEmptyConfirmPwd() {
		String emptyConfirmPwd = driver.findElement(confirmPassword).getAttribute("validationMessage");
		return emptyConfirmPwd;

	}
	public void enterUserName(DataTable dataTable) {
		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> regform: userDetail) {
				String userName = regform.get("username");
				LoggerLoad.info("Username: "+userName);
				driver.findElement(user).clear();
				driver.findElement(user).sendKeys(userName);
				
			
		}
		
		
	}
	public void enterPassword(DataTable dataTable) {
		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> regform: userDetail) {
				String password = regform.get("password");
				LoggerLoad.info("password: "+password);
				driver.findElement(passWord).clear();
				driver.findElement(passWord).sendKeys(password);
		
	}
	}
	
	public void enterConfirmPassword(DataTable dataTable) {
		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> regform: userDetail) {
				String confirmpassword = regform.get("password confirmation");
				LoggerLoad.info("password: "+confirmpassword);
				driver.findElement(confirmPassword).clear();
				driver.findElement(confirmPassword).sendKeys(confirmpassword);
		
	}
			
	}
	public void getErrormsg() {
		try {
			String error=driver.findElement(alertMessage).getText();
			LoggerLoad.info("Error message: "+error);
		}catch(NoSuchElementException e) {
			LoggerLoad.info("No such element");
		}
	}
	
	public void clickSignOut() {
		driver.findElement(signOut).click();
	}
	
	public void signedInAlert() {
		try {
			String alert=driver.findElement(alertMessage).getText();
			LoggerLoad.info("Alert message: "+alert);
		}catch(NoSuchElementException e) {
			LoggerLoad.info("No such element");
		}
	}
}
