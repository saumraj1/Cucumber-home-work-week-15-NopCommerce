package com.nopcommerce.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;



public class RegisterPageSteps {
//    SoftAssert softAssert = new SoftAssert();
    String field;
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
//        new RegisterPage().setRegisterButton();
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should be able to navigate to the registration page$")
    public void iShouldBeAbleToNavigateToTheRegistrationPage() {
    }

    @And("^I should be able to see \"([^\"]*)\" page title$")
    public void iShouldBeAbleToSeePageTitle(String expected) throws Throwable {
        Assert.assertEquals(expected, new RegisterPage().verifyRegisterLinkTxt());
    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().setRegisterButton();
    }


    @When("^I didn't enter value in field \"([^\"]*)\"$")
    public void iDidnTEnterValueInField(String fieldName) throws Throwable {
        new RegisterPage().verifyRequiredMessage(fieldName);
    }



    @Then("^I should be able to see under all field$")
    public void iShouldBeAbleToSeeUnderAllField() {
        System.out.println("validation error");
    }

    @When("^I didn't enter value in field \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iDidnTEnterValueInFieldAnd(String actual,String fieldName)  {
        Assert.assertEquals(actual, new RegisterPage().verifyRequiredMessage(fieldName));
       /* softAssert.assertEquals("First name is required.",
                registerPage.getValidationErrorMessageForField("FirstName"),
                "FirstName field error message not displayed");*/

    }

    @And("^I should able to see message \"([^\"]*)\"$")
    public void iShouldAbleToSeeMessage(String actual) throws Throwable {
        Assert.assertEquals(actual, new RegisterPage().verifyRequiredMessage(field));

    }

    @When("^I didn't enter First Name \"([^\"]*)\"$")
    public void iDidnTEnterFirstName(String fname) throws Throwable {
        field=fname;
    }

    @When("^I didn't enter Last Name \"([^\"]*)\"$")
    public void iDidnTEnterLastName(String lname) throws Throwable {
        field=lname;
    }

    @When("^I didn't enter Email \"([^\"]*)\"$")
    public void iDidnTEnterEmail(String email) throws Throwable {
        field=email;
    }

    @When("^I didn't enter Password \"([^\"]*)\"$")
    public void iDidnTEnterPassword(String pass) throws Throwable {
        field=pass;
    }

    @When("^I didn't enter Confirm Password \"([^\"]*)\"$")
    public void iDidnTEnterConfirmPassword(String cpass) throws Throwable {
field=cpass;
    }

   /* @When("^I click on Register Link$")
    public void iClickOnRegisterLink() {
    }
*/
    @And("^I Select gender \"([^\"]*)\"$")
    public void iSelectGender(String arg0) throws Throwable {
        new RegisterPage().setFemale();
    }

    @And("^I Enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String fname) throws Throwable {
        new RegisterPage().setFirstname(fname);
    }

    @And("^I Enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lname) throws Throwable {
new RegisterPage().setLastname(lname);
    }

    @And("^I Select day \"([^\"]*)\"$")
    public void iSelectDay(String dob) throws Throwable {
new RegisterPage().setDateOfBirth(dob);
    }

    @And("^I Select month \"([^\"]*)\"$")
    public void iSelectMonth(String dom) throws Throwable {
new RegisterPage().setMonthOfBirth(dom);
    }

    @And("^I Select year \"([^\"]*)\"$")
    public void iSelectYear(String doy) throws Throwable {
new RegisterPage().setYearOfBirth(doy);
    }

    @And("^I Enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws Throwable {
new RegisterPage().setEmail();
    }

    @And("^I Enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
new RegisterPage().setPassword(password);
    }

    @And("^I Enter  confirm  password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String conPass) throws Throwable {
        new RegisterPage().setPassword(conPass);
    }

    @And("^I Click On REGISTER button$")
    public void iClickOnREGISTERButton() {
        new RegisterPage().setRegisterButton();

    }

    @Then("^I should be able to verify message \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyMessage(String expected) throws Throwable {
        Assert.assertEquals(expected, new RegisterPage().verifyYourRegisterCompleteMessage());

    }
}
