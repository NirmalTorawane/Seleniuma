package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {

    @Test
    void setup(){
        Reporter.log("METHOD EXECUTED",true);
    }



}
