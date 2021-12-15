package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopTxt;
    @FindBy(xpath = "//span[contains(text(),'Sort by')]")
    WebElement sortBy;
    @FindBy(xpath = "//span[contains(text(),'Display')]")
    WebElement display;
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;
    @FindBy(linkText = "Build your own computer")
    WebElement BldComputerLnk;


    public String getDesktopTxt(){
        Reporter.log("verify Desktop Text" +desktopTxt + "<br>");
        getTextFromElement(desktopTxt);
        log.info("verify Desktop Text " + desktopTxt.toString());

        return desktopTxt.getText();
    }
    public void clickOnSortBy(){
        Reporter.log("click on sortBy" +sortBy + "<br>");
        clickOnElement(sortBy);
        log.info("click on sortBy " + sortBy.toString());

    }
    public void clickOnDisplay(){
        Reporter.log("click on display" +display + "<br>");
        clickOnElement(display);
        log.info("click on display " + display.toString());

    }
    public void setProductList(){
        Reporter.log("click on productList" +productList + "<br>");
        clickOnElement(productList);
        log.info("click on productList" + productList.toString());

    }
    public void clickOnBuildYourOwnCom() {
        //CustomListeners.test.log(Status.PASS,"Verify Desktop Text" + computerTxt);
        clickOnElement(BldComputerLnk);
        log.info("click on Build On Your Own Computer: "+BldComputerLnk.toString());
    }



}
