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
import cucumber.api.java.en.And;

public class payOnDelivery {
	
	BrowserSelection browserselection=new BrowserSelection();
	SearchPage searchpage=new SearchPage();
	Cart cart=new Cart();
	
	@Given("^Open flipcart$")
	public void payOnDelivery_login() {
		try {

			
				//To launch flipkart
				browserselection.BrowserSelection_lauchbrowser();
				
				//To login to flipkart
				browserselection.BrowserSelection_login();
			
			
		}
		catch(Exception e) {
			System.out.println("Error is fom payOnDelivery_login()method. "+e.toString());
		}
	}
	
	@When("^Select an item$")
	public void payOnDelivery_selectAnItem(){
		try {
			if(Common.errorcode != 1){
				//Item search
				searchpage.SearchPage_searchItem();
		        
		        //For details page
				searchpage.SearchPage_detailsPage();	
			}
			
					
			
		}
		catch(Exception e) {
			System.out.println("Issue is from payOnDelivery_selectAnItem() method. "+e.toString());
		}
	}

	@And ("^Add that item to cart$")
	public void payOnDelivery_addItemToCart() {
		try {
			
			if(Common.errorcode != 1){
				 //Add item to cart
				cart.Cart_addItemToCart();
			}

			
		}
		catch(Exception e) {
			System.out.println("Issue is from payOnDelivery_addItemToCart() method. "+e.toString());
		}
	}
	
	@And ("^Place it for order$")
	public void payOnDelivery_placeItForOrder() {
		
		try {
			if(Common.errorcode != 1) {
				
				cart.Cart_fromCartPlaceOrder();
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Issue is from payOnDelivery_placeItForOrder() method. "+e.toString());
		}
	}

	
	@And("^Select delivery address$")
	public void payOnDelivery_selectDeliverAddress() {
		try {

			if(Common.errorcode != 1) {
				cart.Cart_deliveryAddressSelection();
				cart.Cart_orderSummart();
			}

			
		}
		catch(Exception e) {
			System.out.println("Error is from payOnDelivery_payOnDelivery() "+e.toString());
		}
	}
	
	@Then("^The selected payment method is Pay on Delivery$")
	public void payOnDelivery_payOnDelivery() {
		try {
			if(Common.errorcode != 1) {
				cart.Cart_payment();
			}

			
		}
		catch(Exception e) {
			System.out.println("Error is from payOnDelivery_payOnDelivery() "+e.toString());
		}
	}
	

	@And ("^Close browser in this secnario$")
	public void payOnDelivery_closeBrowser() {
		try {
			if(Common.errorcode != 1) {
				browserselection.BrowserSelection_closebrowser();
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Issue is from payOnDelivery_closeBrowser() method. "+e.toString());
		}
	}
}
