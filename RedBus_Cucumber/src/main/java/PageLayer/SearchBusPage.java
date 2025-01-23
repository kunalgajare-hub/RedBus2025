package PageLayer;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleCalender;
import UtilityLayer.WebElementUtils;

public class SearchBusPage extends BaseClass {
	
	Actions act = new Actions(driver);
	
	@FindBy(id = "src")
	WebElement FromCity;
	
	@FindBy(id = "dest")
	WebElement ToCity;
	
	@FindBy(id = "onwardCal")
	WebElement ClickCalender;
	
	@FindBy(xpath = "//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]")
	WebElement MonthAndYear;
	
	@FindBy(xpath = "//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")
	WebElement NextButton;
	
	@FindBys(@FindBy(xpath="//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"))
	List<WebElement> Date;
	
	@FindBy(id="search_button")
	WebElement Search;
	
	public SearchBusPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void city(String from, String to)
	{
		WebElementUtils.sendKeys(FromCity, from);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).keyDown(Keys.ENTER).sendKeys(to).
		sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).keyDown(Keys.TAB).keyDown(Keys.TAB).
		keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
	}
	
	public void calender(String monthandyear, String date)
	{
		HandleCalender.MonthAndYear(MonthAndYear, monthandyear, NextButton);
		
		HandleCalender.Date(Date, date);
		
	}
	
	public void ClickOnSearch()
	{
		WebElementUtils.click(Search);
	}
	

}
