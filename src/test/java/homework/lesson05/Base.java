package homework.lesson05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {

    static WebDriver d;

    @BeforeClass
    public static void setUp() {
        d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        d.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        d.get("http://automationpractice.com/index.php");
        d.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        d.close();
    }


}

