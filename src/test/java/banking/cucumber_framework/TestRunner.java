package banking.cucumber_framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/roleCreation.feature"},
		glue = {"stepdefinition"},
		monochrome = true
		,plugin = {"pretty", "html:target/reports"}
//		,dryRun = true
)
public class TestRunner {

}
