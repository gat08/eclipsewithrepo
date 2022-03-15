
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase4 {
	@Test
	public void check26(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/downloads.html");
		String person =driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[2]")).getText();
		driver.close();
		Assert.assertEquals(person, "Name");
	}
	@Test
	public void check27(){
		System.setProperty("webdriver.chrome. driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/downloads.html");
		String common = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[7]")).getText();
		driver.close();
		Assert.assertEquals(common, "similar");
	}
	@Test
	public void check28(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/downloads.html");
		String source =driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[8]")).getText();
		driver.close();
		Assert.assertEquals(source, "Official Source");
	}
	@Test
	public void check29(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/downloads.html");
		String dor =driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[3]")).getText();
		driver.close();
		Assert.assertEquals(dor, "Vendor");

	}
	@Test
	public void check30(){
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/downloads.html");
		String bit= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[5]")).getText();
		driver.close();
		Assert.assertEquals(bit, "32bit");
	}

}
