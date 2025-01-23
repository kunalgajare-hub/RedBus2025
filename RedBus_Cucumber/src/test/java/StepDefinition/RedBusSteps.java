package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.SearchBusPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RedBusSteps extends BaseClass{
	
	SearchBusPage search = new SearchBusPage();

	
	@Given("user should open in the {string} browser and the redbus site {string}")
	public void user_should_open_in_the_browser_and_the_redbus_site(String browsername, String url) {
	    BaseClass.Initialization(browsername, url);
	}


	@When("user enter select {string} city name and {string} destination city name")
	public void user_enter_select_city_name_and_destination_city_name(String string, String string2) 
	{
	   search.city(string, string2);
	}

	@When("after user selects the {string} and {string} from the given calendar")
	public void after_user_selects_the_and_from_the_given_calendar(String string, String string2) 
	{
	  search.calender(string, string2);
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() 
	{
	    search.ClickOnSearch();
	}

	@When("after that terminate the session")
	public void after_that_terminate_the_session() 
	{
	  BaseClass.Close();
	}


}
