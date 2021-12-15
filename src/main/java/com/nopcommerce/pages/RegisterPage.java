package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public RegisterPage(){
            PageFactory.initElements(driver,this);
        }

    @FindBy(xpath = "//h1[text()='Register']")
    WebElement RegisterTextLink;

    @FindBy(id = "gender-female")
    WebElement female;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement Firstname;

    @FindBy(id = "LastName")
    WebElement LastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement DateOfBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement MonthOfBirth;

    @FindBy(name = "DateOfBirthYear" )
    WebElement YearOfBirth;

    @FindBy(xpath ="//input[@id='Email']")
    WebElement Email;

    @FindBy(id ="Password")
    WebElement Password;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    WebElement RegisterButton;

    @FindBy(xpath="//span[@id='FirstName-error']")
    WebElement FirstNameIsRequiredLink;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement LastNameIsRequiredLink;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement EmailIsRequiredLink;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement PasswordISRequiredLink;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement ConfirmPasswordISRequiredLink;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement YourRegisterCompleteMessageLink;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement ContinueButtonLink;
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerTxt;
    @FindBy(xpath = "//span[contains(@class,'field-validation-error')]//span")
    List<WebElement> verifyRequired;
    @FindBy(className = "field-validation-error")
    List<WebElement> fieldValidationErrors;

    public String verifyRequiredMessage(String fieldName){
        String validationMessage = null;
        for (WebElement message : fieldValidationErrors) {
            if (message.getAttribute("data-valmsg-for").equals(fieldName)) {
                validationMessage = message.getText();
//                Reporter.log("Click on 'REGISTER' button" + "<br>");
                break;
            }
            log.info("verify Required Message" + fieldValidationErrors.toString());

        }
        return validationMessage;
    }
    public String verifyRegisterLinkTxt(){
//        getTextFromElement(registerTxt);
        log.info("verify register link" + registerTxt.toString());

        return registerTxt.getText();
    }
    public void setFemale(){
        Reporter.log("Select Female " +female + "<br>");
        clickOnElement(female);
        log.info("Select Female " + female.toString());

    }
    public void setFirstname(String name){
        Reporter.log("Enter firstname " + name + " to firstname field" + Firstname.toString() + "<br>");
        sendTextToElement(Firstname,name);
        log.info("Enter firstname" + Firstname.toString());
    }
    public void setLastname(String lastname){
        Reporter.log("Enter lastname " + lastname + " to lastname field" + LastName.toString() + "<br>");
        sendTextToElement(LastName,lastname);
        log.info("Enter lastname " + LastName.toString());

    }
    public void setDateOfBirth(String dob){
        Reporter.log("Select date of birth" +DateOfBirth + "<br>");
        selectByVisibleTextFromDropDown(DateOfBirth,dob);
        log.info("Select date of birth" + DateOfBirth.toString());

    }
    public void setMonthOfBirth(String mob){
        Reporter.log("Select month of birth" +MonthOfBirth + "<br>");
        selectByVisibleTextFromDropDown(MonthOfBirth,mob);
        log.info("Select month of birth" + MonthOfBirth.toString());

    }
    public void setYearOfBirth(String yob){
        Reporter.log("Select year of birth" +YearOfBirth + "<br>");
        selectByVisibleTextFromDropDown(YearOfBirth,yob);
        log.info("Select year of birth" + YearOfBirth.toString());

    }
    public void setEmail(){
        Reporter.log("Send Email" +Email + "<br>");
        randomEmail(Email);
        log.info("Send Email " + Email.toString());

    }
    public void setPassword(String psw){
        Reporter.log("Send password" +Password + "<br>");
        sendTextToElement(Password,psw);
        log.info("Send password" + Password.toString());


    }
    public void setConfirmPassword(String conpsw){
        Reporter.log("send confirm password" +ConfirmPassword + "<br>");
        sendTextToElement(ConfirmPassword,conpsw);
        log.info("send confirm password" + ConfirmPassword.toString());

    }
    public void setRegisterButton()
    {
        Reporter.log("click on register" +RegisterButton + "<br>");
        clickOnElement(RegisterButton);
        log.info("click on register" + RegisterButton.toString());

    }
    public void setFirstNameIsRequired(){
        Reporter.log("verify First name is required." +FirstNameIsRequiredLink + "<br>");
//        verifyText("First name is required.",FirstNameIsRequiredLink,"First name is required.");
    }
    public void setLastNameIsRequired(){
        Reporter.log("verify Last name is required" +LastNameIsRequiredLink + "<br>");
//        verifyText("Last name is required.",LastNameIsRequiredLink,"Last name is required.");
    }
   public void setEmailIsRequired(){
       Reporter.log("verify Email is required" +EmailIsRequiredLink + "<br>");
//       verifyText("Email is required.",EmailIsRequiredLink,"Email is required.");
    }
    public void setPasswordIsRequired(){
        Reporter.log("verify Password is required." +PasswordISRequiredLink + "<br>");
//        verifyText("Password is required.",PasswordISRequiredLink,"Password is required.");
    }
    public void setConfirmPasswordISRequired(){
        Reporter.log("verify Password is required." +ConfirmPasswordISRequiredLink + "<br>");
//        verifyText("Password is required.",ConfirmPasswordISRequiredLink,"Password is required.");
    }


    public String verifyYourRegisterCompleteMessage(){

        Reporter.log("verify Your registration completed" +YourRegisterCompleteMessageLink.toString() + "<br>");
        getTextFromElement(YourRegisterCompleteMessageLink);

        log.info("verify Your registration completed "+YourRegisterCompleteMessageLink.toString());

        return YourRegisterCompleteMessageLink .getText();

        // verifyText("Your registration completed",registerTxt,"Your registration completed");
    }

    public void setContinueButtonLink(){
        Reporter.log("click on continue button." +ContinueButtonLink + "<br>");
        clickOnElement(ContinueButtonLink);
    }
    }



