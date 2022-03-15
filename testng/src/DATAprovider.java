

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DATAprovider {
	@Test(dataProvider = "dp")
	public void f( String ename,String password) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(ename);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.close();

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "kiran@gmail.com", "123456" },
			new Object[] { "shitalzod96@gamil.com", "234566" },

		};
	}
}
