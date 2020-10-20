package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBus {
	WebDriver driver;
	@FindBy(xpath="//input[@id='src']")
	private WebElement src;
	@FindBy(xpath="//input[@id='dest']")
	private WebElement dest;
	@FindBy(xpath="//input[@id='onward_cal']")
	private WebElement calendar;
	@FindBy(xpath="//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")
	private WebElement month;
	@FindBy(xpath="//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[6]/td[5]")
	private WebElement date;
	@FindBy(xpath="//button[@id='search_btn']")
	private WebElement search;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/div[1]/i")
	private WebElement closePop;
	@FindBy(xpath="//*[@id=\"filter-block\"]/div/div[2]/ul[2]/li[3]/label[1]")
	private WebElement acCheck;
	@FindBy(xpath="//*[@id=\"10929267\"]/div/div[1]/div[1]/div[1]/div[1]")
	private WebElement name;
	@FindBy(xpath="//*[@id=\"13616592\"]/div/div[1]/div[1]/div[6]/div/div/span")
	private WebElement price;
	public SearchBus(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String searchBus(String Src,String Dest) throws InterruptedException {
		src.click();
		src.clear();
		src.sendKeys(Src);
		Thread.sleep(1000);
		src.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		dest.click();
		dest.clear();
		dest.sendKeys(Dest);
		Thread.sleep(1000);
		dest.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		calendar.click();
	    month.click();
	    date.click();
	    Thread.sleep(1000);
	    search.click();
	    Thread.sleep(2000);
	    closePop.click();
	    Thread.sleep(5000);
	    acCheck.click();
	    Thread.sleep(1000);
	    
	    String busname= name.getText();
	    String busprice=price.getText();
		return busname+"\n"+busprice;
	}
}
