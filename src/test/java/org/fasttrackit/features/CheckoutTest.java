package org.fasttrackit.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest{

    //de lucrat
    @Test
    public void validCheckout(){

        loginSteps.doLogin("rebeccapetrut@mailinator.com","123456");
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        checkoutSteps.clickOnProceedCheckoutButton();
//        checkoutSteps.setFirstNameField("John");
//        checkoutSteps.setLastNameField("Doe");
        checkoutSteps.setAddressField("InTheStreet");
        checkoutSteps.setCityField("Cluj-Napoca");
        checkoutSteps.setStateField();
        checkoutSteps.setPostcodeField("1234");
        //checkoutSteps.setCountryField();
        checkoutSteps.setPhoneField("123456789");
        checkoutSteps.clickShippingField();
        checkoutSteps.clickOnContinueButton();
        checkoutSteps.clickOnShippingButton();
        checkoutSteps.clickOnContinueShippingButton();
        checkoutSteps.clickOnContinuePaymentButton();
        checkoutSteps.clickOnPlaceOrderButton();

        // checkoutSteps.doCheckOut("John", "Doe", "InTheStreet", "Cluj-Napoca", "5689", "123456789");
    }



}
