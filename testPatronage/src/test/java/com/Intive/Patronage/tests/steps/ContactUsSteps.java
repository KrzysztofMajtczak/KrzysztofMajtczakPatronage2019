package com.Intive.Patronage.tests.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import com.Intive.Patronage.tests.pages.ContactUsPage;
import com.Intive.Patronage.tests.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class ContactUsSteps extends DriverFactory {

    ContactUsSteps contactUsSteps = new ContactUsSteps(driver);

    public ContactUsSteps(WebDriver driver) {

    }

    @Given ("^I open Automationpractice.com website$")
    public void iOpenAutomationpracticeComWebsite() { ContactUsPage.openContactUsPage();
    }

    @When("^I click on ContactUs Navigation menu$")
    public void iClickOnContactUsNavigationMenu() {
    }

    @And("^I click on Send button$")
    public void iClickOnSendButton() {
    }

    @Then("^I see that error popup is visible$")
    public void iSeeThatErrorPopupIsVisible() {

    }
}
