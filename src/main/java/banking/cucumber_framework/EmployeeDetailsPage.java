package banking.cucumber_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDetailsPage {
	
WebDriver driver;
	
	@FindBy(id = "BtnNew")
	private WebElement newEmployee;
	
	public EmployeeDetailsPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickNewEmployee() 
	{
		this.newEmployee.click();
	}
	
}


