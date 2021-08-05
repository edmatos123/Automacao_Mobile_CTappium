package Clique;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;

import RecursosAppium.Conector;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CliquePage {

	private AndroidDriver<MobileElement> driver; 
	
	public CliquePage(AndroidDriver<MobileElement> driver) {
	
	this.driver = driver;
	
}
	
	public void clicarLongo() throws MalformedURLException {
		
		
		new TouchAction(Conector.getConectar()).longPress(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Clique Longo']"))).perform();


	}


	public void validarTexto()
	{
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[2]")).getText(), "Clique Longo");
	}
	
	
}
