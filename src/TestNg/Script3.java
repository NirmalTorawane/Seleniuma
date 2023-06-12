package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Script3 {
    @Parameters({"un","pwd"})
    @Test
    public void Test1(String un,String pwd)
    {
        Reporter.log(un,true);
        Reporter.log(pwd,true);


    }
}
