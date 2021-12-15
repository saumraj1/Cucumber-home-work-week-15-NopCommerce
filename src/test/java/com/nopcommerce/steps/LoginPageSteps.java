package com.nopcommerce.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginPageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        System.out.println("I am on HomePage");
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should able to see \"([^\"]*)\"$")
    public void iShouldAbleToSee(String expexted) throws Throwable {
//        new LoginPage().verifyWelcomeText();
        Assert.assertEquals("welcome message not displayed", expexted, new LoginPage().verifyWelcomeText());
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {

    }

    @And("^I should be able to see \"([^\"]*)\" option$")
    public void iShouldBeAbleToSeeOption(String expectedText) throws Throwable {

        Assert.assertEquals(expectedText,new HomePage().verifyLogoutLink());
    }



    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws Throwable {
        new LoginPage().enterEmailId(email);
    }


    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String expectedText)  {
        Assert.assertEquals(expectedText,new LoginPage().getErrorMessage());

    }
}
