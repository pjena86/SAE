package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/main/resources/scenarios",
        glue = "steps")

public class Runner extends AbstractTestNGCucumberTests {


}
