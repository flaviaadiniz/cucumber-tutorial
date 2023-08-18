package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_Home_Steps {
    @Given("^I am on Ebay home page$")
    public void iAmOnEbayHomePage() {
        System.out.println("I'm on Ebay Home Page");
    }

    @When("I click on Advanced link")
    public void iClickOnAdvancedLink() {
        System.out.println("I click on Advanced link");
    }

    @Then("I navigate to Advanced Search page")
    public void iNavigateToAdvancedSearchPage() {
        System.out.println("I navigate to Advanced Search page");
    }
}
