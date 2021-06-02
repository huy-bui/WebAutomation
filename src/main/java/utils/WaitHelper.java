package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

    private WebDriver driver;

    public WaitHelper(WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitUntilElementVisible(WebElement element){
        try{
            return new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

//    public WebElement waitUntilElementDisplayed(WebElement element) {
//        Wait<WebDriver> wait = (new FluentWait(this.driver)).withTimeout(Duration.ofSeconds(60L)).pollingEvery(Duration.ofMillis(200L)).ignoring(StaleElementReferenceException.class);
//        return (WebElement)wait.until(ExpectedConditions.visibilityOf(element));
//    }
}
