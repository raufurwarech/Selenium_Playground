package SeleniumClassThree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().window().maximize();

        WebDriver.Navigation navigate= driver.navigate();
        navigate.to("https://www.google.com/");
        Thread.sleep(2000);

        navigate.back();
        Thread.sleep(2000);

        navigate.forward();
        Thread.sleep(2000);

        navigate.refresh();
        Thread.sleep(2000);

        // driver.navigate().refresh();     // refresh current page sub interface of webdriver

        driver.quit();
    }
}
