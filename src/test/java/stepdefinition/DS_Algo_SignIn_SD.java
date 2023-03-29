package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Sign_In_Objects;
import PageObjects.home_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import utilities.LoggerLoad;

public class DS_Algo_SignIn_SD {

	WebDriver driver;
	home_page homePage = new home_page();
	Sign_In_Objects signin=new Sign_In_Objects();

	//@SignIn
	@Given("The User is on DS_Algo portal page")
	public void the_user_is_on_ds_algo_portal_page() {
	    
		LoggerLoad.info("SIGNIN: Open DSAlgo portal ");
		homePage.dsalgoportal();
	    //throw new io.cucumber.java.PendingException();
	}

	@And("Click on Get Started button")
	public void click_on_get_started_button() {
	   
		LoggerLoad.info("SIGNIN: Click Get Started Button");
		homePage.getStarted();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User navigates to HomePage")
	public void user_navigates_to_home_page() {
	    
		String title = homePage.getTitle();
		   LoggerLoad.info("SIGNIN: USer is on "+title+" page");
			assertEquals(title,"NumpyNinja");
	    //throw new io.cucumber.java.PendingException();
	}

	@And("Clicks on Sign In link")
	public void clicks_on_sign_in_link() throws Throwable {
	    
		LoggerLoad.info("SIGNIN: User clicks on sign in link");
		homePage.signinClick();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("The User should be redirected to login Page")
	public void the_user_should_be_redirected_to_login_page() {
	   
		LoggerLoad.info("SIGNIN: User redirected to Login page");
	    String title = homePage.signinPage();
	    assertEquals(title,"Login");
	    //throw new io.cucumber.java.PendingException();
	}

	//@SignIn_01
	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
	   
		LoggerLoad.info("SIGNIN: User clicks on Register! link");
		signin.Click_Register_link();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() throws InterruptedException {
	   
		LoggerLoad.info("SIGNIN: User redirects to  Register! Page");
		homePage.registerPage();
	    //throw new io.cucumber.java.PendingException();
	}

	//@SignIn_02
	@Given("The User is on Registration page")
	public void the_user_is_on_registration_page() throws InterruptedException  {
	    
		LoggerLoad.info("SIGNIN: User is on Register! Page");
		signin.Register_page_url();


	    //throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Login link")
	public void user_clicks_on_Login_link() throws InterruptedException {
	    
		LoggerLoad.info("SIGNIN: User clicks on Login Link");
	
		signin.Click_Login_link();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User should redirect to login page")
	public void user_should_redirect_to_login_page() {
	    
		LoggerLoad.info("SIGNIN: User is redirected back to Login page");
	    String title = homePage.signinPage();
	    assertEquals(title,"Login");
	    //throw new io.cucumber.java.PendingException();
	}

	//@SignIn_03
	@When("The user enter invalid (.*) and (.*)$")
	public void the_user_enter_invalid_and(String userN, String passw) throws Throwable {
	    
		LoggerLoad.info("SIGNIN: User enters invalid credentials");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.titleContains("Login"));
		signin.invalid_credentials(userN, passw);
		Thread.sleep(2000);
		
	    //throw new io.cucumber.java.PendingException();
	}

	@And("click login button to verify")
	public void click_login_button_to_verify() throws Throwable {
	    
		LoggerLoad.info("SIGNIN: User clicks on Login button");
		signin.click_login_button();
		
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("Check whether user is in Login page with invalid credentials")
	public void Check_whether_user_is_in_Login_page_with_invalid_credentials()
	{
		
		LoggerLoad.info("SIGNIN: User checks whether user is in same Login page");
		String title = homePage.signinPage();
	    assertEquals(title,"Login");
	    System.out.println("Current Page title is: "+title);
	}

	//@SignIn_04
	
	@When("The user enter Username and Password from (.*) and (.*)$")
	public void The_user_enter_Username_and_Password_from_and(String Sheetname, int RowNumber) throws Throwable {
	   
		LoggerLoad.info("SIGNIN: User enters UserName and Password from sheet"+Sheetname+" and RowNumber"+RowNumber);
		signin.enter_userName_password(Sheetname,RowNumber);
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("click login button to check")
	public void click_login_button_to_check() {
	    
		LoggerLoad.info("SIGNIN: User clicks on Login button");
		signin.click_login_button();
	    //throw new io.cucumber.java.PendingException();
	}



	//@SignIn_05
	@Given("The user is in the Home page with valid  log in")
	public void the_user_is_in_the_home_page_with_valid_log_in() {
	    
		LoggerLoad.info("SIGNIN: User is on HomePage after Logged In");
		homePage.homepageurl();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Sign out link")
	public void the_user_clicks_sign_out_link() {
	    
		LoggerLoad.info("SIGNIN: User clicks on Signout link");
		signin.Click_SignOut_Link();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Then the user stays in homepage after Signout")
	public void then_the_user_stays_in_homepage_after_Signout() {
	    
		LoggerLoad.info("SIGNIN: User Stays in HomePage after clicking on SignOut link");
		homePage.homepageurl();
	    //throw new io.cucumber.java.PendingException();
	}

}