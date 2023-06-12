import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://maps.google.com/");
        Thread.sleep(4000);
        driver.findElement(By.id("searchboxinput")).sendKeys("pune");
        Thread.sleep(4000);
        driver.findElement(By.id("searchbox-searchbutton")).click();
        Thread.sleep(4000);

    }
}
