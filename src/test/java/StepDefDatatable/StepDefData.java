package StepDefDatatable;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefData {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() throws Exception {
		System.out.println("I M on registration page");
		
	}
	@When("User enters following user details")
    public void User_enters_following_user_details(DataTable datatable) throws Exception {
		List<List<String>> usersList=datatable.asLists(String.class);
		
		for(List<String> e:usersList) {
			System.out.println(e);
			
		}
		
	}
	@Then("user registration should be successful")
	public void user_registration_should_be_successfu() throws Exception {
		System.out.println("Registration successful");
	}
	
}
