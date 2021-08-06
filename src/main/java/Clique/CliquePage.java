package Clique;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;

import RecursosAppium.Conector;
import Utilitarios.Utilitarios;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CliquePage {

	private AndroidDriver<MobileElement> driver; 
	private Utilitarios uti;
	
	public CliquePage(AndroidDriver<MobileElement> driver) {
	
	this.driver = driver;
	uti = new Utilitarios(driver);
	
}
	
	public void clicarLongo() throws MalformedURLException {
		
		
		new TouchAction(Conector.getConectar()).longPress(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Clique Longo']"))).perform();


	}

	public void clicarDuplo() {
		uti.waitElementVisible(30, By.xpath("//android.widget.TextView[@text = 'Clique duplo']"));
		
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Clique duplo']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Clique duplo']")).click();
	}
	

	public void validarTexto(String texto)
	{
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[2]")).getText(), texto);
	}
	
	
}
