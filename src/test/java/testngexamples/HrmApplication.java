package testngexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HrmApplication {
	private static WebDriver driver = null;
  @Test(priority=0)
  public void login() 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     //Using Xpath only....We can use,Id aslo
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

  }
  @Test(priority=1)
  public void adminsearch() throws InterruptedException
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	    driver.findElement(By.xpath("//div[2]/input")).click();
		driver.findElement(By.xpath("//div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("abhishekk");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  @Test(priority=3)
  public void logout() throws InterruptedException
  {
	    driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	    Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
  }
  
  @Test(priority=2)
  public void leave() throws InterruptedException
  {
	       
			driver.findElement(By.linkText("Leave")).click();
		    driver.findElement(By.linkText("Apply")).click();
		    driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		   // driver.findElement(By.xpath("//*[contains(text(),'CAN')]"));
		    driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		    driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");
		    driver.findElement(By.xpath("//textarea")).sendKeys("work from home");
		    Thread.sleep(1000);
		    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	 	    Thread.sleep(1000);
  }
  
  
  

}
