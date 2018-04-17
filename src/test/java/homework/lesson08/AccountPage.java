package homework.lesson08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage {

    AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
    private WebElement bLogOut;

    @FindBy(id = "search_query_top")
    private WebElement fQuery;

    public LoginPage signOut(WebDriver driver) {

        bLogOut.click();
        return new LoginPage(driver);
    }

    public ResultsPage sendQuery(WebDriver driver, String query) {
        fQuery.click();
        fQuery.sendKeys(query);
        fQuery.submit();
        return new ResultsPage(driver);
    }


}
