package oracle.selenium3;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StackSignUpPage {

    WebDriver driver;

    @FindBy
    (xpath = "//input[@id=\"email\"]")
    WebElement loginUsernameInput;

    @FindBy
    (xpath = "//input[@id=\"password\"]")
    WebElement loginPasswordInput;

    @FindBy
    (xpath = "//div[@id=\"rc-imageselect\"]")
    WebElement loginSubmit;

    @FindBy
    (xpath = "//div[@class=\"verify-button-holder\"]")
    WebElement captchaButton;

    public StackSignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sOpen(String url) {

        driver.get(url);
    }

    public void sType(WebElement selector, String value) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.valueOf(selector))));
        driver.findElement(By.xpath(String.valueOf(selector))).sendKeys(value);
    }

    public void sClick(WebElement selector) {

        driver.findElement(By.xpath(String.valueOf(selector))).click();
    }

    public boolean sIsElementPresent(WebElement by) {
        try {
            driver.findElement((By) by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
