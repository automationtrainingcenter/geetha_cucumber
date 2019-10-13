package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.BrowserHelper;

public class CommonSteps extends BrowserHelper {

	private WebDriver driver;
	private static boolean initilaized = false;

	@Before
	public void launch() {
		if (!initilaized) {
			this.driver = openBrowser("chrome");
			initilaized = true;
		}
	}

	@After
	public void close() {
		closeBroser();
		initilaized = false;
	}

	// return driver instance
	public WebDriver getDriver() {
		return this.driver;
	}
}
