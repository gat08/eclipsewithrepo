package testng;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TESTcase2 {
	@Test
	public void check16(){
		System.setProperty("webdriver chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
		String person= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[2]")).getText();
		driver.close();
		AssertJUnit.assertEquals(person, "Person");
	}
	@Test
	public void check17(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
		String to = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[3]")).getText();
		driver.close();
		AssertJUnit.assertEquals(to, "for");
	}
	@Test
	public void check18(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
		String contact= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[5]")).getText();
		driver.close();
		AssertJUnit.assertEquals(contact, "Contact No.");
	}
	@Test
	public void check19(){
		System.setProperty("webdriver, chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
		String time =driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[6]")).getText();
		driver.close();
		AssertJUnit.assertEquals(time, "Duration");
	}
	@Test
	public void check20(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
		String way = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[4]")).getText();
		driver.close();
		AssertJUnit.assertEquals(way, "Prefered Way to Connect");
	}







}
