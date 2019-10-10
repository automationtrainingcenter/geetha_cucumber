package banking.cucumber_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankHomePage {
	WebDriver driver;

	// username
	public WebElement username() {
		return this.driver.findElement(By.id("txtuId"));
	}

	// password
	public WebElement password() {
		return this.driver.findElement(By.id("txtPword"));
	}

	// login button
	public WebElement loginButton() {
		return this.driver.findElement(By.id("login"));
	}

	public BankHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// fill username text field
	public void fillUserName(String username) {
		this.username().sendKeys(username);
	}

	// fill password text field
	public void fillPassword(String password) {
		this.password().sendKeys(password);
	}
	
	//click on login button
	public void clickLoginButton() {
		this.loginButton().click();
	}
}
