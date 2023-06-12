package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script2 {
    @Test(invocationCount = 12)
    public void Test1()
    {
        Reporter.log("TEST1 METHOD EXECUTED",true);
    }
    @Test(dependsOnMethods = "Test1",invocationCount = 10)
    public void Test2()
    {
        Reporter.log("TEST2 METHOD EXECUTED",true);
    }
}
