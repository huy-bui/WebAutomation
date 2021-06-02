package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementHelper {

    private WebDriver driver;
    private WaitHelper waitHelper;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
    }

    public void click(WebElement element){
        this.waitHelper.waitUntilElementVisible(element).click();
    }

    public void scrollToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
