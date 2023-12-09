package propertyFileDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void testone() throws IOException
	{
	System.setProperty("webdriver.gecko.driver", "F:\\\\BrowserDriver\\\\geckodriver.exe" );
	
	FirefoxDriver driver = new FirefoxDriver();

    
    driver.manage().window().maximize();
        
    //ReadConfigurationsFile RCF = new ReadConfigurationsFile();
    
    driver.get("https://magento2-demo.magebit.com/admin/");
    //driver.get(RCF.getURL());
    
    driver.findElement(By.id("username")).sendKeys("magebit");
    //driver.findElement(By.id("username")).sendKeys(RCF.getUserName());
    
    driver.findElement(By.id("login")).sendKeys("Demo123");    
    //driver.findElement(By.id("login")).sendKeys(RCF.getPassword());

}
}
