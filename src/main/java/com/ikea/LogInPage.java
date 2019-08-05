package com.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);




    }

    @FindBy (css = ".sc-bxivhb.bTdUOM")
    private List<WebElement> createAccountButton;


    public CreateProfilePage clickCreateAccountButton() {
        createAccountButton.get( 0 ).click();
        return new CreateProfilePage( driver );
    }


}
