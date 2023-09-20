package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
  @Test(priority=1,groups={"smoke"})
  public void a() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lokesh.K\\OneDrive\\Documents\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
	//	co.setBinary("C:\\Users\\Lokesh.K\\OneDrive\\Documents\\Automation\\chrome-win64\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
  }
  @Test(priority=2,groups={"smoke"})
  public void k()
  {
	  System.out.println(driver.getPageSource());
  }
  @Test(priority=4,groups={"smoke"})
  public void t()
  {
	  System.out.println(driver.getCurrentUrl());
  }
  @Test(priority=3,groups={"smoke"})
  public void b()
  {
	  System.out.println(driver.getTitle());
  }
}
