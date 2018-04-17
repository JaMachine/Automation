package homework.lesson08;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AllTests extends Base {

    private static final Logger LOG = LogManager.getLogger(AllTests.class);

    LoginPage pLogin = new LoginPage(driver);
    AccountPage pAccount = new AccountPage(driver);

    @Test
    public void t0_Login() {

        LOG.info(" Д Е Л А Е М   В Х О Д ");
        LOG.debug("Д Е Л А Е М   В Х О Д   Д Э Б А Г ");

        pLogin.logIn(driver);

        // возвращает FAIL
        pAccount.sendQuery(driver, "dress").selectProduct();
        driver.get("http://automationpractice.com/index.php?controller=history");
    }

//    @Test
//    public void t1_findProduct() {
//        pAccount.sendQuery(driver, "dress").selectProduct();
//    }


}
