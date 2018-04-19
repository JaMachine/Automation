package homework.lesson08;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage {
    private static final Logger LOG = LogManager.getLogger(AccountPage.class);

    AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "search_query_top")
    private WebElement fQuery;


    public ResultsPage sendQuery(WebDriver driver) {
        LOG.info("Sending request");

        fQuery.click();
        fQuery.sendKeys("dress");
        fQuery.submit();

        LOG.debug("return new ResultsPage");
        return new ResultsPage(driver);
    }

    public AccountPage visitHistory(WebDriver d) {
        LOG.info("Open History page");

        d.get("http://automationpractice.com/index.php?controller=history");

        d.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a"))
                .click();

        LOG.debug("return AccountPage");
        return this;
    }


}
