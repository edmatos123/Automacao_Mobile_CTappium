package FuncionalidadeX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainPage {
	
	AndroidDriver driver;
		
	public MainPage(AndroidDriver driver) {
		this.driver = driver;
		    
	}
	
	
   public void clicarMenu(String texto) {
	
   driver.findElement(By.xpath("//android.widget.TextView[@text = '"+texto+"']")).click(); 		
		
   }
	
	

}
