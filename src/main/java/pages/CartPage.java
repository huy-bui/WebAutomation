package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private final static Logger logger = Logger.getLogger(CartPage.class);
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    By payButton = By.className("css-jwe7sy");

    public void clickPayButton(){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(payButton));
        logger.info("Click Thanh Toan button");
        element.click();
    }
}
