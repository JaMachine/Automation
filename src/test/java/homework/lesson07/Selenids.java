package homework.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenids extends Base {

    static WebElement $(String xp) {
        return driver.findElement(By.xpath(xp));
    }

}
