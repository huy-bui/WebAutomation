package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private final static Logger logger = Logger.getLogger(LoginPage.class);
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By loginWithFB = By.xpath("//button[@data-content-name=\"Facebook\"]");
    By loginWithGoogle = By.xpath("//button[@data-content-name=\"Google\"]");
    By loginWithPhoneNumber = By.xpath("//button[@data-content-name=\"PhoneNumber\"]");

    public boolean isLoginWithFBButtonDisplayed(){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(loginWithFB));
        logger.info("Verify the Log in With Facebook is displayed or not");
       return element.isDisplayed();
    }

    public boolean isLoginWithGoogleButtonDisplayed(){
        logger.info("Verify the Log in With Google is displayed or not");
        return driver.findElement(loginWithGoogle).isDisplayed();
    }

    public boolean isLoginWithPhoneNumberDisplayed(){
        logger.info("Verify the Log in With Phone Number is displayed or not");
        return driver.findElement(loginWithPhoneNumber).isDisplayed();
    }
}
