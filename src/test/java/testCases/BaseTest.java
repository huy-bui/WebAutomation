package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public ChromeDriver driver;

    @BeforeMethod
    public void openBrowser(){
        String currentDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",
                currentDir + "/src/main/resources/chromeDriver/chromedriver_90");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security", "--user-data-dir=true", "--allow-running-insecure-content");
        driver = new ChromeDriver(options);
        String url = "https://www.memrise.com/app";
        driver.get(url);
        driver.manage().window().maximize();
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
