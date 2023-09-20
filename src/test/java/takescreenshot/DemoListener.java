package takescreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(takescreenshot.ListenerTest.class)
public class DemoListener {

      static WebDriver driver;

      @BeforeTest
      public void openBrowser() {

    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lokesh.K\\OneDrive\\Documents\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			 driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      }

      @Test
      public void OpenSite() {

    	  driver.get("https://www.myntra.com/");

      }

      @Test
      public void clickOnAdvanceJavaLink() {

    	 
	    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/input")).sendKeys("Nike");
	    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/a")).click();

      }

      @Test
      public void testToFail() {

            //System.out.println("This method is test to fail");
            //String pageSource = driver.getPageSource();
            Assert.assertEquals("Niki - Shop for Nike Apparels Online in India | Myntra", driver.getTitle()); // Forcefully we will fail this  
    	//  Assert.assertEquals("Amazon.in : hippo", driver.getTitle()); // Forcefully we will fail this
      }

}