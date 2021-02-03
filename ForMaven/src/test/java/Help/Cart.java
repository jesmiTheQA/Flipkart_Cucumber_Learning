package Help;

import java.time.Duration;
import java.util.ArrayList;

import org.apache.commons.exec.ExecuteException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Cart {
	
	JavaScriptExecuter jv=new JavaScriptExecuter();
	static final Logger logger = LogManager.getLogger(Cart.class);

	
	
	//To remove an item from cart
		public void Cart_removeFromCart() {
			try {

				String cartXpath="//a[@class='_3ko_Ud']";
				Common.driver.findElement(By.xpath(cartXpath)).click();
		        Thread.sleep(2000);
		        
		        Common.forscreenshot.Screenshotpdf("Items in cart");
		        logger.info("Items in cart");
		        
		        String divfirstitemxpath="(//div[@class='_3ycxrs _2Rwa71'])[1]";
		        String removexpath="(//div[@class='gdUKd9'])[2]";
		        jv.Flashmethod(divfirstitemxpath);
		        Common.driver.findElement(By.xpath(removexpath)).click();
		        
		        Common.forscreenshot.Screenshotpdf("Removing the items");
		        logger.info("Removing the items");
		        
		        FluentWait fluentWait=new FluentWait(Common.driver);
		        fluentWait.withTimeout(Duration.ofSeconds(60));
		        fluentWait.pollingEvery(Duration.ofSeconds(2));
		        fluentWait.until(ExpectedConditions.elementToBeClickable(Common.driver.findElement(By.xpath("//div[@class='gdUKd9 _3Z4XMp _2nQDKB']"))));
//		            Alert alert = Common.driver.switchTo().alert();
		            Thread.sleep(500);
//		            alert.accept();
		            Common.driver.findElement(By.xpath("//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")).click();
		        Thread.sleep(500);
		        Common.forscreenshot.Screenshotpdf("Item Removed.");
		        logger.info("Item Removed.");
		        
			}
			catch(Exception e) {
				System.out.println("Error is from Cart_removeFromCart() method."+e.toString());
				
			}
		}
	
	//To add an item to cart
		public void Cart_addItemToCart() {
			try {
		        String addtocartbuttonxpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']";
		        jv.Flashmethod(addtocartbuttonxpath);
		        Common.driver.findElement(By.xpath(addtocartbuttonxpath)).click();
		        Thread.sleep(2000);
		        Common.forscreenshot.Screenshotpdf("Item added to cart.");
		        logger.info("Item added to cart.");
			}
			catch(Exception e){
				System.out.println("Error is from Cart_addItemToCart() method."+e.toString());
			}
		}
		
		//To purchase the item
		public void Cart_fromCartPlaceOrder() {
			try {
				String placeorderbuttonxpath="//button[@class='_2AkmmA iwYpF9 _7UHT_c']";
//	            Boolean staleElement = true;
//	            while(staleElement){
//	                try{
				        jv.Flashmethod(placeorderbuttonxpath);
	                	Common.driver.findElement(By.xpath(placeorderbuttonxpath)).click();
	                    Thread.sleep(2000);
	                    Common.forscreenshot.Screenshotpdf("Place items from cart to order.");
	                    logger.info("Place items from cart to order.");
//	                    staleElement = false;
//	                }
//	                catch (Exception e){
//	                    staleElement = true;
//	                }
//	            }
			}
			catch(Exception e) {
				System.out.println("Error is from Cart_fromCartPlaceOrder() method."+e.toString());
			}
		}
		
		//Select deliver address
		public void Cart_deliveryAddressSelection() {
			try {
				
				ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
	            Common.driver.switchTo().window(tabs.get(1));
	            Thread.sleep(2000);
	            String deliveryherexpath="//button[@class=\"_2AkmmA _I6-pD _7UHT_c\"]";
	            jv.Flashmethod(deliveryherexpath);
	            Common.driver.findElement(By.xpath(deliveryherexpath)).click();
	            Common.forscreenshot.Screenshotpdf("Selected the delivery address.");
	            logger.info("Selected the delivery address.");
	            Thread.sleep(1000);
	            jv.Scrolldown();
	            

	            
			}
			catch(Exception e) {
				System.out.println("Error is from Cart_deliveryAddressSelection() method."+e.toString());
			}
		}
		
		//For Order summary
		public void Cart_orderSummart() {
			try {
	            String continuebuttonxpath="//button[@class='_2AkmmA _2Q4i61 _7UHT_c']";
	            jv.Flashmethod(continuebuttonxpath);
	            Common.driver.findElement(By.xpath(continuebuttonxpath)).click();
	            Common.forscreenshot.Screenshotpdf("Selected the order summary.");
	            logger.info("Selected the order summary.");
	            Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Error is from Cart_orderSummart() method."+e.toString());
			}
		}
	
		
		//To select payment option
		public void Cart_payment() {
			try {
				
				 ArrayList<String> tabs = new ArrayList<String> (Common.driver.getWindowHandles());
		            Common.driver.switchTo().window(tabs.get(1));
		            Thread.sleep(1000);
//		            String continuebuttonxpath="(//div[@class='_6ATDKp'])[6]";
		            String cashondeliverxpath="(//div[@class='_6ATDKp'])[6]";
		            jv.Scrolldown();
//		            String cashdeliverybuttonxpath="//button[@class='_2AkmmA _3iEVG4 _7UHT_c']";
		            jv.Flashmethod(cashondeliverxpath);
		            Common.driver.findElement(By.xpath(cashondeliverxpath)).click();
		            Common.forscreenshot.Screenshotpdf("Select the payment summary.");
		            logger.info("Select the payment summary.");
		            Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Error is from Cart_payment() method."+e.toString());
			}
		}
		
		//To validate item in cart
		public void Cart_itemValidationInCart() {
			try {
				
				String homexpath="//img[@class='_1e_EAo']";
				String cartbuttonxpath="//a[@class='_3ko_Ud']";
				Common.driver.findElement(By.xpath(homexpath)).click();
				Thread.sleep(2000);
				Common.driver.findElement(By.xpath(cartbuttonxpath)).click();
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				System.out.println("Error is from Cart_itemValidationInCart() method."+e.toString());
			}
		}
}
