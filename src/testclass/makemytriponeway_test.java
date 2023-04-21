package testclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common_methods.dropdownselectbyclick;
import common_methods.dropdownselectbyselect;
import common_methods.getdata_ExpDates;
//import common_methods.selectmethods;
import requestrepository.reqpara;

public class makemytriponeway_test {
	

	public static void dropdownselect()throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		//System.setProperty("webdriver.msedge.driver","C:\\msedgedriver.exe"); // Setting system properties
	    //WebDriver  driver1=new ChromeDriver();  	
				//WebDriver driver = new EdgeDriver(); 
		//create an object of chrome driver
	    WebDriver driver = new ChromeDriver();
		
		//launch application
		
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize(); 
		
	    Thread.sleep(3000);

		try {
			
			//WebElement popupclose =driver.findElement(By.xpath("//a[@class=\"close\"]"));
			//WebElement popupclose =driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]/i"));
            WebElement popupclose =driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]"));

			if (popupclose.isDisplayed())
				
			{
				popupclose.click();
			}
								
		} catch(NoSuchElementException e) {
		
		System.out.println("No popupdisplayed");
		}
		
		
		/*WebElement fromobject =driver.findElement(By.xpath(reqpara.fromobjectxpath1()));
		
		
		fromobject.sendKeys("Pune");
		List<WebElement> dropdownvalues = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
		//i[@class="wewidgeticon we_close"]*/
		
		Thread.sleep(2000);
	driver.quit();
	}
		
		
	
}