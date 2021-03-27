package com.steps;

import com.pageObjectRepo.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
    HomePage homePage = new HomePage();

    @Given("^user launches the website ([^\"]*)$")
    public void user_launches_the_website_url() throws Throwable {

    }

    @When("^user enters valid ([^\"]*) and ([^\"]*)$")
    public void user_enters_valid_username_and_password() throws Throwable {

    }

    @Then("^verify that user will be able to login$")
    public void verifyThatUserWillBeAbleToLogin() throws Throwable {
        homePage.clickSignup();
    }

}
