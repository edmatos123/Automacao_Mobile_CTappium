package FuncionalidadeX;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class FormularioPage {
	
	AndroidDriver driver;
	
	public FormularioPage(AndroidDriver driver) {		
		this.driver = driver;
	}
	
	public void preencherNome(String Nome) {
		
	driver.findElement(MobileBy.AccessibilityId("nome")).sendKeys(Nome);
		
	}
	
	
	
	
	

}
