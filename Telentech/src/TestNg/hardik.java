package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class hardik {
	
	
	WebDriver driver;
	@BeforeClass
	public void test() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
			}
	@AfterClass
	public void closebro() {
		driver.close();
		
	}
	@Test(priority=1)
	public void gmail() {
		
		driver.findElement(By.partialLinkText("Gma")).click();
	}
	
	@Test(priority=2)
	public void navigate() {
		
		driver.get("http://www.gcrit.com/build3/");	
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		Assert.assertEquals(URL, "http://www.gcrit.com/build3/");
		
	
	}
	
	
	
	
	
	
	
	
	 
  }

