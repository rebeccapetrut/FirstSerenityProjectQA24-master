package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(css = "[title = 'Sign Up for Newsletter']")
    private WebElementFacade newsletterButton;


    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPassField(String pass){
        typeInto(passField, pass);
    }

    public void setConfirmationField(String passConf){
        typeInto(confirmationField, passConf);
    }

    public void clickNewsletterButton(){
        clickOn(newsletterButton);
    }


}
