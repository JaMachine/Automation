package lesson09.a_using_creds_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

@RunWith(JUnit4.class)
public class FirstTest extends BaseTest {

    private static final Logger LOG = LogManager.getLogger(FirstTest.class);

    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void loginTest() {
        LOG.info("V I Z I T ");
        loginPage.visit();
        assertThat(titleContains("Login"));
        loginPage.login();
        assertThat(titleContains("My account"));
    }
}