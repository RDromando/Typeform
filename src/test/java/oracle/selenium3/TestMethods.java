package oracle.selenium3;


import org.openqa.selenium.By;

public class TestMethods extends SeleniumBase {

    public void login() {
        sOpen("https://admin.typeform.com/login/");
//        sWait(Selectors.loginUsernameInput);

        sType(Selectors.loginUsernameInput, "doricroman@gmail.com");
        sType(Selectors.loginPasswordInput, "typeformPassword");
        sClick(Selectors.loginSubmit);
        sIsElementPresent(By.xpath(Selectors.captchaButton));
       // sWait(Selectors.captchaButton);
//        sImplicitWait();
    }

}
