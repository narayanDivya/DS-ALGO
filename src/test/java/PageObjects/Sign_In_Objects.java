package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.ExcelUtils;


public class Sign_In_Objects {

	public WebDriver driver = CrossBrowser.getDriver();
	
	
	String registerurl= ConfigReader.getRegistrationPage();
	String loginUrl=ConfigReader.getSignInPage();
	
	By registerlink= By.linkText("Register");
	By loginlink= By.xpath("//a[text()='Login ']");
	By username = By.id("id_username");
	By password = By.id("id_password");
	By loginbtn = By.xpath("//input[@value='Login']");
	By signoutlink = By.xpath("//a[text()='Sign out']");
	By errormessage= By.xpath("//div[contains(text(),'Invalid Username and Password')]");
	
	public void Click_Register_link()
	{
		driver.findElement(registerlink).click();
	}
	public void Register_page_url()
	{
		driver.get(registerurl);
	}
	
	public void Click_Login_link()
	{
		driver.findElement(loginlink).click();
	}
	public void invalid_credentials(String userN, String passw)
	{
		driver.findElement(username).sendKeys(userN);
		driver.findElement(password).sendKeys(passw);
		/*if(driver.findElement(username)!=null && driver.findElement(password)==null)
		{
			driver.findElement(username).clear();
		}*/
	
	}
	public void enter_userName_password(String Sheetname,int RowNumber)
	{
		String userCredientials= ExcelUtils.getLoginCredentials(Sheetname,RowNumber);

		
		if(null!=userCredientials && !userCredientials.trim().equals("")) {
			String userDetails[]=userCredientials.split("-");
			driver.findElement(username).sendKeys(userDetails[0]);
			driver.findElement(password).sendKeys(userDetails[1]);
			
			
		}
		
	}
	
	public boolean check_for_error_message()
	{
		boolean isErrorFound=false;
		WebElement errmes= driver.findElement(errormessage);
		if(errmes!=null) {
			isErrorFound=true;	
			System.out.println("Error Message for invalid login credentials is: "+errmes);
		}
		else 
		{
			driver.get(loginUrl);
		}
		return isErrorFound;
	}
	
	public void click_login_button()
	{
		driver.findElement(loginbtn).click();

	}
	public void Click_SignOut_Link()
	{
		driver.findElement(signoutlink).click();
	}


}