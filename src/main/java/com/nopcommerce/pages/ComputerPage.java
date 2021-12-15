package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[text()='Computers']")
    WebElement computerTxt;
    @FindBy(id = "Computers")
    WebElement computerLink;
    @FindBy(id = "Desktops")
    WebElement desktopLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Notebooks')]")
    WebElement notebookLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Software')]")
    WebElement softwareLink;

    public String getComputerTxt() {
        Reporter.log("verify computer text" +computerTxt + "<br>");
        getTextFromElement(computerTxt);
        log.info("verify computer text " + computerTxt.toString());
        return computerTxt.getText();
    }

    public void clickOnComputer() {
        Reporter.log("click on computerLink" +computerLink + "<br>");
        mouseHoverToElement(computerLink);
        log.info("click on computer loginLink " + computerLink.toString());

    }

    public void clickOnDesktopLink() {
        Reporter.log("click on desktopLink" +desktopLink + "<br>");
        clickOnElement(desktopLink);
        log.info("click on desktopLink " + desktopLink.toString());

    }

    public void clickOnNoteBooklink() {
        Reporter.log("click on notebookLink" +notebookLink + "<br>");
        clickOnElement(notebookLink);
        log.info("click on notebook link " + notebookLink.toString());

    }

    public void ClickOnSoftwareLink() {
        Reporter.log("click on softwareLink" +softwareLink + "<br>");
        clickOnElement(softwareLink);
        log.info("click on softwareLink" + softwareLink.toString());

    }


}
