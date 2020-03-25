package com.steps;

import java.io.IOException;

import com.pages.SkippingPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkippingStep {
	
	//creating an object for skipping page
	SkippingPage skip=new SkippingPage();
	@Given("^we need to launch the web application$")
	
	
	public void Chrome_Launch_Fail() throws IOException  {
		//calling the methods with object name
		skip.browser();
	}
	
	@When("^opening the swaglabs page using the link$")
	public void HomePage_Open_Fail() {
	   
		skip.LoginSwag();
	}
	
	@Then("^we need to enter the username and password$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		skip.UserName();
		
	 
	}
	
	
	
	
	
	@And("^we need to click on login button$")
	public void LoginBtn_Click_Fail() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		skip. LoginBtn();
	
	}
	
	
@Then("^we need to click on add to cart,click on cart button and again click on click on cart checkout button$")
public void skipping() {
	skip.Skipping();
	
}

@And("^then click on continue$")
public void finish() {
	skip.finish();
}
}
