package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        String currentDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",
                currentDir + "/src/main/resources/chromeDriver/chromedriver_90");
        driver = new ChromeDriver();
        String url = "https://vnshop.vn/";
        driver.get(url);
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
