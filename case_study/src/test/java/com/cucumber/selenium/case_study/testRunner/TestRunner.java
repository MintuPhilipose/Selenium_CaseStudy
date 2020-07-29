package com.cucumber.selenium.case_study.testRunner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/com/cucumber/selenium/case_study/feature"},
		glue = {"com.cucumber.selenium.case_study.steps", "com.cucumber.selenium.case_study.utils"}, 
		plugin = {
					"pretty", 
					"html:target/cucumber-html-report" , 
					"json:target/cucumber-json-report"
				}, 
		monochrome = true, 
//		tags = {"@sanity","~@telecom"}
		tags= {"@sanity"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
