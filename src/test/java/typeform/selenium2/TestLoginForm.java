package typeform.selenium2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestLoginForm extends TestMethods {

    @BeforeClass
    public void setUpClass() {
        sStartBrowser();
    }

    @Test
    public void mainTestCase() throws InterruptedException {
        login();
    }

    @AfterClass
    public void tearDownClass() {
        sStopBrowser();
    }

}
