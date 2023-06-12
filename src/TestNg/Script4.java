package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Script4 {

    @Test
    public void Test1()
    {
        SoftAssert s=new SoftAssert();
        Reporter.log("TEST 1 METHOD EXECUTION STARTED",true);
        String str1="HELLO";
        String str2="HI";

        s.assertEquals(str1,str2);
        Reporter.log("VERIFICATION1 IN COMPLETED",true);
        String str3="HELLO";
        s.assertEquals(str1,str3);

        Reporter.log("VERIFICATION 2 IS COMPLETED",true);
        Reporter.log("TEST 1 METHOD EXECUTION IS COMPLETE",true);
        s.assertAll();


    }
}
