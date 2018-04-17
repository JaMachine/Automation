package homework.lesson07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class myWaits {

    public static ExpectedCondition<Boolean> elementContainsText (WebElement element,String text){
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver input) {

                try {
                    return element.getText().equals(text);
                } catch (Exception e) {
                    return false;
                }
            }
        };
    }
}
