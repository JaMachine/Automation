package homework.lesson05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class SearchTest extends Base {


    @Test
    public void search() {
        d.findElement(By.xpath("//*[@id=\"search_query_top\"]")).click();
        d.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Printed Summer Dress");
        d.findElement(By.xpath("//*[@id=\"search_query_top\"]")).submit();
        List<WebElement> list = d.findElements(By.className("product-container"));
        assertThat(3, equalTo(list.size()));
        Assert.assertThat(list.get(0).getText(), containsString("Printed Summer Dress"));
    }
}
