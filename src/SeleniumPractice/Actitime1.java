package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime1 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://timetracker.ctepl.com/actitime/login.do");
        WebElement un=driver.findElement(By.className("textField"));
        un.sendKeys("admin");
        un.sendKeys(Keys.CONTROL+"a");
        un.sendKeys(Keys.CONTROL+"c");
        driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
    }
}
