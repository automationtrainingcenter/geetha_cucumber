package stepdefinition;

import org.openqa.selenium.WebDriver;

import utilities.BrowserHelper;

public class CommonSteps extends BrowserHelper{
	
	WebDriver driver;
	
	public void launch(String browserName) {
		this.driver = openBrowser("chrome");
	}
	
}
