package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailPage {

    private final static Logger logger = Logger.getLogger(ProductDetailPage.class);
    WebDriver driver;

    public ProductDetailPage(WebDriver driver){
        this.driver = driver;
    }

    By buyNowButton = By.xpath("//button[@data-content-name=\"buyNow\"]");

    public void clickBuyNowButton(){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(buyNowButton));
        logger.info("Click Thanh Toan Ngay button");
        element.click();
    }
}
