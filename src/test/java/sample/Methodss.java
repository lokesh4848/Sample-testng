package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Methodss {
  @Test
  public void login() {
	  System.out.println("this is login");
  }
  @Test
  public void reg() {
	  System.out.println("this is reg");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is beforeclass");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

}
