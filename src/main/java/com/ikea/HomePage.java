package com.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".btn.btn--filled")
    private List <WebElement> takeMeUsButton;



    public UsPage clickTakeMeUsButton() {
        takeMeUsButton.get( 0 ).click();
        return new UsPage(driver);


    }




}
