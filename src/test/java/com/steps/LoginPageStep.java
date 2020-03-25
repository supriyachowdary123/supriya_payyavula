package com.steps;

import java.io.IOException;

import com.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep {
	
	//creating an object for loginpage
	LoginPage lgnPage=new LoginPage();
	@Given("^user is launching the webapplication$")
	public void Chrome_Launch() throws IOException  {
	   
		//calling the methods with object name
		lgnPage.browser();
	}
	
	@When("^the user opens the Swaglabs Home page$")
	public void HomePage_Open() {
	   
		lgnPage.LoginSwag();
	}
	
	@Then("^the user enters the username$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lgnPage.UserName();
	 
	}
	
	@And("^the user is going to enters the password$")
	public void Password_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lgnPage.Password();
	 
	}
	
	
	
	@Then("^click on the login button user will navigate to the next page$")
	public void LoginBtn_Click() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lgnPage.LoginBtn();
	
	}

}
