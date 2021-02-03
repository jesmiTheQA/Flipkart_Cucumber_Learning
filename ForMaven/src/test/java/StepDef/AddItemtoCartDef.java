package StepDef;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Help.BrowserSelection;
import Help.Cart;
import Help.Common;
import Help.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddItemtoCartDef {

	BrowserSelection browserselection=new BrowserSelection();
	SearchPage searchpage=new SearchPage();
	Cart cart=new Cart();
	
	@Given("^I want to Login to Flipkart$")
	public void login_to_Flipkart() throws InterruptedException {
	  
		//To launch flipkart
		browserselection.BrowserSelection_lauchbrowser();
		
		//To login to flipkart
		browserselection.BrowserSelection_login();
	}

	@When("^I want to add item to my cart$")
	public void add_item_to_cart() throws InterruptedException {
		
		if(Common.errorcode != 1) {
			//Item search
			searchpage.SearchPage_searchItem();

	        
	        //For details page
			searchpage.SearchPage_detailsPage();
		
	                
	        //Add item to cart

			cart.Cart_addItemToCart();
		}

	}

	@Then("^I validate the item in the cart$")
	public void AddItemtoCartDef_validateItemInCart(){
		try {

			if(Common.errorcode != 1){
				//To validate item in cart
				cart.Cart_itemValidationInCart();
				
				//To close the browser
				browserselection.BrowserSelection_closebrowser();
			}
			

			
			
		}
		catch(Exception e) {
			System.out.println("Issue is from AddItemtoCartDef_validateItemInCart() "+e.toString());
		}

		
		
	    
	}


}
