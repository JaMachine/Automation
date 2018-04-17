package homework.lesson05;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

import static org.hamcrest.core.StringContains.containsString;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends Base {



    @Test
    public void test01_Login() {

        d.findElement(By.xpath("//div/nav/div[1]/a")).click();
        d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("e2341745@nwytg.com");
        d.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("qwerty");
        d.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        Assert.assertThat(d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).getText(), containsString("Sign out"));


    }

    @Test
    public void test02_openMyOrders() {
        d.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[1]/a")).click();
        Assert.assertTrue(d.getCurrentUrl().contains("history"));
    }

    @Test
    public void test03_openOrderSlip () {
        d.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[2]/a")).click();
        Assert.assertTrue(d.getCurrentUrl().contains("order-slip"));
    }

    @Test
    public void test04_openAddresses () {
        d.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[3]/a")).click();
        Assert.assertTrue(d.getCurrentUrl().contains("addresses"));
    }

    @Test
    public void test05_openPersonalInfo () {
        d.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[4]/a")).click();
        Assert.assertTrue(d.getCurrentUrl().contains("identity"));
    }

    @Test
    public void test06_openWishlist () {
        d.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/h4/a")).click();
        d.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")).click();
        Assert.assertTrue(d.getCurrentUrl().contains("mywishlist"));
    }
}
