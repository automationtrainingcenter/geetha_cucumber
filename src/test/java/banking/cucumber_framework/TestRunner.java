package banking.cucumber_framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"},
		glue = {"stepdefinition"},
		monochrome = true
		,plugin = {"pretty", "html:target/reports"}
//		,dryRun = true
		,tags = {"@login_valid"}
)
public class TestRunner {

}
//anding tags
//tags = {"@tag1", "@tag2", "@tag3"}

//oring tags
//tags ={"@tag1 or @tag2 or @tag3"}

/*
 * To run code through maven use the following commands
 * in command prompt go through the project directory and enter the commands
 * in Jenkins add the commands at goals and options
 * or if you are running through eclipse don't use mvn before each command 
 * mvn test  ------- to run whole project
 * mvn test -Dcucumber.options="--tags @tagName" ---- to run a specific tag
 */