package typeform.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {


    public WebDriver driver;


    /**
     * Start and maximazing Chrome browser
     */
    public void sStartBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /**
     * Close Chrome browser
     */
    public void sStopBrowser() {
        driver.quit();
    }

    /**
     * Type value to input
     *
     * @param selector
     * @param value
     * @throws InterruptedException
     */
    public void sType(String selector, String value) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selector)));
        driver.findElement(By.xpath(selector)).sendKeys(value);
    }


    /**
     * Click element
     *
     * @param selector
     * @throws InterruptedException
     */
    public void sClick(String selector) throws InterruptedException {
        driver.findElement(By.xpath(selector)).click();
    }

    /**
     * Wait for clickable element
     *
     * @param selector
     */
    public void sWait(String selector) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement element;
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selector)));
    }

    /**
     * Open specific URL
     *
     * @param url
     */
    public void sOpen(String url) {
        driver.get(url);
    }
}

