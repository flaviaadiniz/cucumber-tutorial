package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearchSteps {

    @Given("I am on Ebay Advanced Search Page")
    public void i_am_on_ebay_advanced_search_page() {
        System.out.println("I am on Ebay Advanced search page");
    }

    @When("I click on Ebay logo")
    public void i_click_on_ebay_logo() {
        System.out.println("I click on Ebay logo");
    }

    @Then("I navigate to Ebay Home page")
    public void i_navigate_to_ebay_home_page() {
        System.out.println("I navigate back to Ebay Home page");

    }
}
