package Formulario;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MainPage {
	
	AndroidDriver<MobileElement> driver;
		
	public MainPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		    
	}
	
	
   public void clicarMenu(String texto) {
	
   driver.findElement(By.xpath("//android.widget.TextView[@text = '"+texto+"']")).click(); 		
		
   }
	
	

}
