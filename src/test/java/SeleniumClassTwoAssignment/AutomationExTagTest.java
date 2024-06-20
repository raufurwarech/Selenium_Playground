package SeleniumClassTwoAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.List;

public class AutomationExTagTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        List<WebElement> WebElements = driver.findElements(By.tagName("a"));
        System.out.println("Count : " + WebElements.size());
        for (WebElement element : WebElements){
            System.out.println(element.getText() + " " + element.getAttribute("href"));
        }

        driver.quit();

    }

}