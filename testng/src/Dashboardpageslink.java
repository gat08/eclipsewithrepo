

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboardpageslink {
	//test for more info link
	@Test
	public void m1(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		String s= driver.getTitle();//grtting title of selenium testing pdf page
		driver.close();
		Assert.assertEquals(s, "JavaByKiran | Dashboard");

	}
}
