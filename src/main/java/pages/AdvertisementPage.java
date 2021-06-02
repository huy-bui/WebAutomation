package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdvertisementPage {

    private final static Logger logger = Logger.getLogger(AdvertisementPage.class);
    WebDriver driver;
    public AdvertisementPage(WebDriver driver){
        this.driver = driver;
    }

    By closeAd = By.className("css-12hfpfj");

    public void clickToCloseAd(){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(closeAd));
        logger.info("Click X button to close the advertisement");
        element.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
