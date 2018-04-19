package homework.lesson08;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private static final Logger LOG = LogManager.getLogger(LoginPage.class);
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

        enterUsername(username,driver);
        enterPassword(password,driver);
        clickSignInBtn(driver);

        LOG.debug("return new AccountPage");
        return new AccountPage(driver);
    }

    public AccountPage logIn(WebDriver driver) {

        enterUsername(log,driver).enterPassword(pas,driver).clickSignInBtn(driver);

        LOG.debug("return new AccountPage");
        return new AccountPage(driver);
    }

    public LoginPage enterUsername(String username, WebDriver driver) {
        LOG.info("Enter Username");

        fLog.click();
        fLog.sendKeys(username);


        LOG.debug("return LoginPage");
        return this;
    }

    public LoginPage enterPassword(String password, WebDriver driver) {
        LOG.debug("Enter Password");

        fPas.click();
        fPas.sendKeys(password);

        LOG.debug("return LoginPage");
        return this;
    }

    public LoginPage clickSignInBtn(WebDriver driver) {
        LOG.debug("Submit");

        bLog.click();

        LOG.debug("return LoginPage");
        return this;
    }


}
