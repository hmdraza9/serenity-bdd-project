package serenityswag.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import starter.steps.SauceLoginSteps;

@RunWith(SerenityRunner.class)
@Narrative(text = { "Logging in." })
public class WhenLogginOn {

	@Managed
	WebDriver driver;

	@Steps
	SauceLoginSteps sauceStep;

	@Test
	public void makeLoginHomePage() {

		sauceStep.loadURL(driver);
		sauceStep.doLogin(driver);
		sauceStep.assertHomePage(driver);

	}

	public static void showArray(String[] arr) {

		System.out.println("Showing array elements");
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
