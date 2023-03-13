package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			plugin = {"pretty", "html:target\\bddtest1.html"}, // reporting purpose
			monochrome=false, //console output color
			tags="", //tags from feature file
			features = {"src\\test\\resources\\features"}, //location of feature files
			glue={"stepdefinition","hooks"}) //location of step Definition files
			

public class TestRunner extends AbstractTestNGCucumberTests {
		
				@Override
				@DataProvider(parallel = false)
				public Object[][] scenarios() {
					return super.scenarios();
					
				}
			

}
