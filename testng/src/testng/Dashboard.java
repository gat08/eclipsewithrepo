package testng;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboard {
	@Test
	public void  check5(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
		ArrayList<WebElement> web= new ArrayList<>();
		web.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a")));
		web.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")));
		web.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a")));
		web.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a")));
		web.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a")));
		web.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a/span")));
		System.out.println(web.size());
		for(WebElement i:web){
			System.out.println(i.getText());
			
		}
AssertJUnit.assertEquals(web.size(),6);
driver.close();
	}
}
