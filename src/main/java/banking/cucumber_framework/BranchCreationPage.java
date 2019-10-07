package banking.cucumber_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationPage {
	
	WebDriver driver;
	
	@FindBy(id = "txtbName")
	private WebElement branchName;
	
	@FindBy( id = "txtAdd1")
	private WebElement Adress1;
	
	@FindBy( id = "txtAdd2")
	private WebElement Adress2;
	
	@FindBy( id = "txtArea")
	private WebElement Area;
	
	@FindBy( id = "txtZip")
	private WebElement ZipCode;
	
	@FindBy( id = "lst_counrtyU")
	private WebElement country;
	
	@FindBy( id = "lst_stateI")
	private WebElement state;
	
	@FindBy( id = "lst_cityI")
	private WebElement city;
	
	@FindBy( id = "btn_insert")
	private WebElement submit;
	
	@FindBy( id = "Btn_Reset")
	private WebElement Reset;
	
	@FindBy( id = "Btn_cancel")
	private WebElement Cancel;
	
	public BranchCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillbranchName(String branchname) {
		this.branchName.sendKeys(branchname);
	}
	
	public void fillAdress1(String Adress1) {
		this.Adress1.sendKeys(Adress1);
	}
	
	public void fillArea(String Area) {
		this.Area.sendKeys(Area);
	}
	
	public void fillZipcode(String Zipcode) {
		this.ZipCode.sendKeys(Zipcode);
	}
	
	public void selectcountry(String country) {
		new Select(this.country).selectByVisibleText(country);
	}
	
	public void selectstate(String state) {
		new Select(this.state).selectByVisibleText(state);
	}
	
	public void selectcity(String city) {
		new Select(this.city).selectByVisibleText(city);
	}
	
	public void clickSubmit() {
		this.submit.click();
	}

	public void clickReset() {
		this.Reset.click();
	}

	public void clickCancel() {
		this.Cancel.click();
	}
}
