package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebooksignupXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Abhishekk");  //xpath is used here for name and sirname
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Bhatt");
        driver.findElement(By.name("reg_email__")).sendKeys("abhi@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abhi@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("abc123abc");
        driver.findElement(By.name("birthday_day")).sendKeys("20");
        driver.findElement(By.name("birthday_month")).sendKeys("Mar");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
        driver.findElement(By.name("websubmit")).click();

	}

}
