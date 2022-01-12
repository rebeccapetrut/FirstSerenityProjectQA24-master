package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductPage;

public class CheckoutSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private ProductPage productPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToLoginPage(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void enterCredentials(String email, String pass) {
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }

    @Step
    public void executeSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }

    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void clickOnProceedCheckoutButton(){
        checkoutPage.clickOnProceedCheckoutButton();
    }

    @Step
    public void setFirstNameField(String firstName){
        checkoutPage.setFirstNameField(firstName);
    }

    @Step
    public void setLastNameField(String lastName){
        checkoutPage.setLastNameField(lastName);
    }

    @Step
    public void setAddressField(String address){
        checkoutPage.setAddressField(address);
    }

    @Step
    public void setCityField(String city){
        checkoutPage.setCityField(city);
    }

    @Step
    public void setStateField(){
        checkoutPage.setStateField();
    }

    @Step
    public void setPostcodeField(String postCode){
        checkoutPage.setPostcodeField(postCode);
    }

    @Step
    public void setCountryField(){
        checkoutPage.setCountryField();
    }

    @Step
    public void setPhoneField(String phoneNumber){
        checkoutPage.setPhoneField(phoneNumber);
    }

    @Step
    public void clickShippingField(){
        checkoutPage.clickShippingField();
    }

    @Step
    public void clickOnContinueButton(){
        checkoutPage.clickOnContinueButton();
    }

    @Step
    public void clickOnShippingButton(){
        checkoutPage.clickOnShippingButton();
    }

    @Step
    public void clickOnContinueShippingButton(){
        checkoutPage.clickOnContinueShippingButton();
    }

    @Step
    public void clickOnContinuePaymentButton(){
        checkoutPage.clickOnContinuePaymentButton();
    }

    @Step
    public void clickOnPlaceOrderButton(){
        checkoutPage.clickOnPlaceOrderButton();
    }

    @Step
    public void doCheckOut(String firstName, String lastName, String address, String city, String zip, String phone){
        setFirstNameField(firstName);
        setLastNameField(lastName);
        setAddressField(address);
        setCityField(city);
        setPostcodeField(zip);
        setPhoneField(phone);
    }





}
