package TestNG_Program;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {
@Test
public void TC1() {
	Reporter.log("Running Test Case 1",true);
}
@Test
public void TC2() {
	Reporter.log("Running Test Case 2",true);
}
@Test
public void TC3() {
	Reporter.log("Running Tesst Case 3",true);
    Assert.fail(); //used fail test case intentionally
}

}
