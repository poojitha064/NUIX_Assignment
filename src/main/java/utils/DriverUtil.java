package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtil {

    /**
     * Initializes a chrome driver session and navigates to provided url
     * @param url - url to open
     * @return driver instance
     */
    public WebDriver getDriver(String url){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get(url);

        return driver;
    }

    /**
     * closes the driver session
     */
    public void quitDriver(WebDriver driver){
        driver.quit();
    }
}
