package com.nopcommerce.steps;

import com.nopcommerce.pages.BuildYourOwnComputerPage;
import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DesktopsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class ComputerPagesteps {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
        System.out.println("I am on home page");
    }

    @When("^I Click on Computer Tab$")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputer();
    }

    @Then("^I should able to verify \"([^\"]*)\" text$")
    public void iShouldAbleToVerifyText(String name) {
        System.out.println(new ComputerPage().getComputerTxt());
        // new ComputerPage().getComputerTxt();
        Assert.assertEquals(name,new ComputerPage().getComputerTxt());
    }

    @When("^I click on Desktop Tab$")
    public void iClickOnDesktopTab() {
        new ComputerPage().clickOnDesktopLink();
    }

    @And("^I  click on \"([^\"]*)\"$")
    public void iClickOn(String arg0)  {
        new DesktopsPage().clickOnBuildYourOwnCom();


    }

    @And("^I  select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor)  {
        new BuildYourOwnComputerPage().setProcessor(processor);

    }

    @And("^I  Select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram)  {
        new BuildYourOwnComputerPage().setRam(ram);

    }

    @And("^I  Select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd)  {
        new BuildYourOwnComputerPage().setHDD(hdd);


    }

    @And("^I  Select OS \"([^\"]*)\"$")
    public void iSelectOS(String os)  {
        new BuildYourOwnComputerPage().setOs(os);

    }

    @And("^I  Select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software)  {
        new BuildYourOwnComputerPage().setSoftwareCheckBox(software);

    }

    @And("^I  click on ADD TO CART Button$")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().setCartBtn();
    }

    @Then("^I should able to Verify \"([^\"]*)\" text$")
    public void IShouldAbleToVerifyText(String dName) {
        System.out.println(new DesktopsPage().getDesktopTxt());
        Assert.assertEquals(dName,new DesktopsPage().getDesktopTxt());
    }


    @Then("^I should be able to verify message\"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyMessage(String excepted) {

        Assert.assertEquals(excepted, new BuildYourOwnComputerPage().setTextMsg());
    }

}
