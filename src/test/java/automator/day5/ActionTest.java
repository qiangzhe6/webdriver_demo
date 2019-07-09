package automator.day5;

import autoframework.driver.action.Action;
import autoframework.driver.driver.SeleniumDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static autoframework.driver.driver.SeleniumDrivers.driver;

/**
 * Created by lenovo on 2016/11/8.
 */
public class ActionTest {
    WebDriver driver;
    @Test
    public void actionTest() throws InterruptedException {
        driver= SeleniumDrivers.openBrower("firefox");
        driver.get("https://www.baidu.com");
        Action.sendkey(By.id("kw"),"selenium test");
        Action.click(By.id("su"),"你点击了百度一下");
        Thread.sleep(3000);
        SeleniumDrivers.closed();
    }

}
