package com.testrunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Features/login.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags= {"@SwagLabs_TS10"},
		//tags = {"@SwagLabs_TS1,@SwagLabs_TS2,@SwagLabs_TS3,@SwagLabs_TS4,@SwagLabs_TS5,@SwagLabs_TS6,@SwagLabs_TS7,@SwagLabs_TS8,@SwagLabs_TS9,@SwagLabs_TS10"},
		glue = {"com.steps"},
		monochrome = true)

public class AddingRunner {

}
