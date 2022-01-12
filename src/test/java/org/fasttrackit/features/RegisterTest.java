package org.fasttrackit.features;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerTest(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegisterPage();
        String email = RandomStringUtils.randomAlphanumeric(8)+"@email.test";
        registerSteps.enterCredentials("Rebecca", "Petrut",email, "123456", "123456");
    }


}
