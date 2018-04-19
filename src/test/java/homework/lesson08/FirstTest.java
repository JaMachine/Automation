package homework.lesson08;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;

import static org.hamcrest.core.StringContains.containsString;

@RunWith(JUnit4.class)
public class FirstTest extends Base {
    LoginPage page = new LoginPage(driver);

    @Test
    public void buySomethings() {

        page
                .logIn(driver)
                .sendQuery(driver)
                .orderProduct(driver)
                .visitHistory(driver);

        Assert.assertThat(driver.findElement(By.xpath("//*[@id=\"order-detail-content\"]/table/tbody/tr/td[2]/label")).getText(),
                containsString("Printed Dress"));
        Assert.assertThat(driver.findElement(By.xpath("//*[@id=\"block-order-detail\"]/table/tbody/tr/td[1]")).getText(),
                containsString(timestamp()));


    }

}
