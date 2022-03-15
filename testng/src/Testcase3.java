

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3 {
@Test
public void check21(){
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/links.html");
	String srno = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1]")).getText();
	driver.close();
	Assert.assertEquals(srno, "Sr");
}
@Test
public void check22(){
	System.setProperty("webdriver,chrome,driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/links.html");
	String content = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[2]")).getText();
	driver.close();
	Assert.assertEquals(content, "CONTENT");
}
@Test
public void check23(){
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/links.html");
	String click = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[3]")).getText();
	driver.close();
	Assert.assertEquals(click, "click");
}
@Test
public void vcheck24(){
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/links.html");
	String links=driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
	driver.close();
	Assert.assertEquals(links, "Useful Links");
}
@Test
public void check25(){
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/links.html");
	String out = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).getText();
	driver.close();
	Assert.assertEquals(out, "Logout");
}

}
