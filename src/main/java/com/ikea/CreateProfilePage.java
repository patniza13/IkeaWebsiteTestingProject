package com.ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProfilePage extends BasePage {

    public CreateProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#createUser_firstName")
    private WebElement firstNameField;

    @FindBy(css = "#createUser_lastName")
    private WebElement lastNameField;

    @FindBy(css = "#createUser_phone2")
    private WebElement phoneNumField;

    @FindBy(css = "#createUser_email1")
    private WebElement emailField;

    @FindBy(css = "#createUser_email1_verify")
    private WebElement verifyEmailField;

    @FindBy(css = "#createUser_logonPassword")
    private WebElement passwordField;

    @FindBy(css = "#createUser_logonPasswordVerify" )
    private WebElement verifyPasswordField;

    @FindBy(css = "#createUser_acceptCond")
    private WebElement privacyBox;

    @FindBy(css = "#createUser_firstName_required_FieldError")
    private WebElement firstNameRequired;

    @FindBy(css = "#createUser_lastName_required_FieldError")
    private WebElement lastNameRequired;

    @FindBy(css = "#createUser_email1_required_FieldError")
    private WebElement emailRequired;

    @FindBy(css = "#createUser_email1_verify_required_FieldError")
    private WebElement reenterEmailRequired;

    @FindBy(css = "#createUser_logonPassword_required_FieldError")
    private WebElement passwordRequired;

    @FindBy(css = "#createUser_logonPasswordVerify_required_FieldError")
    private WebElement reenterPasswordRequired;

    @FindBy(css = "#createUser_acceptCond_required_FieldError")
    private WebElement policyAcceptRequired;


    public void inputFirstName(String firstName) {
        firstNameField.sendKeys( firstName );
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys( lastName );
    }

    public void inputPhoneNum(String phoneNum) {
        phoneNumField.sendKeys( phoneNum );
    }

    public void inputEmail(String email) {
        emailField.sendKeys( email );
    }

    public void inputVerifyEmail(String verifyEmail) {
        verifyEmailField.sendKeys( verifyEmail );
    }

    public void inputPassword(String password) {
        passwordField.sendKeys( password );

    }

    public void inputVerifyPassword(String verifyPassword) {
        verifyPasswordField.sendKeys( verifyPassword );
    }

    public void clickPrivacyBox() {
        privacyBox.click();

    }

    public void clearFirstName() {
        firstNameField.clear();
    }

    public void clearLastName() {
        lastNameField.clear();
    }

    public void clearPhoneNum() {
        phoneNumField.clear();
    }

    public void clearEmail() {
        emailField.clear();
    }

    public void clearVerifyEmail() {
        verifyEmailField.clear();
    }

    public void clearPassword() {
        passwordField.clear();
    }

    public void clearVerifyPassword() {
        verifyPasswordField.clear();
    }

    public void clearPrivacyBox() {
        privacyBox.clear();
    }

    public String getFirstNameRequired() {
        return firstNameRequired.getText();
    }

    public String getLastNameRequired() {
        return lastNameRequired.getText();
    }

    public String getEmail() {
        return emailRequired.getText();
    }

    public String getReenterEmailRequired() {
        return reenterEmailRequired.getText();
    }

    public String getPassword() {
        return passwordRequired.getText();
    }

    public String getReenterPasswordRequired() {
        return reenterPasswordRequired.getText();
    }

    public String getPolicyAcceptRequired() {
        return policyAcceptRequired.getText();
    }





}
