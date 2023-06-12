import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class Actitime01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demo.actitime.com/login.do");
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(3000);
        driver.findElement(By.name("pwd")).sendKeys("manager");
        Thread.sleep(3000);
        driver.findElement(By.id("keepLoggedInCheckBox")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("addTaskButtonId")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("dropdownButton")).click();
        Thread.sleep(500);
        driver.findElement(By.className("itemRow selected")).click();
        Thread.sleep(500);
        driver.findElement(By.className("components_checkboxContainer projectListItem checked")).click();
        driver.findElement(By.className("components_checkboxContainer projectListItem checked")).click();
        driver.findElement(By.className("components_checkboxContainer projectListItem checked")).click();






    }
}
