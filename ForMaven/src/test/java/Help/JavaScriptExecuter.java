package Help;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;



public class JavaScriptExecuter {
	public static void Flashmethod(String locaterforWebelement){
		try {
			JavascriptExecutor js = (JavascriptExecutor) Common.driver; 
			js.executeScript("arguments[0].setAttribute('style', 'background: Aquamarine; border: 2px solid red;');", Common.driver.findElement(By.xpath(locaterforWebelement)));
			Thread.sleep(3000);
			js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid white;');", Common.driver.findElement(By.xpath(locaterforWebelement)));
			Thread.sleep(500);
			
		}
		catch(Exception e) {
			System.out.println("Error is from JavaScriptExecuter_Flashmethod() method "+e.toString());
		}
	}
	public static void Scrolldown(){
		try {
			JavascriptExecutor js = (JavascriptExecutor)Common.driver;
			 js.executeScript("window.scrollBy(0,600)");
			 Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("Error is from JavaScriptExecuter_Scrolldown() method "+e.toString());
		}
	}
	public static void Scrollup(){
		try {
			JavascriptExecutor js = (JavascriptExecutor)Common.driver;
			 js.executeScript("window.scrollBy(0,-600)");
			 Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("Error is from JavaScriptExecuter_Scrolldown() method "+e.toString());
		}
	}
}
