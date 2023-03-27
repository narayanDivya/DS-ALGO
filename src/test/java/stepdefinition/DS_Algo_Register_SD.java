package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.register_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class DS_Algo_Register_SD {

	WebDriver driver;
	register_page regpage = new register_page();
	
	 @Given("The user opens DS Algo portal link for register test")
	public void the_user_opens_register_page() throws IOException {
		LoggerLoad.info("Open DSAlgo portal for register test ");
		regpage.openRegisterPage();
	}
	
	@When("The user clicks on {string}")
	public void the_user_clicks_on(String string) throws IOException {
	   LoggerLoad.info("User clicks register link");
	   regpage.clickRegister();
		
	}

	@Then("The user is directed to the register page")
	public void the_user_is_directed_to_the_register_page() {
	    String title = regpage.getTitle();
	    assertEquals(title, "Registration");
		
	}

	 @Given("The user is on register page")
	public void the_user_is_on__register_page() {
		 String title = regpage.getTitle();
		    assertEquals(title, "Registration");
	 }

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
	   LoggerLoad.info("User clicks Register with all fields empty");
		regpage.clickSubmit();
	}

	@Then("It should display an error {string} below password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
	   String warning = regpage.getEmptyUserMsg();
	   LoggerLoad.info("Error message " +warning);
		
		
	}

	

	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string, io.cucumber.datatable.DataTable dataTable) {
	   LoggerLoad.info("User gives only the username");
	   regpage.enterUserName(dataTable);
		regpage.clickSubmit();
		
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox1(String string) {
	    String warning = regpage.getEmptyPwd();
	    LoggerLoad.info("Error message" +warning);
		
	}

	 @When("The user clicks {string} button after entering {string} and {string} with and   Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_and_password_confirmation_field_empty(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	   LoggerLoad.info("User gives only username and password");
	   regpage.enterUserName(dataTable);
	   regpage.enterPassword(dataTable);
	   regpage.clickSubmit();
		 
		 
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox2(String string) {
		String warning = regpage.getEmptyConfirmPwd();
		LoggerLoad.info("Error message" + warning);
	   
	}

	@When("The user enters a {string} with characters other than Letters, digits and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	   LoggerLoad.info("User enters username with characters other than letters, digits and @/./+/-/_");
	   regpage.enterUserName(dataTable);
	   regpage.enterPassword(dataTable);
	   regpage.enterConfirmPassword(dataTable);
	   regpage.clickSubmit();
		
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	    regpage.getErrormsg();
		
	}

	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	   LoggerLoad.info("User enters an existing username");
	   regpage.enterUserName(dataTable);
	   regpage.enterPassword(dataTable);
	   regpage.enterConfirmPassword(dataTable);
	   regpage.clickSubmit();
	   		
	}

	@When("The user clicks {string} button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_button_after_entering_valid_and_different_passwords_in_and_fields(String string, String string2, String string3, String string4, io.cucumber.datatable.DataTable dataTable) {
		 LoggerLoad.info("User enters different passwords in password and password confirmation");
		   regpage.enterUserName(dataTable);
		   regpage.enterPassword(dataTable);
		   regpage.enterConfirmPassword(dataTable);
		   regpage.clickSubmit();
	}

	@When("The user enters a valid {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		 LoggerLoad.info("The user enters password with only numbers");
		   regpage.enterUserName(dataTable);
		   regpage.enterPassword(dataTable);
		   regpage.enterConfirmPassword(dataTable);
		   regpage.clickSubmit();
		
	}

	@When("The user enters a valid {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_similar_to_username(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		 LoggerLoad.info("User enters password similar to the username");
		   regpage.enterUserName(dataTable);
		   regpage.enterPassword(dataTable);
		   regpage.enterConfirmPassword(dataTable);
		   regpage.clickSubmit();
	   	}

	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		 LoggerLoad.info("User enters valid username, password and confirm password");
		   regpage.enterUserName(dataTable);
		   regpage.enterPassword(dataTable);
		   regpage.enterConfirmPassword(dataTable);
		   regpage.clickSubmit();
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
	    regpage.signedInAlert();
	}  
	
	@When("The user clicks on sign out")
	public void the_user_clicks_on_sign_out() {
	    regpage.clickSignOut();
	}

	@Then("The user is signed out")
	public void the_user_is_signed_out() {
		regpage.signedInAlert();
	   
	}

	

}
