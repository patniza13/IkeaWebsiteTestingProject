package com.ikea;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    private WebDriverWait wait;
    private HomePage homePage;
    private UsPage usPage;
    private LogInPage logInPage;
    private CreateProfilePage createProfilePage;

    private static Logger log = Logger.getLogger( LoginTest.class.getName() );



    @Test
    public void testLogin() throws InterruptedException {
        homePage = new HomePage( driver );
        usPage = new UsPage( driver );
        logInPage = new LogInPage( driver );
        createProfilePage = new CreateProfilePage( driver );





        homePage.clickTakeMeUsButton();
        usPage.clickLogInButton();
        logInPage.clickCreateAccountButton();
        createProfilePage.inputFirstName( "Someone" );
        createProfilePage.inputLastName( "Veryimportant" );
        createProfilePage.inputPhoneNum( "8001234567" );
        createProfilePage.inputEmail( "important@gmail.com" );
        createProfilePage.inputVerifyEmail( "important@gmail.com" );
        createProfilePage.inputPassword( "Зmxncb1234" );
        createProfilePage.inputVerifyPassword( "Зmxncb1234" );
        createProfilePage.clickPrivacyBox();

        createProfilePage.clearFirstName();
        createProfilePage.clearLastName();
        createProfilePage.clearPhoneNum();
        createProfilePage.clearEmail();
        createProfilePage.clearVerifyEmail();
        createProfilePage.clearPassword();
        createProfilePage.clearVerifyPassword();
        createProfilePage.clickPrivacyBox();

        String firstNameNote = createProfilePage.getFirstNameRequired();
        log.info("Please enter the First name. " + firstNameNote  );
        Assert.assertEquals( "Please enter the First name.", firstNameNote );

        String lastNameNote = createProfilePage.getLastNameRequired();
        log.info( "Please enter the Last name. " + lastNameNote );
        Assert.assertEquals( "Please enter the Last name.", lastNameNote );

        String emailNote = createProfilePage.getEmail();
        log.info( "Please enter the Email Address. " + emailNote );
        Assert.assertEquals( "Please enter the Email Address.", emailNote );

        String reenterEmailNote = createProfilePage.getReenterEmailRequired();
        log.info("Please re-enter the Email Address. " + reenterEmailNote  );
        Assert.assertEquals( "Please re-enter the Email Address.", reenterEmailNote );

        String passwordNote = createProfilePage.getPassword();
        log.info("Please enter a password. " + passwordNote  );
        Assert.assertEquals( "Please enter a password.", passwordNote );

        String reenterPasswordNote = createProfilePage.getReenterPasswordRequired();
        log.info( "Please re-enter Username or Password. " + reenterPasswordNote );
        Assert.assertEquals( "Please re-enter Username or Password.", reenterPasswordNote );

        String acceptPolicyNote = createProfilePage.getPolicyAcceptRequired();
        log.info( "You cannot register unless you have accepted the Privacy Policy on www.IKEA-USA.com, including the treatment of personal information. " + acceptPolicyNote );
        Assert.assertEquals( "You cannot register unless you have accepted the Privacy Policy on www.IKEA-USA.com, including the treatment of personal information.", acceptPolicyNote );





    }
}
