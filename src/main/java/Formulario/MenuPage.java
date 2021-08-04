package Formulario;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MenuPage {
	
	AndroidDriver<MobileElement> driver;
		
	public MenuPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		    
	}
	
	
   public void clicarMenu(String texto) {
	
	   waitElementVisible(30, By.xpath("//android.widget.TextView[@text = '"+texto+"']"));	   
   driver.findElement(By.xpath("//android.widget.TextView[@text = '"+texto+"']")).click(); 		
		
   }
	
   public void waitElementVisible(int temp, By by) {
       WebDriverWait wait = new WebDriverWait(driver, temp);
       wait.until(ExpectedConditions.visibilityOfElementLocated(by));
 }

}
