package Help;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertyReader {
	
	 Properties prop;
	    public void cofigInitialiser() throws IOException {
	        prop=new Properties(); // This class is available in java
	        FileInputStream ip= new FileInputStream("E:\\Chinnan\\For Automation\\Space for Eclipse Projects\\ForMaven\\src\\test\\java\\Resources\\config.properties");
	        prop.load(ip);

	    }


	    public String getConfigValue(String key) {
	        try{
	           return(prop.getProperty(key));
	        }
	        catch (Exception e) {
	            System.out.println("Issue is from getConfigValue() function"+ e.toString());
	            return "";
	        }
	    }
	    
}
