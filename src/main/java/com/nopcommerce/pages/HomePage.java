package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logoLink;
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccount;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;



    //   By loginLink = By.linkText("Log in");
  //  By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        Reporter.log("click on loginlink" +loginLink + "<br>");
        clickOnElement(loginLink);
        log.info("click on cartButton " + loginLink.toString());

    }

    public void clickOnRegisterLink(){
        Reporter.log("click on registerlink" +registerLink + "<br>");
        clickOnElement(registerLink);
        log.info("click on registerlink " + registerLink.toString());

    }
    public void verifyLogo(){

    }
    public void clickOnMyAccount(){
        Reporter.log("click on myAccount" +myAccount + "<br>");
        clickOnElement(myAccount);
        log.info("click on myAccount " + myAccount.toString());

    }
    public void clickOnLogOut(){
        Reporter.log("click on logout" +logOut + "<br>");
        clickOnElement(logOut);
        log.info("click on logout" + logOut.toString());

    }
    public String verifyLogoutLink(){
        Reporter.log("click on logOut" +logOut + "<br>");
//        getTextFromElement(logOut);
//        log.info("click on logOut" + logOut.toString());

        return logOut.getText();
    }
    public String verifyLoginLink(){
        Reporter.log("click on loginlink" +loginLink + "<br>");
        getTextFromElement(loginLink);
        log.info("click on loginlink" + loginLink.toString());

        return loginLink.getText();
    }


/*    public void clickOntab(WebElement webElement, String name){
        clickOnElement(webElement);
//            verifyText(name,webElement,name+" not displayed");
        //        verifyText(name,by,name+" not displayed");
    }
    String[] tabs = {"Computers", "Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"};

     *//*   List<WebElement> allElem=new ArrayList<WebElement>();
            for (String names: tabs){
             @FindBy(linkText=names)
                     allElem.add();
        }*//*

    public void clickOnTabs(){
        String[] tabs = {"Computers", "Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"};
        //WebElement finals1;
        List<WebElement> allElem=new ArrayList<WebElement>();

        for(String s: tabs){
            allElem.add(driver.findElement(By.linkText(s)));

        }

        *//*
        * By lcx=By.xpath("(//a[normalize-space()='"+name+"'])[1]");

    By lNam = By.linkText(name);

        * *//*
        for (WebElement s1:allElem) {
            @FindBys(linkText =s1 )
                    allElem.add(s1.getText());
        }
        for (String names : tabs) {
            @FindBys(linkText = names)
            WebElement newLogLink;

            clickOntab(newLogLink, names);
        }
    }*/

}
