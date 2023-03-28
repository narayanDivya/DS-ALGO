package stepdefinition;

import org.openqa.selenium.WebDriver;

import PageObjects.Intro_page;
import PageObjects.home_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class DS_Algo_DSIntro {
			
		WebDriver driver;
		home_page homePage = new home_page();
		Intro_page dsPage = new Intro_page();

	
		@Given("The user opens the DS Algo portal for DSIntro")
		public void the_user_opens_the_ds_algo_portal_for_ds_intro() {
		    dsPage.dsalgoportal();
		}

		@Given("The user is on the home page  after logged in")
		public void the_user_is_on_the_home_page_after_logged_in() {
		   LoggerLoad.info("User has logged in");
		}

		
		
		/* @Given("The user opens  DSAlgo portal Signinlink")
	public void the_user_opens_ds_algo_portal_link() {
	    
		LoggerLoad.info("Open DSAlgo portal ");
		dsPage.dsalgoportal();
	}
		


	@When("user enters username and password")
	public void user_enters_username_and_password() {
	  dsPage.getStarted();  

	}

	@Then("The user should be redirected to homepage ")
	public void the_user_click_on_login_button() {
		LoggerLoad.info("click on login button");

	} */

	
/*	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_getstartedbutton_in_data_structure_page_introduction_panel(String string) {
	    
		
		dsPage.introduction();

	} */
		
		@When("The user clicks the Getting Started button in Data Structure Page introduction Panel")
		public void the_user_clicks_the_getting_started_button_in_data_structure_page_introduction_panel() {
		    dsPage.introduction();
		}	

		
	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
	    dsPage.complexityLink();

	}

	@Then("The user should be redirected to Time Complexity page")
	public void the_user_should_be_redirected_to_time_complexity_page() {
		LoggerLoad.info("User is in the time complexity page");

	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_try_here_button_on_page(String string, String string2) {
		LoggerLoad.info("User clicks try here button");
	dsPage.tryherebtn();
	}

	

	@Then("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User clicks tryEditorwith run button");

	}
	@When("The user enter python code with valid syntax in tryEditor from sheet {string} and <RowNumber>")
	public void the_user_enter_python_code_with_valid_syntax_in_try_editor_from_sheet_and_row_number(String string) {
		dsPage.enterValidCode();

	}
	    

	@Then("The user clicks on run button")
	public void the_user_clicks_on_run_button() throws InterruptedException {
	    dsPage.clickrunButton();

	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		LoggerLoad.info("User presented Run result");
		
		

	}

		
		

	@Then("User navigates back to Time complexity")
	public void user_navigates_back_to_time_complexity() {
		dsPage.navigateTo("dspagetimecomplexity");
	}

	@When("The user clicks on the Practice Questions link")
	public void the_user_clicks_on_the_link() {
		dsPage.practice_Questions_link();
	}

	 @Then ("The user should then be directed to Practice Questions Page")
	public void the_user_should_then_be_directed_to_practice_questions_page() {
		 LoggerLoad.info("User is on practice Questions");
	} 
	 
	@Then("User navigates back to home page")
	public void user_navigates_back_to() {
		 homePage.homepageurl();
	}



	}



	
	

