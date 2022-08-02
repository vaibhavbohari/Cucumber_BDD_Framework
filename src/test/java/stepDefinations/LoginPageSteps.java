package stepDefinations;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {

		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() throws InterruptedException {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
		Thread.sleep(2000);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) throws InterruptedException {
		Assert.assertTrue(title.contains(expectedTitleName));
		Thread.sleep(2000);

	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() throws InterruptedException {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
		Thread.sleep(2000);

	}

	@When("user enters username {string}")
	public void user_enters_username(String username) throws InterruptedException {
		loginPage.enterUserName(username);
		Thread.sleep(2000);

	}

	@And("user enters password {string}")
	public void user_enters_password(String password) throws InterruptedException {
		loginPage.enterPassword(password);
		Thread.sleep(2000);

	}

	@And("user clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginPage.clickOnLogin();
		Thread.sleep(2000);

	}

}
