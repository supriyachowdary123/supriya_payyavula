package com.steps;

import java.io.IOException;

import com.pages.LoginPageWrngPass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageWrngPassStep {
	
	//creating an object for login page with wrong password
	LoginPageWrngPass lgnPage=new LoginPageWrngPass();
	@Given("^user will launches to the webapplication.$")
	public void Chrome_Launch_Fail() throws IOException  {
		//calling the methods with object name
		lgnPage.Browser_Wrng_User();
	}
	
	@When("^the user is going to opens the swaglabs Homepage.$")
	public void HomePage_Open_Fail() {
	   
		lgnPage.LoginSwag_Wrng_User();
	}
	
	@Then("^the user entered the username.$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lgnPage.UserName_Wrng_User();
	 
	}
	
	@And("^the user enters wrong password.$")
	public void Password_Enter_Fail() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lgnPage.Password_Wrng_User();
	 
	}
	
	
	
	@Then("^clicks on the login button then the user is not navigate to the next page.$")
	public void LoginBtn_Click_Fail() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lgnPage.LoginBtn_Wrng_User();
	
	}


}
