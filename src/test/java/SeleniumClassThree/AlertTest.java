package SeleniumClassThree;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        // accept alert
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        // dismiss alert
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().dismiss();

        //input in alert
        driver.findElement(By.id("promtButton")).click();
        Alert alert = driver.switchTo().alert();

        alert.sendKeys("warech");
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();   //alert.dismiss()


    }
}
