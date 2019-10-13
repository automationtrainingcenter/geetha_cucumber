package stepdefinition;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import banking.cucumber_framework.AdminHomePage;
import banking.cucumber_framework.EmployeeCreationPage;
import banking.cucumber_framework.EmployeeDetailsPage;
import banking.cucumber_framework.EmployeePOJO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.Gson;

public class EmployeeCreationSteps {
	private CommonSteps commonSteps;
	private WebDriver driver;

	public EmployeeCreationSteps(CommonSteps commonSteps) {
		this.commonSteps = commonSteps;
		this.driver = this.commonSteps.getDriver();
	}

	@Given("admin is in employee details page by clicking employee button")
	public void admin_is_in_employee_details_page_by_clicking_employee_button() {
		AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		adminHomePage.clickEmployees();

	}

	@Given("admin is in employee creation page by clicking new employee button")
	public void admin_is_in_employee_creation_page_by_clicking_new_employee_button() {
		EmployeeDetailsPage employeeDetailsPage = PageFactory.initElements(driver, EmployeeDetailsPage.class);
		employeeDetailsPage.clickNewEmployee();
	}

	@When("admin clicks on reset button by filling form with data from json then form must reset")
	public void admin_clicks_on_reset_button_by_filling_form_with_data_from_json_then_form_must_reset() {
		EmployeeCreationPage employeeCreationPage = PageFactory.initElements(driver, EmployeeCreationPage.class);
		Gson gson = new Gson();
		FileInputStream fis;
		try {
			fis = new FileInputStream(".\\resources\\employeeData.json");
			InputStreamReader ireader = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(ireader);
			EmployeePOJO[] employees = gson.fromJson(reader, EmployeePOJO[].class);
			for (EmployeePOJO employee : employees) {
				employeeCreationPage.fillEmployerName(employee.getEmployee_name());
				employeeCreationPage.fillLoginpassword(employee.getLogin_pass());
				employeeCreationPage.selectRoleType(employee.getRole());
				employeeCreationPage.selectBranchType(employee.getBranch());
				employeeCreationPage.clickReset();
				Assert.assertTrue(employeeCreationPage.isFormReset());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
