package baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperClass {
	protected WebDriver driver;
	public void launchApplication() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void openWebsite() {
		driver.get("https://www.redbus.in/");
	}
	
	public void takeScreenshot(String path) throws IOException {
		TakesScreenshot image = ((TakesScreenshot)driver);
		File SrcFile = image.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(path);
		FileUtils.copyFile(SrcFile,DestFile);
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
