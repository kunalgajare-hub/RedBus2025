package UtilityLayer;



import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleCalender extends BaseClass {
	
	public static void MonthAndYear(WebElement wb1, String value, WebElement wb2)
	{
		while(true)
		{
			String actualvalue = wb1.getText();
			
			if(actualvalue.contains(value))
			{
				break;
			}
			else
			{
				WebElementUtils.click(wb2);
			}
		}
	}
	
	public static void Date(List<WebElement> list,String value)
	{
		for(WebElement wb: list)
		{
			String actualvalue = wb.getText();
			
			if(actualvalue.contains(value))
			{
				WebElementUtils.click(wb);
				break;
			}
		}
	}

}
