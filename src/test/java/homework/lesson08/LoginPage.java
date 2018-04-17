package homework.lesson08;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private String log = "e2341745@nwytg.com";
    private String pas = "qwerty";


    LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement fLog;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    private WebElement fPas;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    private WebElement bLog;


    public AccountPage logIn(String username, String password, WebDriver driver) {
        enterUsername(username);
        enterPassword(password);
        clickSignInBtn(driver);
        return new AccountPage(driver);
    }

    public AccountPage logIn(WebDriver driver){
        enterUsername(log).enterPassword(pas).clickSignInBtn(driver);
        return new AccountPage(driver);
    }

    public LoginPage enterUsername(String username) {
        fLog.click();
        fLog.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        fPas.click();
        fPas.sendKeys(password);
        return this;
    }

    public AccountPage clickSignInBtn(WebDriver driver) {
        bLog.click();
        return new AccountPage(driver);
    }


}
