

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Userpage {
	WebDriver driver;
	@BeforeTest
	public void m1(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
	}
	@Test
	public void checkuser(){
		System.out.println("inside test");
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		driver.findElement(By.id("Username")).sendKeys("kiran45");
		driver.findElement(By.id("mobile")).sendKeys("9876549876");
		driver.findElement(By.id("email")).sendKeys("kiran45@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Java");
		driver.findElement(By.id("Female")).click();
		//Drop down list element select here using select class and its methods....
		Select ss = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
		ss.selectByIndex(1);
		List<WebElement> e =ss.getOptions();
		for(WebElement options : e){
			System.out.println(options.getText());
		}
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[7]/div/input")).sendKeys("456732");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("9876546786");
		driver.findElement(By.id("submit")).click();//click submit button
		driver.switchTo().alert().accept();// alert handling
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).getText();

	}
}