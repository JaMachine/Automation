package homework.lesson07;

import org.junit.Test;


public class SuperSimpleTests extends Base {

    MainPage mp = new MainPage(driver);

    @Test
    public void test01_elementContainsText() throws InterruptedException {

        mp.enterQ();
//        mp.consoleCounter();

    }
}
