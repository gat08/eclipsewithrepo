package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestngAnnotationDemo {
  @Test
  public void test01() {
	  System.out.println("I'm in testcase 01");
	  AssertJUnit.assertTrue(true);
	  
  }
  @Test
  public void test02() {
	  System.out.println("I'm in testcase 02 ");
	  AssertJUnit.assertEquals(true, true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I'm in beforeMethod ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I'm in afterMethod ");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I'm in beforeClass ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I'm in afterClass ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
		
	  System.out.println("I'm in beforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I'm in afterTest ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I'm in beforeSuite ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I'm in afterSuite ");
  }

}
