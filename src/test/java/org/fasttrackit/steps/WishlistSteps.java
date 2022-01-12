package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.WishlistPage;
import org.junit.Assert;

public class WishlistSteps extends ScenarioSteps {


    private ProductPage productPage;
    private WishlistPage wishlistPage;



    @Step
    public void clickOnAddToWishlistButton(){
        wishlistPage.clickOnAddToWishlistButton();
    }

    @Step
    public void verifyAddToWishlist(String productName){
        Assert.assertEquals(productName +"has been added to your wishlist", productName +"has been added to your wishlist");
    }
}
