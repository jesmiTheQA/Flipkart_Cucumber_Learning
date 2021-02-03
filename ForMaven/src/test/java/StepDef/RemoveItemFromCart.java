package StepDef;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Help.BrowserSelection;
import Help.Cart;
import Help.Common;
import Help.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RemoveItemFromCart {

	BrowserSelection browserselection=new BrowserSelection();
	SearchPage searchpage=new SearchPage();
	Cart cart=new Cart();
	
	@Given("^I have open the browser$")
	public void login() {
		try {
			
			browserselection.BrowserSelection_lauchbrowser();
			browserselection.BrowserSelection_login();
		}
		catch(Exception e) {
			System.out.println("Error is fom Login2() "+e.toString());
		}

	}
	@When("^Removed item from cart$")
	public void RemoveItemFromCart_removeItemFromCart() {
		try {

			cart.Cart_removeFromCart();
			
		}
		catch(Exception e) {
			System.out.println("Error is from RemoveItemFromCart_removeItemFromCart()() method "+ e.toString());
		}

		
	}
	@Then("^Login button should exits$")
	public void RemoveItemFromCart_closebrowser() {
		try {
			browserselection.BrowserSelection_closebrowser();
		}
		catch(Exception e) {
			System.out.println("Error is from RemoveItemFromCart_closebrowser() method "+ e.toString());
		}
		
	}
}
