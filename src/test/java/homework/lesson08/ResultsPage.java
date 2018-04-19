package homework.lesson08;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static homework.lesson08.Base.wait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class ResultsPage {


    private static final Logger LOG = LogManager.getLogger(ResultsPage.class);

    ResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "product-container")
    private List<WebElement> results;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span")
    private WebElement bAddToChart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    private WebElement bConfirm;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    private WebElement bMoreConfirm;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    private WebElement bMoreConfirm3;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    private WebElement bMoreConfirm2;

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    private WebElement chConfirm;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    private WebElement bCheckout;

    @FindBy(xpath = "//A[@class='bankwire']")
    private WebElement bPay;


    public AccountPage orderProduct(WebDriver d) {

        for (WebElement e : results) {
            try {

                if (e.getText().contains("$26.00")) {
                    e.click();
                    bAddToChart.click();
                    wait.until(elementToBeClickable(bConfirm));
                    bConfirm.click();
                    wait.until(elementToBeClickable(bMoreConfirm));
                    bMoreConfirm.click();
                    wait.until(elementToBeClickable(bMoreConfirm2));
                    bMoreConfirm2.click();
                    wait.until(elementToBeClickable(bCheckout));
                    chConfirm.click();
                    bCheckout.click();
                    wait.until(elementToBeClickable(bPay));
                    bPay.click();
                    wait.until(elementToBeClickable(bMoreConfirm3));
                    bMoreConfirm3.click();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        LOG.debug("return new AccountPage");
        return new AccountPage(d);
    }

}
