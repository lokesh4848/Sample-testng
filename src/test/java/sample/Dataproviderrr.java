package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderrr {
	WebDriver driver;
	  @BeforeClass
   public void openBrowser() {

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lokesh.K\\OneDrive\\Documents\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			 driver=new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   }
	 @DataProvider
	  public Object[][] saideva() {
	    return new Object[][] {{ "puma", "Buy Orignal Puma products in India | Myntra" },{"nike","Nike - Shop for Nike Apparels Online in India | Myntra"},{"Woodland","Woodland - Buy from Woodland Online Store in India | Myntra"}};
	    }
	 
	    @Test(dataProvider = "saideva")
	    public void search(String value,String expected)
	    {
	    	driver.get("https://www.myntra.com/");
	    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/input")).sendKeys(value);
	    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/a")).click();
	    	//Assert.assertEquals(driver.getTitle(), expected);
	    	SoftAssert s= new SoftAssert();
	    	s.assertEquals(driver.getTitle(), expected);
	    	
	    	System.out.println("hello team");
	    	s.assertAll();

	    }  
	    /*
	    @Test
	    @Parameters({"product"})
	    public void sample(String vaue)
	    {
	    	driver.get("https://www.myntra.com/");
	    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/input")).sendKeys(vaue);
	    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/a")).click();
	    
	    }*/
	   
}
