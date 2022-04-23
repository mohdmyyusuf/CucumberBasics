package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	@Given("User is on search page")
	public void user_is_on_search_page() {
		System.out.print("In the given section");

	}

	@When("user enters search key and click search buttton")
	public void user_enters_search_key_and_click_search_buttton() {
		System.out.print("In the when section");
	}

	@Then("Items are enlisted")
	public void items_are_enlisted() {
		System.out.print("In the then section");
	}

	@Then("User can read the list")
	public void user_can_read_the_list() {
		System.out.print("In the then section");
	}

}
