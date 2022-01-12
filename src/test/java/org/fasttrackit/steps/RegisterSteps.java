package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private RegisterPage registerPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToRegisterPage(){
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void enterCredentials(String firstName, String lastName, String email, String pass, String passConf){
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(email);
        registerPage.setPassField(pass);
        registerPage.setConfirmationField(passConf);
        registerPage.clickNewsletterButton();
    }






}
