package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class PageObject{

    protected WebDriver driver;
    protected ElementHelper elementHelper;

    public PageObject(WebDriver driver){
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

}
