package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="features file", 
		glue= "com.stepdef",
	    format= {"pretty","html:test-output"},
		monochrome= true,
		dryRun=false	
		
		)
public class TestRunner {

}
