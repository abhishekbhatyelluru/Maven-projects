package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadexcellFacebooklogin {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		String filePath="//C:\\Dlithe Training\\Doc";
		String fileName="Test data for automation.xlsx";
		String sheetName="Sheet1";
		
		File filee=new File(filePath+"\\"+fileName);
		FileInputStream inputstreamm=new FileInputStream(filee); 
		Workbook workbookk=null;
		
	//	String fileextensiontype=fileName.substring(fileName.indexOf("."));  We already know it is a .xlsx type...so not required this line
		
		workbookk=new XSSFWorkbook(inputstreamm); // We know it is a .XLSX file...So directly use this
		
		Sheet sheett=workbookk.getSheet(sheetName);
		
		int rowcount=sheett.getLastRowNum()-sheett.getFirstRowNum();
		System.out.println("Number of Rows= "+rowcount);
		
		Row roww=sheett.getRow(1);  //change the row number acccordingly
		String password,username;
		username=roww.getCell(0).getStringCellValue();
		password=roww.getCell(1).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		//driver.findElement(By.xpath("//button[@value='1']")).click();
		
	
	}
	
	
}
