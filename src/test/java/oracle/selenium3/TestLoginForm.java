package oracle.selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestLoginForm extends StackSignUpPage {

    public WebDriver driver;
    StackSignUpPage objStackSignUpPage;
    String url = "https://admin.typeform.com/login/";

    ChromeOptions options = new ChromeOptions();


    public TestLoginForm(WebDriver driver) {
        super(driver);
    }

    @BeforeClass
    public void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "src\\chromedriver\\chromedriver.exe");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void mainTestCase() {
        objStackSignUpPage = new StackSignUpPage(driver);
        objStackSignUpPage.sOpen(url);
        objStackSignUpPage.sType(loginUsernameInput, "doricroman@gmail.com");
        objStackSignUpPage.sType(loginPasswordInput, "romando");
        objStackSignUpPage.sClick(loginSubmit);
        objStackSignUpPage.sIsElementPresent(captchaButton);
    }

    @AfterClass
    public void tearDownClass() {
            driver.quit();
    }

}
