package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage extends PageObject{

    private final static Logger logger = Logger.getLogger(ProductsPage.class);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    By firstItem = By.xpath("(//div[@class=\"product-card__info\"])[1]");
    By adCloseBtn = By.id("pa-deny-btn-2");

    public void selectFirstItem(){
        logger.info("Click on the first item in the products list");
        WebElement element = driver.findElement(firstItem);
        elementHelper.scrollToElement(element);
        elementHelper.click(element);
    }

    public String getFirstItemName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(firstItem);
        elementHelper.scrollToElement(element);
        logger.info("Get the name of the first product");
        return element.getText();
    }

    public void clickToCloseAdPopUp(){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(adCloseBtn));
        logger.info("Click X button to close the pop up");
        element.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
