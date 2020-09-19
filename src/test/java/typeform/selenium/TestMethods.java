package typeform.selenium;


public class TestMethods extends SeleniumBase {

    public void login() throws InterruptedException {
        sOpen("https://admin.typeform.com/login/");
        sWait(Selectors.loginUsernameInput);

        sType(Selectors.loginUsernameInput, "doricroman@gmail.com");
        sType(Selectors.loginPasswordInput, "typeformPassword");
        sClick(Selectors.loginSubmit);
    }

}
