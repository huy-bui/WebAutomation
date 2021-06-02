package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class Test1 extends BaseTest{

    AdvertisementPage advertisementPage;
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    LoginPage loginPage;

    @Test()
    public void testDemo(){
        advertisementPage = new AdvertisementPage(driver);
        advertisementPage.clickToCloseAd();
        homePage = new HomePage(driver);
        homePage.inputSearch("laptop");
        homePage.clickSearchButton();

        productsPage = new ProductsPage(driver);
        productsPage.clickToCloseAdPopUp();

        Assert.assertTrue(productsPage.getFirstItemName().toLowerCase().contains("laptop"));
        productsPage.selectFirstItem();

        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.clickBuyNowButton();

        cartPage = new CartPage(driver);
        cartPage.clickPayButton();

        loginPage = new LoginPage(driver);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isLoginWithFBButtonDisplayed(), "The Log in with Facebook is NOT displayed!");
        softAssert.assertTrue(loginPage.isLoginWithGoogleButtonDisplayed(), "The Log in with Google is NOT displayed!");
        softAssert.assertTrue(loginPage.isLoginWithPhoneNumberDisplayed(), "The Log in with Phone Number is NOT displayed!");
        softAssert.assertAll();
    }
}
