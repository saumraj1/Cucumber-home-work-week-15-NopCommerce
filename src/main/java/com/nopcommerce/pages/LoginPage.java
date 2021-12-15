package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

     public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(name = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public String verifyWelcomeText(){
//        String message = getTextFromElement(welcomeText);
        log.info("click on cartButton " + welcomeText.toString());

        return welcomeText.getText();
    }

    public void enterEmailId(String email){
//        randomEmail(emailField);
        sendTextToElement(emailField, email);
        Reporter.log("Enter email to email field " + emailField + "<br>");
        log.info("Enter email to email field  " + emailField.toString());

    }

    public void enterPassword(String password){
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Enter password" + passwordField.toString());

    }

    public void clickOnLoginButton(){
        Reporter.log("click on " +loginButton+ "<br>");
        clickOnElement(loginButton);
        log.info("click on" + loginButton.toString());

    }


    public String getErrorMessage(){
        Reporter.log("verify error message "+errorMessage+"<br>");
        log.info("verify error message  " + errorMessage.toString());

        return getTextFromElement(errorMessage);
    }
}
