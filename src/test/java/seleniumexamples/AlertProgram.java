package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
	
		
	//	driver.findElement(By.name("fldLoginUserId")).sendKeys("admin123");
		
   // 	driver.findElement(By.xpath("//a[@class=\"btn btn-primary login-btn\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		Alert hdfcpage=driver.switchTo().alert();
		hdfcpage.accept();
	  //HdfcAlert.dismiss();
		
		
		
	/*	driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  driver.switchTo().frame("login_page");
		  driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		  Alert HdfcAlert=driver.switchTo().alert();
		  String actualResult=HdfcAlert.getText();
		  Thread.sleep(1000);
		  HdfcAlert.accept();
		
		  driver.switchTo().defaultContent();// This method will take back to main window mean comes out of the login frame.
		  System.out.println(actualResult);
		  String expectedResult="Customer ID  cannot be left blank1.";
		 // Assert.assertEquals(actualResult,expectedResult);
		  Assert.assertEquals(actualResult,expectedResult,"actual result and expected results are not matching");
		 // SoftAssert softAssert = new SoftAssert();
		  //softAssert.assertEquals(actualResult, expectedResult);
		  //System.out.println("After assertion");
	} */
		  

	}

}
