package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.LogoutPage;

public class LogoutSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private LogoutPage logoutPage;


    @Step
    public void clickOnAccountLink(){
        logoutPage.clickOnAccountLink();
    }


    @Step
    public void clickOnLogoutButton(){
        logoutPage.clickOnLogoutButton();
    }

}
