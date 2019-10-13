package stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import banking.cucumber_framework.AdminHomePage;
import banking.cucumber_framework.RoleCreationPage;
import banking.cucumber_framework.RoleDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class RoleCreationSteps {
	private WebDriver driver;
	private CommonSteps commonSteps;
	private RoleDetailsPage roleDetailsPage;
	private RoleCreationPage roleCreationPage;

	public RoleCreationSteps(CommonSteps commonSteps) {
		this.commonSteps = commonSteps;
		this.driver = this.commonSteps.getDriver();
	}

	@Given("admin is in role details page by clicking roles button")
	public void admin_is_in_role_details_page_by_clicking_roles_button() {
		AdminHomePage adminHomePage = PageFactory.initElements(this.driver, AdminHomePage.class);
		adminHomePage.clickRoles();
		roleDetailsPage = PageFactory.initElements(this.driver, RoleDetailsPage.class);
	}

	@Given("admin is in role creation page by clicking new role button")
	public void admin_is_in_role_creation_page_by_clicking_new_role_button() {
		roleDetailsPage.clickNewRole();
		roleCreationPage = PageFactory.initElements(this.driver, RoleCreationPage.class);
	}

	@When("admin enters invalid role name then admin can see an error message")
	public void admin_enters_invalid_role_name_then_admin_can_see_an_error_message(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<String> rows = dataTable.asList();
		for (String row : rows) {
			this.roleCreationPage.fillRoleName(row + Keys.TAB);
			Alert alert = this.driver.switchTo().alert();
			String text = alert.getText();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			alert.accept();
			this.roleCreationPage.clickReset();
			Assert.assertTrue("assertion failed at " + row,
					text.toLowerCase().contains("this field accepts alphabets"));
		}
	}

	@When("admin clicks reset button after filling role creation form then admin can see an empty form")
	public void admin_clicks_reset_button_after_filling_role_creation_form_then_admin_can_see_an_empty_form(DataTable dataTable) {
		List<Map<String, String>> rows = dataTable.asMaps();
		for(Map<String, String> row : rows) {
			String roleName = row.get("role_name");
			String roleType = row.get("role_type");
			roleCreationPage.fillRoleName(roleName);
			roleCreationPage.selectRoleType(roleType);
			roleCreationPage.clickReset();
			Assert.assertTrue(roleCreationPage.isFormReset());
		}
	}
}
