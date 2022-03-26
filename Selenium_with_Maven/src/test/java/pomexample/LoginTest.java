package pomexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver logintestdriver = null;

	@Test
	public void Logintest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		logintestdriver = new ChromeDriver();
		logintestdriver.get(
				"file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		Loginpage lp = new Loginpage(logintestdriver);// getting driver of test class
		lp.loginmethod("kiran@gmail.com", "123456");
		Assert.assertEquals(logintestdriver.getTitle(), "JavaByKiran | Dashboard");
		logintestdriver.close();
	}

	public class Dashboardtest {
		WebDriver testdriver;

		@Test
		public void m1() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			testdriver = new ChromeDriver();
			testdriver.get(
					"file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
			Dashboard dp = new Dashboard(testdriver);
			boolean value = dp.verifyHeader();
		
			Assert.assertEquals(value, true);
			testdriver.close();
		}
	}
}
