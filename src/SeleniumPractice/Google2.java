package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        Thread.sleep(2000);
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwijj9b0nbT_AhUZaN4KHROrCiQQPAgI");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);

    }
}
