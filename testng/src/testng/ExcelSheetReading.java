package testng;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class ExcelSheetReading {
  @Test(dataProvider = "excelread")
  public void m1(String email, String pass) {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/MayT/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	  driver.findElement(By.id("email")).sendKeys(email);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button")).click();
	  driver.close();
  }

  @DataProvider
  public Object[][] excelread() throws Exception, IOException {
	  FileInputStream fis=new FileInputStream("Book1.xls");
	  Workbook wb=Workbook.getWorkbook(fis);
	  Sheet sh= wb.getSheet("Sheet1");
	  int rows=sh.getRows();
	  int col=sh.getColumns();
	  String a[][]=new String[rows][col];
	  for(int i=0;i<rows;i++) {
		 for(int j=0;j<col;j++) {
		Cell cl=sh.getCell(j,i);
		String data=cl.getContents();
		a[i][j]=data;
		  }
	  }
	return a;
  }
}
