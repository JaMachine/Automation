package homework.lesson09;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Base {

    static WebDriver driver;
    static JavascriptExecutor js;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}