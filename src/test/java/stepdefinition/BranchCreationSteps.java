package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import banking.cucumber_framework.AdminHomePage;
import banking.cucumber_framework.BankHomePage;
import banking.cucumber_framework.BranchCreationPage;
import banking.cucumber_framework.BranchDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BranchCreationSteps{
	private WebDriver driver;
	private CommonSteps commonSteps;
	private AdminHomePage adminHomePage;
	BranchDetailsPage branchDetailsPage;
	BranchCreationPage branchCreationPage;
	Alert alert;
	
	public BranchCreationSteps(CommonSteps commonSteps) {
		this.commonSteps = commonSteps;
		this.driver = this.commonSteps.getDriver();
	}
	
	@Given("admin is in admin home page by doing valid login")
	public void admin_is_in_admin_home_page_by_doing_valid_login() {
	   BankHomePage bankHomePage = new BankHomePage(driver);
	   bankHomePage.fillUserName("Admin");
	   bankHomePage.fillPassword("Admin");
	   bankHomePage.clickLoginButton();
	   adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
	}

	@Given("admin is in branch details page by clicking branches button")
	public void admin_is_in_branch_details_page_by_clicking_branches_button() {
	   adminHomePage.clickBranches();
	   branchDetailsPage = PageFactory.initElements(driver, BranchDetailsPage.class);
	}

	@Given("admin is in branch creation page by clicking new branch button")
	public void admin_is_in_branch_creation_page_by_clicking_new_branch_button() {
		branchDetailsPage.clickNewbranch();
		branchCreationPage = PageFactory.initElements(driver, BranchCreationPage.class);
	}

	@When("admin enters valid branch name {string}")
	public void admin_enters_valid_branch_name(String string) {
		branchCreationPage.fillbranchName(string);
	}

	@When("admin enters valid address1 {string}")
	public void admin_enters_valid_address1(String string) {
	    branchCreationPage.fillAdress1(string);
	}

	@When("admin enters valid zipcode {string}")
	public void admin_enters_valid_zipcode(String string) {
	    branchCreationPage.fillZipcode(string);
	}

	@When("admin selects country as {string}")
	public void admin_selects_country_as(String string) {
	    branchCreationPage.selectcountry(string);
	}

	@When("admin selects state as {string}")
	public void admin_selects_state_as(String string) {
	    branchCreationPage.selectstate(string);
	}

	@When("admin selects city as {string}")
	public void admin_selects_city_as(String string) {
	   branchCreationPage.selectcity(string);
	}

	@When("admin clicks on submit button")
	public void admin_clicks_on_submit_button() {
	   branchCreationPage.clickSubmit();
	   alert = driver.switchTo().alert();
	}

	@Then("admin can see a message saying new branch created successfully with some id")
	public void admin_can_see_a_message_saying_new_branch_created_successfully_with_some_id() {
	    String text = alert.getText();
	    alert.accept();
	    Assert.assertTrue(text.toLowerCase().contains("new branch with id"));
	}
	
	@When("admin clicks on reset button")
	public void admin_clicks_on_reset_button() {
	    this.branchCreationPage.clickReset();
	}

	@Then("admin can see an empty creation form")
	public void admin_can_see_an_empty_creation_form() {
	    Assert.assertTrue(this.branchCreationPage.isFromReset());
	}

}
