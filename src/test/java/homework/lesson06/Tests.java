package homework.lesson06;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.hamcrest.core.StringContains.containsString;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends Base {

    private static final Logger LOG = LogManager.getLogger(Tests.class);


    private String log = "e2341745@nwytg.com";
    private String pas = "qwerty";
    LoginPage pageLogin = new LoginPage(driver);
    AccountPage pageAccount = new AccountPage(driver);


    @Ignore
    @Test
    public void t1_baseLogin() {

        pageAccount = pageLogin.logIn(log, pas, driver);

        Assert.assertThat(driver.findElement(By.xpath("//div/nav/div[2]/a")).getText(),
                containsString("Sign out"));
    }

    @Test
    public void t2_chainLogin() {

        LOG.info("t2_chainLogin START");
        pageAccount = pageLogin.enterUsername(log).enterPassword(pas).clickSignInBtn(driver);
        LOG.info("t2_chainLogin FINISH");

        Assert.assertThat(driver.findElement(By.xpath("//div/nav/div[2]/a")).getText(),
                containsString("Sign out"));
    }

    @Test
    public void t3_logOut() {

        pageLogin = pageAccount.signOut(driver);

        Assert.assertThat(driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/h3")).getText(),
                containsString("CREATE AN ACCOUNT"));
    }

}
