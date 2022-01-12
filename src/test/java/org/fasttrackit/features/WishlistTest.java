package org.fasttrackit.features;

import org.junit.Test;

public class WishlistTest extends BaseTest {

    @Test
    public void addToWishlist(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.doLogin("jonnydoe@mailinator.com","123456");
        searchSteps.executeSearch("SILVER DESERT NECKLACE");
        wishlistSteps.clickOnAddToWishlistButton();
        wishlistSteps.verifyAddToWishlist("SILVER DESERT NECKLACE");
    }
}
