package SeleniumClassThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebInfoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        System.out.println("Tag name:" +driver.findElement(By.id("user-name")).getTagName());
        System.out.println("X, Y Name: "+ driver.findElement(By.id("user-name")).getRect().x + " "+ driver.findElement(By.id("user-name")).getRect().y);

        WebElement element = driver.findElement(By.id("login-button"));
        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("font-size"));
        System.out.println(element.getAttribute("class"));

        Thread.sleep(2000);
        driver.quit();

    }
}
