package com.steps;

import java.io.IOException;

import com.pages.AddingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddingStep {
	//creating the object for adding page
	AddingPage addPage=new AddingPage();
	@Given("^we need to launch the chrome browser$")
	public void Chrome_Launch_Fail() throws IOException  {
		//calling the methods with object name
		addPage.browser();
	}
	
	@When("^we are opening the swaglabs page$")
	public void HomePage_Open_Fail() throws IOException, InterruptedException {
		addPage.UserName();
		
	}
	
	@Then("^We should enter the usernme and password and click on login button$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		addPage.LoginBtn();	
		
	}
	
	@Then("^we should add an item to the cart and remove it$")
	public void Adding_carts() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		addPage.AddCart();

}
}
