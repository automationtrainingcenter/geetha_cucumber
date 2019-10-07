package banking.cucumber_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoleDetailsPage {
	WebDriver driver;
	
	// new role button
	@FindBy(id = "btnRoles")
	private WebElement newRole;

	public RoleDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickNewRole() {
		this.newRole.click();
	}

}
