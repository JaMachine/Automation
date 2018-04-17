package homework.lesson08;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Base {





    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,20);
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div/nav/div[1]/a")).click();
    }

    @AfterClass
    public static void tearDown() {
//        driver.close();
    }


}
