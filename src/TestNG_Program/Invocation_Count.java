package TestNG_Program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {

@Test(invocationCount = 7)
public void TC1() {
Reporter.log("Running Test case 1",true);
}
}