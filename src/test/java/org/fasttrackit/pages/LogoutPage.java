package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogoutPage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log Out']")
    private WebElementFacade logoutButton;



    public void clickOnAccountLink(){
        clickOn(accountLink);
    }

    public void clickOnLogoutButton(){
        clickOn(logoutButton);
    }
}
