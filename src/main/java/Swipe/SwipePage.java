package Swipe;


import java.net.MalformedURLException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import RecursosAppium.Conector;
import Utilitarios.Utilitarios;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SwipePage {
	
	private AndroidDriver<MobileElement> driver; 
	private Utilitarios uti;
	
	public SwipePage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		uti = new Utilitarios(driver);
		
	}
	
	public void efetuarSwipe(int x_ponto1, int x_ponto2) throws MalformedURLException, InterruptedException {
		
		uti.waitElementVisible(30,By.xpath("//android.widget.TextView[@text = \"›\"]"));
		
		Dimension size = Conector.getConectar().manage().window().getSize();

		int y = size.height / 2;
		
		
		int x_inicial =  (int) ((size.width * x_ponto1)/100);
		int x_final = (int) ((size.width * x_ponto2)/100) ;
		
		uti.swipeLado(x_inicial, x_final, y);
		
		
	}
	
	public void validarTexto (String texto) {
		
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Chegar até o fim!']")).getText(), texto);
		
	}

}
