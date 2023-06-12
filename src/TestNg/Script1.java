package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1 {

    @Test(priority = 1)
    public void CreateAccount()
    {
        Reporter.log("CREATE ACCOUNT METHOD EXECUTED",true);
    }
    @Test(priority =2 )
    public void EditAccount()
    {
        Reporter.log("EDIT ACCOUNT METHOD EXECUTED",true);
    }
    @Test(priority = 3)
    public void DeleteAccount()
    {
        Reporter.log("DELETE ACCOUNT METHOD EXECUTED",true);
    }
}
