package propertyFileDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigurationsFile {
	
	Properties prop;
	
	String filePath = "C:\\Users\\HP\\deepak_workspace\\SeleniumLessons\\src\\propertyFileDemo\\Configurations.properties";
	
	public ReadConfigurationsFile() throws IOException
	
	{
		prop = new Properties();
		
		try {
			FileReader FR = new FileReader(filePath);
			
		    prop.load(FR);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public String getURL()
	{
		return prop.getProperty("URL");
		 
	}
	
	public String getUserName()
	{
		return prop.getProperty("UserName");
	}
	
	public String getPassword()
	{
		return prop.getProperty("Password");
	}

}
