package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.Iterator;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class StepDefinations {

	@Given("^user is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("user_is_on_netbanking_landing_page");
	}


    @When("^user login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
    	System.out.println(username+" "+password);
    }

	@Then("^Home page is displayed with below details$")
	public void home_page_is_displayed(DataTable data) throws Throwable {
		System.out.println("home_page_is_displayed");
		List<String> lt = data.asList();
		Iterator<String> it = lt.iterator();
		while(it.hasNext()) {
		System.out.println(it.next().toString());
		}
	}

	@And("^cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("cards_are_displayed");
		System.out.println("============================================");
	}
}
