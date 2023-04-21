package common_methods;

import java.util.ArrayList;
import java.util.List;

import org.apache.groovy.json.internal.Dates;
import org.openqa.selenium.WebElement;

public class selectAnydates {
public static void anydate(List<WebElement> sel_anydate, List<WebElement> datestext, int count, ArrayList<String> data2)

{

	for (int i=0 ; i<count ; i++)
	{
		
		String exp_datevalue=data2.get(5);
	   String datesvalue = datestext.get(i).getText();
       System.out.println(datesvalue);
	   if(datesvalue.equals(exp_datevalue))
	    {
		   sel_anydate.get(i).click();
	      System.out.println("Expected date found   "+sel_anydate.get(i).getText()+"  " );
	       break;
	    }
	   else
	    {
System.out.println("expected date not found hence retrying   "  + i + " " );	    }

	}	

}}


//table[@class="ui-datepicker-calendar"]/tbody/tr[4]/td


//List<WebElement> Date_text = driver.findElements(By.xpath("//span[text()=\"April\"]/../../../table/tbody/tr/td[@data-handler=\"selectDay\" and @data-month=\"3\"]"));


//List<WebElement> Dates = driver.findElements(By.xpath("//span[text()=\"April\"]/../../../table/tbody/tr/td[@data-handler=\"selectDay\" and @data-month=\"3\"]"));
