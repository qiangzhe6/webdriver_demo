package automator.day6;

import autoframework.driver.driver.SeleniumDrivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2016/11/15.
 */
public class BaiduScreenShot {
    WebDriver driver;
    @BeforeTest
    public void openChrome(){
        driver=SeleniumDrivers.openBrower("chrome");
        driver.get("http:www.baidu.com");

    }
    @Test
    public void testA(){
        String a1="Abcd";
       // MyAssert.assertStartWith(a1,"1234");
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
