package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("User is successfully on landing page");
    }

    @When("^User login to application with username and password$")
    public void user_login_to_application_with_username_and_password() throws Throwable {
    	System.out.println("User login to application successfully");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is populated successfully");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Cards are displayed successfully");
    }

    @When("^User login to application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("User is loged into application successfully with username: " + arg1 +", password: "+arg2 );
    }

    @Then("^Cards are not displayed$")
    public void cards_are_not_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Cards are not displayed");
    }
    
    @Then("^Cards are displayed is \"([^\"]*)\"$")
    public void cards_are_displayed_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Cards are displayed :" + arg1);
    }

    
}