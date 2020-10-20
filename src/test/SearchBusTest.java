package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import excel.Excel;
import baseclass.WrapperClass;
import pages.SearchBus;

public class SearchBusTest extends WrapperClass {

	@BeforeClass
	public void startUp() {
		launchApplication();
		openWebsite();
	}

	@Test
	public void searchBusTest() throws InterruptedException, Exception {
		SearchBus search = new SearchBus(driver);
		String output=search.searchBus(Excel.getvalue1(), Excel.getvalue2());
		Thread.sleep(1000);
		takeScreenshot("./Screenshots/image.jpg");
		System.out.println(output);
	}

	@AfterMethod
	public void close() {
		closeBrowser();

	}

}
