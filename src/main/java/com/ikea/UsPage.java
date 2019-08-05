package com.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsPage extends BasePage {

    public UsPage(WebDriver driver) {
        super(driver);


    }


    @FindBy(css = ".loginItem")
    private List <WebElement> logInButton;


    public LogInPage clickLogInButton() {
        logInButton.get( 0 ).click();
        return new LogInPage(driver);
    }

}
