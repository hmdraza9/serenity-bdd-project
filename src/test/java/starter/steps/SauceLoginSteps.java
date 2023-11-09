package starter.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import serenityswag.login.WhenLogginOn;

public class SauceLoginSteps extends UIInteractionSteps {

	@Step("#Load URL")
	public void loadURL(WebDriver driver) {
		// TODO

		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@Step("#Log In")
	public void doLogin(WebDriver driver) {
		// TODO

		String usernamesXpath = "//div[@id='login_credentials']";
		String passwordsXpath = "//div[@class='login_password']";
		String usernameXpath = "//input[@id='user-name']";
		String passwordXpath = "//input[@id='password']";
		String loginButtonXpath = "//input[@id='login-button']";

		String[] usernames = driver.findElement(By.xpath(usernamesXpath)).getText().split("\n");
		WhenLogginOn.showArray(usernames);

		String[] passwords = driver.findElement(By.xpath(passwordsXpath)).getText().split("\n");
		WhenLogginOn.showArray(passwords);

		$(usernameXpath).sendKeys(usernames[1]);
		find(passwordXpath).sendKeys(passwords[1]);
		find(loginButtonXpath).click();

		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@Step("#Assert Home Page")
	public void assertHomePage(WebDriver driver) {
		// TODO

		driver.get("https://www.saucedemo.com/v1/index.html");
	}
}
