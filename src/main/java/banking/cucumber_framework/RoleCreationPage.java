package banking.cucumber_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RoleCreationPage {
	WebDriver driver;

	// role name
	@FindBy(id = "txtRname")
	private WebElement roleName;
	
	//role description
	@FindBy(id = "txtRDesc")
	private WebElement roleDescription;

	// role type
	@FindBy(id = "lstRtypeN")
	private WebElement roleType;

	// submit
	@FindBy(id = "btninsert")
	private WebElement submit;

	// reset
	@FindBy(id = "Btn_Reset")
	private WebElement reset;

	// cancel
	@FindBy(id = "Btn_cancel")
	private WebElement cancel;

	public RoleCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillRoleName(String roleName) {
		this.roleName.sendKeys(roleName);
	}
	
	public void fillRoleDescription(String roleDescription) {
		this.roleDescription.sendKeys(roleDescription);
	}

	public void selectRoleType(String roleType) {
		new Select(this.roleType).selectByVisibleText(roleType);
	}

	public void clickSubmit() {
		this.submit.click();
	}

	public void clickReset() {
		this.reset.click();
	}

	public void clickCancel() {
		this.cancel.click();
	}
	
	// verify form reseted or not
	public boolean isFormReset() {
		return JavaScriptHelper.getElementText(driver, this.roleName).isEmpty();
	}

}
