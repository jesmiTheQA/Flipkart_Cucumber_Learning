package Help;

import java.time.Duration;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SearchPage {

	JavaScriptExecuter jv=new JavaScriptExecuter();
	ConfigPropertyReader configpropertyreader=new ConfigPropertyReader();
	static final Logger logger = LogManager.getLogger(SearchPage.class);
	
	
	
	//To search for an item
	public void SearchPage_searchItem() {
		try {
	        String serachtextxpath="//input[@name='q']";
	        String serachbuttonxpath="//button[@class='vh79eN']";
	        
	        configpropertyreader.cofigInitialiser();
	        String item=configpropertyreader.getConfigValue("search");
	        Common.driver.findElement(By.xpath(serachtextxpath)).sendKeys(item);
	        Thread.sleep(500);
	        Common.driver.findElement(By.xpath(serachbuttonxpath)).click();
	        String selecteditemdivxpath="//div[@class='_3liAhj']";
	        jv.Flashmethod(selecteditemdivxpath);
	        Thread.sleep(1000);
	        Common.forscreenshot.Screenshotpdf("Item searched.");
	        logger.info("Item searched.");
		}
		catch(Exception e) {
			System.out.println("Error is from SearchPage_searchItem() method."+e.toString());
		}
	}
	
	//To navigate to details page
	public void SearchPage_detailsPage() {
		try {
	      String selectitemmoneyxpath="//div[@class='_1vC4OE']";
	      Common.driver.findElement(By.xpath(selectitemmoneyxpath)).click();        
	        Thread.sleep(1000);
	        ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
	        Common.driver.switchTo().window(tabs.get(1));
	        Common.forscreenshot.Screenshotpdf("Item details.");
	        logger.info("Item details.");
		}
		catch(Exception e) {
			System.out.println("Error is from SearchPage_detailsPage() method."+e.toString());
		}
	}
	
	
	
	
}
