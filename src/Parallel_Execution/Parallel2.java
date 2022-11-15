package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void tc2() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\DOWNLOAD\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://twitter.com/home");
	}

}
