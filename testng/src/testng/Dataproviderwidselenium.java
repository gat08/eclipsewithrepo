package testng;


import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
 
public class Dataproviderwidselenium {
	@Test(dataProvider = "dp")

	public void f(String email, String password) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.close();
	}
	@DataProvider
	public Object[][] dp() throws Exception {
		FileInputStream fis = new FileInputStream("Book1.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet sh= wb.getSheet("Sheet1");
		int Row=sh.getRows();
		int col=sh.getColumns();
		String a[][]=new String [Row][col];
		for(int i =0;i<Row;i++){
			for(int j=0;j<col;j++){
				Cell cl=sh.getCell(j, i);
				String data= cl.getContents();
				System.out.println(cl.getContents());
				a[i][j]=data;
			}
		}
		return a;

	}
}
