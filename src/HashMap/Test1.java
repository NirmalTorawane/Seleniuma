package HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {

        HashMap<String,String> ref=new HashMap<>();
        ref.put("url", "https://www.facebook.com/");
        ref.put("email id","admin@gmail.com");
        ref.put("pwd","admin123");


        //Selenium Code
        WebDriver driver=new FirefoxDriver();
        driver.get(ref.get("https://www.facebook.com/"));
        driver.findElement(By.id("email")).sendKeys(ref.get("email id"));
        driver.findElement(By.id("pass")).sendKeys(ref.get("pwd"));
    }
}
