package homework.lesson09;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class JavaScriptTest extends Base {

    @Test
    public void iframeLinkText() {
        js.executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(By.className("facebook-fanbox")));

        driver.switchTo().frame(3);

        assertEquals("PrestaShop", driver.findElement(
                By.xpath("//div[2]/div[1]/a")).
                getText());
    }
}
