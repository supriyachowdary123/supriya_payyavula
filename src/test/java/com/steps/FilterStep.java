package com.steps;

import java.io.IOException;

import com.pages.FilterPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterStep {

	//creating an object for filter page
	FilterPage fltPage = new FilterPage();

	@Given("^user launches the web application$")
	public void Chrome_Launch_Fail() throws IOException {

		//calling the methods with object name
		fltPage.browser();
	}

	@When("^user opens SwagLabs home page$")
	public void HomePage_Open_Fail() {

		fltPage.LoginSwag();
	}

	@Then("^user enters username and password$")
	public void UserName_Enter() throws InterruptedException, IOException {
		

		fltPage.UserName();

	}

	@Then("^user clicks the login button$")
	public void LoginBtn_Click_Fail() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		fltPage.LoginBtn();

	}

	@And("^user clicks dropdown button$")
	public void Filter_Select() throws InterruptedException {
		fltPage.Filter();
	}

}
