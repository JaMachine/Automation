package homework.lesson08;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Base {


    static WebDriver driver;
    static WebDriverWait wait;

    static {
        if (System.getProperty("report.path") == null) {
            Date dateNow = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
            System.setProperty("report.path", "./reports/IDE-test-build-" + format.format(dateNow));
        }
    }

    public static String timestamp() {

        String ts = new Timestamp(System.currentTimeMillis()).toString();

        String formated = ts.substring(5, 7) + "/"
                + ts.substring(8, 10) + "/"
                + ts.substring(0, 4);

        return formated;
    }

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div/nav/div[1]/a")).click();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }



}
