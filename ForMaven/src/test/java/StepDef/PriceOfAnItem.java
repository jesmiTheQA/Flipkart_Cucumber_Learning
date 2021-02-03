package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Help.BrowserSelection;
import Help.Common;
import Help.JavaScriptExecuter;
import Help.SearchPage;
//import Help.JavaScriptExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PriceOfAnItem {

	BrowserSelection browserselection=new BrowserSelection();
	SearchPage searchpage=new SearchPage();
	
	@Given ("^Login to flipkart$")
	public void PriceOfAnItem_login() {
		try {
			
			browserselection.BrowserSelection_lauchbrowser();
			browserselection.BrowserSelection_login();
		}
		catch(Exception e) {
			System.out.println("Error is from PriceOfAnItem_login() method."+ e.toString());
		}
	}
	
	@When ("^Search for an item$")
	public void PriceOfAnItem_ItemSearch() {
		try {
			
			searchpage.SearchPage_searchItem();
		}
		catch(Exception e) {
			System.out.println("Error is from PriceOfAnItem_ItemSearch() method."+ e.toString());
		}
	}
	
	@Then ("^Check the price$")
	public void PriceOfAnItem_PriceCheck() {
		try {
			
			String itempricexpath="//div[@class='_1vC4OE']";
			JavaScriptExecuter javascriptexecuter=new JavaScriptExecuter();
			javascriptexecuter.Flashmethod(itempricexpath);
			Common.forscreenshot.Screenshotpdf("Price of the first item.");

		}
		catch(Exception e) {
			System.out.println("Error is from PriceOfAnItem_PriceCheck() method."+ e.toString());
		}
	}
	
	@And ("^Close browser$")
	public void PriceOfAnItem_CloseBrowser() {
		try {
			browserselection.BrowserSelection_closebrowser();
		}
		catch(Exception e) {
			System.out.println("Error is from PriceOfAnItem_CloseBrowser() method."+ e.toString());
		}
	}
	
}
