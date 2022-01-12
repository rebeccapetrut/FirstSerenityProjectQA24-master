package org.fasttrackit.features;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTest(){
        loginSteps.doLogin("jonnydoe@mailinator.com","123456");
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        cartSteps.clickOnDeleteButton();
        cartSteps.verifyDeleteProduct();
    }
}
