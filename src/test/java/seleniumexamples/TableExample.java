package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Dlithe Training\\Doc\\WebTable.html");
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input")).click();
		

	}

}
