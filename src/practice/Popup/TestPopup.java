package practice.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.abhibus.com");
        Thread.sleep(3000);
        driver.findElement(By.className("Bz112c Bz112c-r9oPif")).click();

        driver.findElement(By.id("AccLogin")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("mobileNo")).sendKeys("7020391267");



    }
}
