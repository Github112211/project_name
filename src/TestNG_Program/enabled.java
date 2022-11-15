package TestNG_Program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {

@Test(enabled = false)//intentionally fail test case
public void TC1() {
	Reporter.log("Running TC1",true);
}

@Test(enabled = true)
public void TC2() {
	Reporter.log("Running TC2",true);
}

}
