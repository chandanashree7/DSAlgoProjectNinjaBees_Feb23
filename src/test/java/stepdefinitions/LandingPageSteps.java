package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import util.ConfigReader;
import utility.BaseClass;

public class LandingPageSteps {
	
	public LandingPage landingPage =new LandingPage(DriverFactory.getDriver());
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com");	
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		System.out.println(string);
		landingPage.clickOnGetStarted();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		
	   
	}


}
