package com.testrunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Features/login.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@SwagLabs_TS10"},
		glue = {"com.steps"},
		monochrome = true)

public class AddingRunner {

}
