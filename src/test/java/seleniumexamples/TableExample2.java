package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
		String printnamee=driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();  //The text in the table extracted and stored in variable
		System.out.println("Name is " +printnamee);
		String country=driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText();
		System.out.println("Country is " +country);
		String contact=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		System.out.println("Contact is " +contact);
	

	}

}
