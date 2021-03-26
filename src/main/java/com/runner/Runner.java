package com.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/main/resources/scenarios",
        tags = {},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        glue = {"src/steps"},
        monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {

}
