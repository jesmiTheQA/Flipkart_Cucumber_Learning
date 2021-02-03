package Help;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BrowserSelection {
	
	ConfigPropertyReader configpropertyreader=new ConfigPropertyReader();
	ForScreenShots forscreenshots=new ForScreenShots();
	String browser;
//	static final Logger logger = LogManager.getLogger(BrowserSelection.class.getName());
	static final Logger logger = LogManager.getLogger(BrowserSelection.class);

	
	//To launch flipkart
	public void BrowserSelection_lauchbrowser() {
		try {
			Common.forscreenshot.ForScreenShots_ScreenshotpdfStart();
			configpropertyreader.cofigInitialiser();
			
			//Select from where browser should take
			String readbrowserfrom=(configpropertyreader.getConfigValue("commandselection")).toLowerCase();
			
			if(readbrowserfrom.contains("no")) {
				browser=(configpropertyreader.getConfigValue("browser")).toLowerCase();
				BrowserSelection_toSelectBrowser();
			}
			else if(readbrowserfrom.contains("yes")) {
				//String selectedbrowser;
				BrowserSelection_consoleread();
				BrowserSelection_toSelectBrowser();
		           
			}
			else {
				System.out.println("Entered values is wrong");
				BrowserSelection_closebrowser();
				
			}

		}
		catch(Exception e) {
			System.out.println("Error is from BrowserSelection_lauchbrowser() method."+e.toString());
		}
	}
	
	
	//To select 
	private void BrowserSelection_toSelectBrowser() {
		try {
			
			String os= System.getProperty("os.name").toLowerCase();
			
			if (os.contains("windows"))
			{
				System.out.println("Selected OS is windows");
				logger.info("Operating system is: "+ os);
				if(browser.contentEquals("chrome")) {
//					System.setProperty("webdriver.chrome.driver","E:\\Chinnan\\For Automation\\Space for Eclipse Projects\\TolearnSelenium-OfficeRelated\\chromedriver.exe");
					String windowschromedriver=configpropertyreader.getConfigValue("windows_chromedriver");
					System.setProperty("webdriver.chrome.driver",windowschromedriver);
				    Common.driver=new ChromeDriver();
				    BrowserSelection_manageBrowser();
				    String path=configpropertyreader.getConfigValue("url");
				    Common.driver.get(path);
				    String s="URL luanched in Chrome browser";
				    Common.forscreenshot.Screenshotpdf(s);
				    
				    

				}
				
				//taking too much time to load so chances to get error.
				else if(browser.contentEquals("firefox")) {
//	                System.setProperty("webdriver.gecko.driver", "E:\\Chinnan\\Office Related\\Talent pool learning\\Intellij-Project3-JUnit-required things\\geckodriver-v0.26.0-win64\\geckodriver.exe");
					String windowsgeckodriver=configpropertyreader.getConfigValue("windows_geckodriver");
					System.setProperty("webdriver.gecko.driver",windowsgeckodriver);
	                Common.driver=new FirefoxDriver();
	                BrowserSelection_manageBrowser();
	    		    String path=configpropertyreader.getConfigValue("url");
	    		    Common.driver.get(path);
				    String s="URL luanched in Firefox browser";
				    Common.forscreenshot.Screenshotpdf(s);
				}
				else {
					System.out.println("Sorry,invalid browser selection..!");
					BrowserSelection_closebrowser();
				}
				
			}
			else if(os.contains("mac")) {
				System.out.println("Selected MAC is windows");
				 if(browser.equals("chrome")){

//	                    System.setProperty("webdriver.chrome.driver", "E:\\Chinnan\\Office Related\\Talent pool learning\\Intellij-Project3-JUnit-required things\\chromedriver_mac64\\chromedriver");
					    String macchromedriver=configpropertyreader.getConfigValue("mac_chromedriver");
					    System.setProperty("webdriver.chrome.driver", macchromedriver);
	                    
	                    Common.driver = new ChromeDriver();
	                    System.out.println("In mac, Chrome Browser selected");
		                BrowserSelection_manageBrowser();
		    		    String path=configpropertyreader.getConfigValue("url");
		    		    Common.driver.get(path);
	                }
	                else if(browser.equals("firefox")){
//	                    System.setProperty("webdriver.gecko.driver", "E:\\Chinnan\\Office Related\\Talent pool learning\\Intellij-Project3-JUnit-required things\\geckodriver-v0.26.0-macos\\geckodriver");
	                	String macgeckodriver=configpropertyreader.getConfigValue("mac_geckodriver");
	                	System.setProperty("webdriver.gecko.driver", macgeckodriver);
	                    Common.driver=new FirefoxDriver();
	                    System.out.println("In Mac,FireFox  Browser selected");
		                BrowserSelection_manageBrowser();
		    		    String path=configpropertyreader.getConfigValue("url");
		    		    Common.driver.get(path);
	                }
	                else{
	                	System.out.println("Sorry,invalid browser selection..!");
	                }
			}
		}
		catch(Exception e) {
			System.out.println("Error is from BrowserSelection_toSelectBrowser() method."+e.toString());
		}
		
	}
	
	//To read browser from conole
	private void BrowserSelection_consoleread() {
		try {
			
			 System.out.println("1.Chrome");
	            System.out.println("2.FireFox");
	            System.out.println("Please select the browser:");
	            Scanner in = new Scanner(System.in);
	            String s= in.next();

	            if(s.equals("1")) {
	                System.out.println("Selected browser is:Chrome");
	                browser="chrome";
	                
	            }
	            else if(s.equals("2")){
	                System.out.println("Selected browser is:FireFox");
	                browser="firefox";
	               
	               
	            }
	            else {
	                
	                System.out.println("Selected browser value is '"+s+ "' that is not valid");
	            }
			
		}
		catch(Exception e) {
			System.out.println("Error is from BrowserSelection_consoleread() method."+e.toString());
		}
	}
	
	//To manage the browser
	public void BrowserSelection_manageBrowser()
	{
	    Common.driver.manage().window().maximize();
	    Common.driver.manage().deleteAllCookies();
	    Common.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	    Common.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//To login to flipkart
	public void BrowserSelection_login() {
		try {
	        String usernamexpath="//input[@class='_2zrpKA _1dBPDZ']";
	        String passwordxpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']";
	        String loginbuttonxpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']";
	        
	        //Reader from config.properties
	        configpropertyreader.cofigInitialiser();
	        String flipkartusername=configpropertyreader.getConfigValue("username");
	        String flipkartpassword=configpropertyreader.getConfigValue("password");;
	     
	        Common.driver.findElement(By.xpath(usernamexpath)).sendKeys(flipkartusername);
	        Thread.sleep(500);
	        Common.driver.findElement(By.xpath(passwordxpath)).sendKeys(flipkartpassword);
	        
		    String s1="Login";
		    Common.forscreenshot.Screenshotpdf(s1);
		    
	        Common.driver.findElement(By.xpath(loginbuttonxpath)).click();
	        Thread.sleep(1000);
	        
	        String logindivxpath="//div[@class='_3Njdz7']";
	        boolean value= Common.driver.findElement(By.xpath(logindivxpath)).isDisplayed();
	        if(value==false) {
			    String s2="User logged in successfully.";
			    Common.forscreenshot.Screenshotpdf(s2);
			    
			    logger.info(s2);
	        }
	        else
	        {
			    String s2="Please enter correct details.";
			    Common.forscreenshot.Screenshotpdf(s2);
			    logger.error(s2);
			    
			    Common.errorcode=1;
			    BrowserSelection_closebrowser();
	        }

		}
		catch(Exception e) {
			System.out.println("Error is from BrowserSelection_login() method."+e.toString());
		}
	}
	
	//To close the browser
	public void BrowserSelection_closebrowser() {
		try {
			
			Common.driver.close();
			Common.driver.quit();
			Common.forscreenshot.ScreenshotpdfClose();
			
			logger.info("Browser closed.");
		}
		catch(Exception e) {
			System.out.println("Error is from BrowserSelection_closebrowser() method." +e.toString());
		}
	}


}
