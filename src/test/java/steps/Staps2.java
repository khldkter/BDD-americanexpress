package steps;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reporting.Logs;

public class Staps2 extends BaseClass {

	@Given("user navigate to aboutPages")
	public void user_navigate_to_about_pages() {
		Logs.log("Before Hook");
	} 

	@When("user click forgot password")
	public void user_click_forgot_password() {
		aboutPages.forgotPassWordSteps("forgotPassWord");
	}

	@When("user input userId2")
	public void user_input_user_id() {
	aboutPages.userId("242526");	
	}

	@When("click continue")
	public void click_continue() {
	aboutPages.continu("continu");
		
	    
	}

	@When("continue overlay handle")
	public void continue_overlay_handle() {
		aboutPages.continu("continu");
	}

	
	
	@Then("user  will be in informationPage")
	public void user_will_be_in_information_page() throws InterruptedException{
		Thread.sleep(400);
	    Logs.log(getDriver().getCurrentUrl());
	}

	@Then("title of the page will be <informationPage>")
	public void title_of_the_page_will_be_information_page() {
		Logs.log(getDriver().getTitle());
	}


	
}
	
	