package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 {


@Given("Open chrome browser and enter iTime url")
public void open_chrome_browser_and_enter_iTime_url() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Given success");
}

@When("Enter username,password to log in and search for itime")
public void enter_username_password_to_log_in_and_search_for_itime() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("When success");
}

@Then("Time entries successfully marked")
public void time_entries_successfully_marked() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Then success");
}
}
