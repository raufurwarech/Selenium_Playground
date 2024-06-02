package SeleniumClassFourAssginmnet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        String parentPage = driver.getWindowHandle();
        System.out.println("Main Window ; " + driver.findElement(By.className("text-center")).getText());
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/sample");
        System.out.println("Inside Child : " + driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().window(parentPage);
        Thread.sleep(2000);

        // second time on parent page
        System.out.println("second time parent window : " + driver.findElement(By.className("text-center")).getText());

        //Again redirect to child Tab
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://demoqa.com/sample");
        System.out.println("Inside Child : " + driver.findElement(By.id("sampleHeading")).getText());
        driver.close();

        driver.switchTo().window(parentPage);
        Thread.sleep(3000);


        driver.quit();

    }
}
