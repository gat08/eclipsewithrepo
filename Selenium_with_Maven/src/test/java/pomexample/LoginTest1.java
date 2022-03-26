package pomexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest1 {
	WebDriver logtestdriver=null;
@Test
public void loginTest() {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	logtestdriver = new ChromeDriver();
	logtestdriver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");	
	Loginpage lp = new Loginpage(logtestdriver);

	Dashboard dp = lp.validlogin();//dynamic binding

	UserPage up = dp.userbutton();
	logtestdriver.close();
	
}
}





/*public WebElement getUsername() { // return type is WebElemnt here
	return loginpagedriver.findElement(By.id("email"));

}

 * public WebElement getPassword() { return
 * loginpagedriver.findElement(By.id("password")); }
 * 
 * public WebElement getLoginBtn() { return
 * loginpagedriver.findElement(By.xpath("//button")); }
 */
