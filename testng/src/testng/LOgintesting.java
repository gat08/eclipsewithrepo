package testng;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org. openqa.selenium.WebDriver;

public class LOgintesting {
@Test
public void check1(){
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	String actduration= driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
	driver.close();
	AssertJUnit.assertEquals(actduration, "Java By Kiran");
}
	@Test
	public void check2(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		 driver.findElement(By.id("email")).sendKeys("");
		 driver.findElement(By.id("password")).sendKeys("");
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		 String eid=driver.findElement(By.id("email_error")).getText();
		driver.close();
		
		AssertJUnit.assertEquals(eid, "please enter email");
	}
	@Test
	public void check3(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("");
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		 String eid=driver.findElement(By.id("password_error")).getText();
		driver.close();
		
		AssertJUnit.assertEquals(eid, "Please enter password");
	}
	@Test
	public void check4(){
		
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	// driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	// driver.findElement(By.id("password")).sendKeys("");
	 //driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	 String dboard=driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a")).getText();
	driver.close();
	
	AssertJUnit.assertEquals(dboard, "homepage");
}
	@Test
	public void check5(){
		
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
//	 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	// driver.findElement(By.id("password")).sendKeys("");
	// driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	 String selenium=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3")).getText();
	driver.close();
	
	AssertJUnit.assertEquals(selenium, "c++");
}
	@Test
	public void check6(){
		
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
	// driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	// driver.findElement(By.id("password")).sendKeys("");
	// driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	 String day=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[6]/b")).getText();
	driver.close();
	
	AssertJUnit.assertEquals(day, "Monday-Sunday");
}
	@Test
	public void check7(){
		
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/downloads.html");
	// driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	// driver.findElement(By.id("password")).sendKeys("");
	// driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	 String chromeversion=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[4]/span")).getText();
	driver.close();
	
	AssertJUnit.assertEquals(chromeversion, "98");
}
		
	@Test
	public void check8(){
		
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	// driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	// driver.findElement(By.id("password")).sendKeys("");
	// driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	 String download=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3")).getText();
	driver.close();
	
	AssertJUnit.assertEquals(download, "download software");
}
	@Test
	public void check9(){
		
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	// driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	// driver.findElement(By.id("password")).sendKeys("");
	// driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	 String login=driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).getText();
	driver.close();
	
	AssertJUnit.assertEquals(login, "signout");
}
	@Test
	public void check10(){
		
	System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
	// driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	// driver.findElement(By.id("password")).sendKeys("");
	// driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	 String number=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[5]")).getText();
	driver.close();
	
	AssertJUnit.assertEquals(number, "7066885937");
}
	@Test
	public void check11(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		String validemail=driver.findElement(By.id("email_error")).getText();
		driver.close();
		AssertJUnit.assertEquals(validemail, "should not contain special character");
	
	
	
	
	
	
	}



}
		
	


