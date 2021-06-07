package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Test1 extends BaseTest{

    AdvertisementPage advertisementPage;
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    LoginPage loginPage;
    Page page;

    @Test()
    public void testDemo(){
//        advertisementPage = new AdvertisementPage(driver);
//        advertisementPage.clickToCloseAd();
//        homePage = new HomePage(driver);
//        homePage.inputSearch("laptop");
//        homePage.clickSearchButton();
//
//        productsPage = new ProductsPage(driver);
//        productsPage.clickToCloseAdPopUp();
//
//        Assert.assertTrue(productsPage.getFirstItemName().toLowerCase().contains("laptop"));
//        productsPage.selectFirstItem();
//
//        productDetailPage = new ProductDetailPage(driver);
//        productDetailPage.clickBuyNowButton();
//
//        cartPage = new CartPage(driver);
//        cartPage.clickPayButton();
//
//        loginPage = new LoginPage(driver);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(loginPage.isLoginWithFBButtonDisplayed(), "The Log in with Facebook is NOT displayed!");
//        softAssert.assertTrue(loginPage.isLoginWithGoogleButtonDisplayed(), "The Log in with Google is NOT displayed!");
//        softAssert.assertTrue(loginPage.isLoginWithPhoneNumberDisplayed(), "The Log in with Phone Number is NOT displayed!");
//        softAssert.assertAll();
        page = new Page(driver);
//        page.clickLoginBtn();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        page.clickLoginWithGoogle();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        String parentWindow = driver.getWindowHandle();
//        System.out.println("Parent Window ID is : " + parentWindow);
//        for(String winHandle : driver.getWindowHandles())
//        {
//            driver.switchTo().window(winHandle);
//            System.out.println(driver.getTitle());
//            driver.manage().window().maximize();
//        }
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("svcn.bmh@gmail.com");
//        driver.findElement(By.xpath("(//div[@class=\"VfPpkd-dgl2Hf-ppHlrf-sM5MNb\"])[1]")).click();
//        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("minhhuy2403_");
//        driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();

        By durable = By.xpath("//div[contains(text(),\"durable\")]");
        By recur = By.xpath("//div[contains(text(),\"recur\")]");
        By afford = By.xpath("//div[contains(text(),\"afford\")]");
        By reduction = By.xpath("//div[contains(text(),\"reduction\")]");
        By capacity = By.xpath("//div[contains(text(),\"capacity\")]");
        By exposure = By.xpath("//div[contains(text(),\"exposure\")]");
        By revise = By.xpath("//div[contains(text(),\"revise\")]");
        By appreciation = By.xpath("//div[contains(text(),\"appreciation\")]");
        By initiative = By.xpath("//div[contains(text(),\"initiative\")]");
        By reinforce = By.xpath("//div[contains(text(),\"reinforce\")]");
        driver.findElement(By.xpath("//span[@class=\"ico ico-clock\"]")).click();

        int j = 0;
        int loop = 20;
        for(j = 0; j < loop; j++){
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for(int i = 0; i <10; i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String question = driver.findElement(By.xpath("//h2[@class=\"c3nzy8-2 frxCkD\"]")).getText();
                if (question.contains("the act of decreasing something")){
                    WebElement element = driver.findElement(reduction);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("the state of being vulnerable to something")){
                    WebElement element = driver.findElement(exposure);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("existing for a long time")){
                    WebElement element = driver.findElement(durable);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("capability to perform or produce")){
                    WebElement element = driver.findElement(capacity);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("the act of rewriting something")){
                    WebElement element = driver.findElement(revise);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("have the financial means to do something or buy something")){
                    WebElement element = driver.findElement(afford);
                    element.click();
                    try {
                        Thread.sleep(4500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("understanding of the nature or meaning of something")){
                    WebElement element = driver.findElement(appreciation);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("happen or occur again")){
                    WebElement element = driver.findElement(recur);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("readiness to embark on bold new ventures")){
                    WebElement element = driver.findElement(initiative);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (question.contains("strengthen and support")){
                    WebElement element = driver.findElement(reinforce);
                    element.click();
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(j < loop-1){
                driver.findElement(By.xpath("//div[contains(text(),\"Continue\")]")).click();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.findElement(By.xpath("//div[contains(text(),\"Not now\")]")).click();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.findElement(By.xpath("(//span[@data-testid=\"speedReview\"])[3]")).click();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
