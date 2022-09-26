package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotpasswordHrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		String url = driver.getCurrentUrl();  
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		//If U change the link and try...Then it shows not matching on console

		
	}

}
