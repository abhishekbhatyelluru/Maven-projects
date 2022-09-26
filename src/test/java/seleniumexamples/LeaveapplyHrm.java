package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaveapplyHrm {
	WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		LeaveapplyHrm obj=new LeaveapplyHrm();
		obj.login();
		obj.leave();
		

	}
	void login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
       
       // driver.findElement(By.xpath("//span")).click();
	}
	void leave()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leave")).click();
	    driver.findElement(By.linkText("Apply")).click();
	    driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
	   // driver.findElement(By.xpath("//*[contains(text(),'CAN')]"));
	    driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");
	    driver.findElement(By.xpath("//textarea")).sendKeys("work from home");
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}

}
