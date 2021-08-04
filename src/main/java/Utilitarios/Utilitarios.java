package Utilitarios;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RecursosAppium.Conector;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Utilitarios {
	
	AndroidDriver<MobileElement> driver;
	
	
	public Utilitarios(AndroidDriver<MobileElement> driver) {		
		this.driver = driver;
	}
	
	  public void waitElementVisible(int temp, By by) {
	        WebDriverWait wait = new WebDriverWait(driver, temp);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	  }
	
	   public void tap(int x,int y) throws MalformedURLException {
			
			new TouchAction(Conector.getConectar()).tap(x,y).perform();		
	
	   }
	
	
	
	

}
