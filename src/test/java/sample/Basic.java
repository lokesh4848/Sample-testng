package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Basic {
  @Test
  public void f() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lokesh.K\\OneDrive\\Documents\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
	//	co.setBinary("C:\\Users\\Lokesh.K\\OneDrive\\Documents\\Automation\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
  }
}
