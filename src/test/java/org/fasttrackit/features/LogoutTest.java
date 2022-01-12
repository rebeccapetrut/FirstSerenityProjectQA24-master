package org.fasttrackit.features;

import org.junit.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void logOut(){
        loginSteps.doLogin("jonnydoe@mailinator.com","123456");
        logoutSteps.clickOnAccountLink();
        logoutSteps.clickOnLogoutButton();
    }
}
