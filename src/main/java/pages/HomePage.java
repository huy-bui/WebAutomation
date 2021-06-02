package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final static Logger logger = Logger.getLogger(HomePage.class);
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By searchBox = By.xpath("//input[@role=\"searchbox\"]");
    By searchButton = By.xpath("//button[@aria-label=\"Search\"]");

    public void inputSearch(String searchText){
        logger.info("Input text to search...");
        driver.findElement(searchBox).sendKeys(searchText);
    }

    public void clickSearchButton(){
        logger.info("Click Search button");
        driver.findElement(searchButton).click();
    }
}
