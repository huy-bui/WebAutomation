package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page extends PageObject{

    private final static Logger logger = Logger.getLogger(LoginPage.class);

    public Page(WebDriver driver){
        super(driver);
    }

    By loginBtn = By.xpath("//a[@href=\"https://app.memrise.com/signin\"]");
    By loginWithGoogle = By.id("google-btn");
    By inputEmail = By.id("identifierId");
    By nextButton = By.xpath("(//div[@class=\"VfPpkd-Jh9lGc\"])[1]");

    public void clickLoginBtn(){
        WebElement element = driver.findElement(loginBtn);
        elementHelper.click(element);
    }

    public void clickLoginWithGoogle(){
        WebElement element = driver.findElement(loginWithGoogle);
        elementHelper.click(element);
    }

    public void inputEmail(String email){
        WebElement element = driver.findElement(inputEmail);
        element.sendKeys(email);
    }

    public void clickNextButton(){
        WebElement element = driver.findElement(nextButton);
        elementHelper.click(element);
    }

}
