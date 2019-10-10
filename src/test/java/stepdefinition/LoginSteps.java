package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import banking.cucumber_framework.AdminHomePage;
import banking.cucumber_framework.BankHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BrowserHelper;

public class LoginSteps extends CommonSteps{
	BankHomePage bankHomePage; 
	
	
	@Given("^admin is in bank home page$")
	public void admin_is_in_bank_home_page() throws Throwable {
		launch("chorme");
		this.driver.get("http://primusbank.qedgetech.com/home.aspx");
	}

	@When("^admin enters valid username$")
	public void admin_enters_valid_username() throws Throwable {
		bankHomePage = new BankHomePage(this.driver);
		this.bankHomePage.fillUserName("Admin");
	}

	@Then("^user can see welcome to Admin message with logout link$")
	public void user_can_see_welcome_to_admin_message_with_logout_link() throws Throwable {
		AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		Assert.assertTrue(adminHomePage.isAdminHomePageDisplayed());
	}

	@And("^admin enters valid password$")
	public void admin_enters_valid_password() throws Throwable {
		this.bankHomePage.fillPassword("Admin");
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
		this.bankHomePage.clickLoginButton();
	}
	
	@When("admin enters invalid password")
	public void admin_enters_invalid_password() {
	    this.bankHomePage.fillPassword("adminnnnnnn");
	}

	@Then("admin can see an error message saying incorrect bankername or password")
	public void admin_can_see_an_error_message_saying_incorrect_bankername_or_password() {
		Alert alert = this.driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		Assert.assertTrue(text.toLowerCase().contains("incorrect"));
	}
	
	@When("admin enters invalid user name")
	public void admin_enters_invalid_user_name() {
	    this.bankHomePage.fillUserName("adminnnnnn");
	}

	@Then("admin can see an error message saying please fill fillowing fields")
	public void admin_can_see_an_error_message_saying_please_fill_fillowing_fields() {
	    Alert alert = this.driver.switchTo().alert();
	    String text = alert.getText();
	    alert.accept();
	    Assert.assertTrue(text.toLowerCase().contains("please fill in"));
	}

}
