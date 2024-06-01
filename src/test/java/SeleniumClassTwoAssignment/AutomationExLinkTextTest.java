package SeleniumClassTwoAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationExLinkTextTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.partialLinkText("got log")).click();
        Thread.sleep(2000);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.quit();

    }
}