package testng;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboard1 {
@Test
public void checkcoursesListedonDashboard(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	ArrayList<String> alexp= new ArrayList<>();
	alexp.add("Selenium");
	alexp.add("Java / J2EE");
	alexp.add("Python");
	alexp.add("Php");
	//by checking pdf of selenium-python J2ee-php_pdf available and add into _arraylist
	//for check selenium pdf
	ArrayList<String> alact = new ArrayList<>();
	String act1 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3")).getText();
	String act2 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3")).getText();
	String act3 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3")).getText();
	String act4 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3")).getText();
	alexp.add(act1);
	alexp.add(act2);
	alexp.add(act3);
	alexp.add(act4);
	AssertJUnit.assertEquals(alact, alexp);
	driver.close();		
}

	

}
