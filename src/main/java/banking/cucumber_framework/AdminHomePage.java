package banking.cucumber_framework;

import java.awt.print.Pageable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	// implementing using page factory
	private WebDriver driver;
	// home button
	@FindBy(css="a[href='adminflow.aspx']")
	private WebElement home;

	// logout button
	@FindBy(css="a[href='http://primusbank.qedgetech.com']")
	private WebElement logout;

	// branches
	@FindBy(how = How.CSS, using = "a[href='admin_banker_master.aspx']")
	private WebElement branches;

	// roles
	@FindBy(how = How.CSS, using = "a[href='Admin_Roles_details.aspx']")
	private WebElement roles;

	// employees
	@FindBy(how = How.CSS, using = "a[href='Admin_Emp_details.aspx']")
	private WebElement employees;

	// constructor
	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	// click on home button
	public void clickHome() {
		this.home.click();
	}

	// click on logout button
	public void clickLogout() {
		this.logout.click();
	}

	// click on roles button
	public void clickRoles() {
		this.roles.click();
	}

	// click on employees button
	public void clickEmployees() {
		this.employees.click();
	}

	// click on branches button
	public void clickBranches() {
		this.branches.click();
	}

}
