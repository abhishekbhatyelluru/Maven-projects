package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;


import org.testng.asserts.SoftAssert;

@SuppressWarnings("unused")
public class CocumpRoj1 {
	//WebDriver driver = new ChromeDriver();
	private static WebDriver driver = null;

		// TODO Auto-generated method stub
		
		@Given("browser is open and application is in login page")
		public void browser_is_open_and_application_is_in_login_page()
		{
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		}

		@When("user enters user name and password")
		public void user_enters_user_name_and_password() 
		{
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     //Using Xpath only....We can use,Id aslo
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();

		}

		@Then("home page is displayed")
		public void home_page_is_displayed() 
		{
			String actualresult, expectedresult;
		    expectedresult="PIM";
		    actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
		    SoftAssert soft= new SoftAssert();
			soft.assertEquals(actualresult, expectedresult);
		}
		@Then("user logged out")
		public void user_logged_out() 
		{
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			driver.findElement(By.linkText("Logout")).click();
		}
		
		


	}


