package testclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/");
			
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			//Mouse Hover
			/*act.moveToElement(driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"))).build().perform();
			System.out.println("Mouse mover action ");
			Thread.sleep(3000);

			//Right Click
			
			act.moveToElement(driver.findElement(By.xpath("//a[@href=\"/minitv?ref_=nav_avod_desktop_topnav\"]"))).contextClick().build().perform();
			Thread.sleep(3000);
			System.out.println("Right click-action ");*/

			//Double Click
			
			act.moveToElement(driver.findElement(By.xpath(	"//i[contains(@class,\"wewidgeticon we_close\")]"))).doubleClick().build().perform();
			
			System.out.println("double click Action ");

			Thread.sleep(3000);

			//Use of Shift to send keys in upper case

		/*	act.moveToElement(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.SHIFT).sendKeys("Redmi").build().perform();
			System.out.println("Use of Shift to send keys in upper case");*/
		Thread.sleep(3000);

			driver.close();
		}

	}

	


