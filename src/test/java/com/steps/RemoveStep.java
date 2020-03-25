package com.steps;

import java.io.IOException;

import com.pages.RemovePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemoveStep {
	//creating an object for remove page
	RemovePage remove=new RemovePage();
	@Given("^user launching the web application$")
	public void Chrome_Launch_Fail() throws IOException  {
		//calling the methods with object name
		remove.browser();
	}
	
	@When("^user opening SwagLabs home page$")
	public void HomePage_Open_Fail() {
	   
		remove.LoginSwag();
	}
	
	@Then("^user entering username and password$")
	public void UserName_Enter() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		remove.UserName();
		
	 
	}
	
	
	
	
	
	@And("^user clicking the login button$")
	public void LoginBtn_Click_Fail() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		remove. LoginBtn();
	
	}
	
	@Then("^user adds item into cart and clicks on cart button$")
	public void cartBtn() throws InterruptedException {
		remove.CartBtn();
	}
	
	
	@Then("^user clicks on remove button$")
	
		public void remove() throws InterruptedException {
		remove.Remove();
			
		}
	
	@And("^user clicks on continue shopping button$")
	public void Continue_Shopping() throws InterruptedException {
		remove.Continue();
			
		}
	

}
