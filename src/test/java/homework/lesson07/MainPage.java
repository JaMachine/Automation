package homework.lesson07;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class MainPage extends Base{

    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
    private WebElement fQuery;

    @FindBy(xpath = "//*[@id='index']/div[2]/ul/li")
                     //*[@id="index"]/div[3]/ul/li[3]
    private WebElement advice;


    MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterQ () {
        fQuery.click();
        fQuery.sendKeys("Dress");
    }

//    public void consoleCounter () throws InterruptedException {
//        Thread.sleep(200);
//        System.out.println(advice.size());
//        System.out.println(advice.get(2).getText());
//    }
}
