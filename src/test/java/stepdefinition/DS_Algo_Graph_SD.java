package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import PageObjects.array_page;
import PageObjects.graph_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DS_Algo_Graph_SD {
	
	WebDriver driver;
	graph_page graph = new graph_page();
	
	@Given("The user opens the DS Algo portal for graph")
	public void the_user_opens_the_ds_algo_portal_for_graph() {
	    graph.graphSignIn();
	}

	@When("The user select Graph item from the drop down menu")
	public void the_user_select_graph_item_from_the_drop_down_menu() {
	    graph.selectGraph();
	}

	@Then("The user should be directed to Graph main Page")
	public void the_user_should_be_directed_to_graph_main_page() {
		String title = graph.getTitle();
		   assertEquals(title,"Graph");
	}

	@When("The user clicks on the Graphs link")
	public void the_user_clicks_on_the_graphs_link() {
	    graph.clickGraphPage();
	}

	@Then("The user should then be directed to Graphs Page")
	public void the_user_should_then_be_directed_to_graphs_page() {
		String title = graph.getTitle();
		   assertEquals(title,"Graph");
	}

	@Then("The user should be presented with Run output for graphs")
	public void the_user_should_be_presented_with_run_output_for_graphs() {
	   graph.getOutput();
	}

	@Then("User navigates back to Graph page")
	public void user_navigates_back_to_graph_page() {
	    graph.navigateTo("Graphhome");
	}
	@When("The user clicks on Graph representations link")
	public void the_user_clicks_on_graph_representations_link() {
	    graph.clickGraphRepresentations();
	}

	@Then("The user should then be directed to Graph representations Page")
	public void the_user_should_then_be_directed_to_graph_representations_page() {
		String title = graph.getTitle();
		   assertEquals(title,"Graph Representations");
	}

}
