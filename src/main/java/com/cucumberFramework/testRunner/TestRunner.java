package com.cucumberFramework.testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * 
 * @author VIkas Kumar
 *
 */
//CuucmberOptions tag will help us to identify the feature file and location and aslo help us to help the stepdefination location.
//And some other options.
@CucumberOptions(features = "src/test/resources/features", glue = {
		"com/cucumberFramework/stepdefinitions" }, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" })
public class TestRunner {

	private TestNGCucumberRunner testNGCucumberRunner;
//this method will run first before executing any of the class, So this.getClass will give us the TestRunner class and all CucumberOptions properties.
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
//then test method will execute, and this method is getting one prapmeter called as dataprovider features and this features is implemented as below on the method.
//So All @CucumberOptions details will execute one by one from this method with the help of features dataprovider method.	
	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
//this method will get the all details from the @CucumberOptions like features, tags, glue etc... details
	//All detials will pass to the feature method as ablve. 
	
	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}
//here we are closing testNGCucumberRunner connection with the help of finish method.
	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}

}
