package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodoverloadingHRM {
	WebDriver driver = new ChromeDriver();
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		
		MethodoverloadingHRM obj=new MethodoverloadingHRM();
		obj.loginn();
	//  obj.search("Admin");
	//	obj.search("Admin","Paul Collings");
		obj.search("Admin",1);
	
	}
	
	void loginn()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        driver.findElement(By.xpath("//span")).click();
	}
	void search(String userName)
	{
	
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	void search(String userName,String empname)
	{
		driver.findElement(By.xpath("//div[2]/input")).click();
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empname);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	void search(String userName,int index) 
	{
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
		
		//driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).sendKeys("ESS");
		WebElement user_roll=driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		Select HRMuserol=new Select(user_roll);
		//HRMuserol.selectByVisibleText("Admin");
		HRMuserol.selectByIndex(index);
		
	}
	
		
		
}
	



