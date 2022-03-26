package testng;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test
	public void check11(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
		String hashtag=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1])")).getText();
		driver.close();
		AssertJUnit.assertEquals(hashtag, "Number");
	}
	@Test
	public void check12(){
		System.setProperty("webdriver, chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
		String GEN= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[6]")).getText();
		driver.close();
		AssertJUnit.assertEquals(GEN, "Gender");
	}
@Test
public void check13(){
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
	String user = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/h3")).getText();
	driver.close();
	AssertJUnit.assertEquals(user, "ActiveUser");
}
@Test
public void check14(){
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
	String navigation = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[1]")).getText();
	driver.close();
	AssertJUnit.assertEquals(navigation, "Navigation Bar");
	}
@Test
public void cjheck15(){
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
	String mobile =driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[4]")).getText();
	driver.close();
	AssertJUnit.assertEquals(mobile, "MO.No.");
	
}
@Test
public void check16(){
	System.setProperty("webdriver chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
	String person= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[2]")).getText();
	driver.close();
	AssertJUnit.assertEquals(person, "Person");
}








}
