package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiBrowsing {
	@Test
	public void TC1() {
	System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\DOWNLOAD\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	}

}
