package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        WebElement un = driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
        un.sendKeys("fgtvgftgt");


    }
}
