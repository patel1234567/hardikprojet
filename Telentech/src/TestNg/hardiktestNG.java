package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class hardiktestNG {

	WebDriver driver;
	
	@Test(priority=1)
	public void openbrower() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	public void select() {
		
WebElement sele=	driver.findElement(By.xpath("//select[@name='country']"));	
		
	Select dropdown=new Select(sele);
	dropdown.selectByVisibleText("INDIA");
	
		
	}
	
	
	
	
	

	
	

}
