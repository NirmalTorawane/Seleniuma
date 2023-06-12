package SeleniumPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("://www.googhttpsle.com/");
        Thread.sleep(2000);

        Dimension d=new Dimension(300,400);
        driver.manage().window().setSize(d);
        Thread.sleep(3000);
        Point p=new Point(450,350);
        driver.manage().window().setPosition(p);
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        int browserheight=driver.manage().window().getSize().getHeight();
        System.out.println("BROWSER HEIGHT IS"+browserheight);
        int browserwidth=driver.manage().window().getSize().getWidth();
        System.out.println("BROWSER WIDTH IS"+browserwidth);
        //get browser position
        int browserXloc=driver.manage().window().getPosition().getX();
        System.out.println(browserXloc);
        int browserYloc=driver.manage().window().getPosition().getY();
        System.out.println(browserYloc);
        driver.close();

    }
}
