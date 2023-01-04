package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		
		String BefoureXpath_Company="//*[@id='customers']/tbody/tr[";
        String AfterXpath_Company="]/td[1]";
        
        String BefoureXpath_Contact="//*[@id='customers']/tbody/tr[";
        String Afterxpath_Contact="]/td[2]"; 
       // Xls_Reader reader=new Xls_Reader("C:\\Users\\ajyot\\eclipse-workspace1\\SeleniumAutomation\\Excel\\Data.xlsx");
        		
       List<WebElement>row= driver.findElements(By.xpath("//table[@id='customers']//tr"));
       System.out.println("row count is:" +(row.size()-1));
       int rowcount=(row.size()-1);
        
        for(int i=2;i<=rowcount;i++) {
        	String actualxpath=BefoureXpath_Company+i+AfterXpath_Company;
        String CompanyName=	driver.findElement(By.xpath(actualxpath)).getText();
        System.out.println(CompanyName);
      
        }
        
        for(int i=2;i<=7;i++) {
        	String ActualXpath2=BefoureXpath_Contact+i+Afterxpath_Contact;
        	String ContactName=driver.findElement(By.xpath(ActualXpath2)).getText();
        	System.out.println(ContactName);
        }
        
	}

}
