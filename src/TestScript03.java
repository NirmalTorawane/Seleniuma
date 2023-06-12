import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com\n");
        Thread.sleep(3000);
        driver.findElement(new By.ByLinkText("Create New Account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Nirmal");
        Thread.sleep(3000);
        driver.findElement(By.name("lastname")).sendKeys("Torawane");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys("7020391267");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ninu@12345");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_day")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("month")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_year")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("u_2_5_SU"));









    }
}
