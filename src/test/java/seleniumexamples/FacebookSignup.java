package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
       
		
		driver.findElement(By.name("firstname")).sendKeys("Abhishekk");
        driver.findElement(By.name("lastname")).sendKeys("Bhatt");
        driver.findElement(By.name("reg_email__")).sendKeys("abhi@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abhi@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("abc123abc");
      //  driver.findElement(By.name("birthday_day")).sendKeys("20");
      //  driver.findElement(By.name("birthday_month")).sendKeys("Mar");
     //   driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.id("day")).sendKeys("20");                      //Id or Name..anything we can use
        driver.findElement(By.id("month")).sendKeys("Mar");
        
  /*     WebElement dayyy=driver.findElement(By.id("day"));
       Select selecttt=new Select(dayyy);
       selecttt.selectByVisibleText("25");          //Drop down function
      // selecttt.selectByIndex(24);          */
        
        driver.findElement(By.id("year")).sendKeys("2000");
        
       // driver.findElement(By.name("sex")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
       driver.findElement(By.name("websubmit")).click();
	}

}
