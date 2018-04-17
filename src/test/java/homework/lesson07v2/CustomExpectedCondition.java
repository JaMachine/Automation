package homework.lesson07v2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public class CustomExpectedCondition {

    public static ExpectedCondition<List<WebElement>> listShouldHaveSize(By locator, int expSize) {
        return new ExpectedCondition<List<WebElement>>() {
            @Override
            public List<WebElement> apply(WebDriver driver) {
                List<WebElement> list = driver.findElements(locator);
                return list.size() == expSize ? list : null;
            }
        };
    }

    public static ExpectedCondition<List<WebElement>> listNthElementHasText(By locator, int n, String expText) {
        return new ExpectedCondition<List<WebElement>>() {
            @Override
            public List<WebElement> apply(WebDriver driver) {
                List<WebElement> list = driver.findElements(locator);
                System.out.println(list.get(n).getText());
                return list.get(n).getText() == expText ? list : null;

            }
        };
    }
}