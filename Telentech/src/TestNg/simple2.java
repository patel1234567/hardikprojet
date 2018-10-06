package TestNg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class simple2 {
	
	WebDriver driver;
@Test  (dataProvider="hardik")
public void Excelfile(String uname,String pwd) {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.gcrit.com/build3/login.php");
	driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys(uname);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	
}
	@AfterMethod
	public void close() {
		driver.close();
		
	}
	@DataProvider(name="hardik")
	public Object [] [] realExcel () throws BiffException, IOException {

	File file = new File("C:/Users/Hardik/Desktop/Inputdata.xls");
	
	Workbook book=Workbook.getWorkbook(file);
	
Sheet sc=	book.getSheet("Sheet1");

int row=sc.getRows();

int columns=sc.getColumns();

System.out.println(row +","+columns);
	
String [] [] inputdata = new String [row][columns];

for(int i=1;i<row;i++) {
	
	for (int j=0;j<columns;j++) {
		
Cell value=sc.getCell(j,i);



inputdata[i][j]=value.getContents();

	}
}
return inputdata;

	
	}	
	}
	

