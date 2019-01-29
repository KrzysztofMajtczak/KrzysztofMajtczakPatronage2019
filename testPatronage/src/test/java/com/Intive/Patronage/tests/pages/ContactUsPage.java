package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContactUsPage {

    public static String GOOGLE_URL = "http://automationpractice.com/index.php";
    public WebDriver driver;

    @FindBy(how = How.ID, using = "contact-link")
    public WebElement resultsWebPart;

    public ContactUsPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void openContactUsPage(){
        driver.get(GOOGLE_URL);
    }

    public void setResultsWebPart(WebElement resultsWebPart) {
        this.resultsWebPart = resultsWebPart;
    }

    public void verifyIfResultsAreVisible() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(resultsWebPart));
    }


}
