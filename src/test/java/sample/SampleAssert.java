package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleAssert {
	WebDriver driver;
	  @BeforeClass(groups={"regression"})
	   public void openBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lokesh.K\\OneDrive\\Documents\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			 driver=new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	   }
	  /*
	   * assert-Hard assert
	   * soft assert
	   */
  @Test(groups={"regression"})
  public void login() throws InterruptedException {
	  driver.get("https://www.demoblaze.com/index.html");
	  driver.findElement(By.id("login2")).click();
	  driver.findElement(By.id("loginusername")).sendKeys("saideva");
	  driver.findElement(By.id("loginpassword")).sendKeys("saideva");
	  driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
	  Thread.sleep(3000);
	  String except_result=driver.findElement(By.id("nameofuser")).getText();
/*	if( except_result.contains("Welcome saideva"))
	{
		System.out.println("testcaes pass");
	}
	else
	{
		System.out.println("testcaes fail");
	}
	*/
	//  Assert.assertEquals(except_result, "Welcome hema");
	  SoftAssert s=new SoftAssert();
	 s.assertEquals(except_result, "Welcome saideva");
	  System.out.println("hello lokesh");
	  driver.close();
	  s.assertAll();
	  
  }
}
