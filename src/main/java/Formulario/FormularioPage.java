package Formulario;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RecursosAppium.Conector;
import Utilitarios.Utilitarios;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;



public class FormularioPage {
	
	private AndroidDriver<MobileElement> driver;
	private Utilitarios util;
	
	public FormularioPage(AndroidDriver<MobileElement> driver) {		
		this.driver = driver;
		this.util = new Utilitarios(driver);
	
	}
	
	public void preencherNome(String Nome) throws MalformedURLException {
		
		util.waitElementVisible(30,MobileBy.AccessibilityId("nome"));
		
		MobileElement nome = Conector.getConectar().findElement(MobileBy.AccessibilityId("nome"));

		nome.sendKeys(Nome);
		
	}
	
	public void selecionarConsole(String Console) {
		
	driver.findElement(MobileBy.AccessibilityId("console")).click();
	
	List<MobileElement> consolesTPS = driver.findElements(By.className("android.widget.CheckedTextView"));

	for(MobileElement verificacao: consolesTPS) {
		
		if(verificacao.getText().equals(Console)) {
			
			verificacao.click();
			break;
			
		}
		
	}
	
		
	}
	
	public void clicarSeekBar(double posicao) throws MalformedURLException {
		
		//Identificar o SeekBar
		MobileElement seek = Conector.getConectar().findElement(MobileBy.AccessibilityId("slid"));
		
		int y = seek.getLocation().y + 16;   //(seek.getSize().height / 2);
		int x = (int) ((1020 * posicao) / 100);
		
		util.tap(x,y);
		
	}
	
		
	
	
	
	public void clicarCheck() throws MalformedURLException {
		
		MobileElement check = Conector.getConectar().findElement(MobileBy.AccessibilityId("check"));
		
		if(check.getAttribute("checked").equals("false")) {
			check.click();
		}
		
	}
	
	public void clicarSwitch() throws MalformedURLException {
		
		MobileElement switch_el = Conector.getConectar().findElement(MobileBy.AccessibilityId("switch"));
		
		if(switch_el.getAttribute("checked").equals("true")) {
			switch_el.click();
		}
		
	}
	
	public void definirData() throws MalformedURLException {
		
		MobileElement data = Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = '01/01/2000']"));
        		
		if(data.getAttribute("text").equals("01/01/2000")) {
			data.click();
			
			util.waitElementVisible(30,MobileBy.AccessibilityId("02 February 2000"));
								
			MobileElement data1 = Conector.getConectar().findElement(MobileBy.AccessibilityId("02 February 2000"));
	        data1.click();
	        MobileElement buttonOkdata = Conector.getConectar().findElement(By.id("android:id/button1"));
	        buttonOkdata.click();
			
		}
	}
		
   public void definirHorario() throws MalformedURLException
   {
	   util.waitElementVisible(30,By.xpath("//android.widget.TextView[@text = '06:00']"));

		MobileElement hora = Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = '06:00']"));
		
		if(hora.getAttribute("text").equals("06:00")) {
			hora.click();	
			
			util.waitElementVisible(30,MobileBy.AccessibilityId("7"));
				
			MobileElement hora1 = Conector.getConectar().findElement(MobileBy.AccessibilityId("7"));
			hora1.click();
	        MobileElement buttonOkhora = Conector.getConectar().findElement(By.id("android:id/button1"));
			buttonOkhora.click();
			
		}

	   
	   
   }
		
        
    public void salvarFormulario() throws MalformedURLException {
    	util.waitElementVisible(30,By.xpath("//android.widget.TextView[@text = 'SALVAR']"));

    	MobileElement btnSalvar = Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = 'SALVAR']"));

		btnSalvar.click();
    }
    
    		 
	public void validarDados() throws MalformedURLException {
		
		util.waitElementVisible(30,By.xpath("//android.widget.TextView[@text = 'Nome: Marilia Silva']"));
		
		Assert.assertEquals(Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = 'Nome: Marilia Silva']")).getText(), "Nome: Marilia Silva");
		Assert.assertEquals(Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = 'Console: ps4']")).getText(), "Console: ps4");
		Assert.assertEquals(Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = 'Slider: 80']")).getText(), "Slider: 80");
		Assert.assertEquals(Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = 'Switch: Off']")).getText(), "Switch: Off");
		Assert.assertEquals(Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = 'Checkbox: Marcado']")).getText(), "Checkbox: Marcado");
		Assert.assertEquals(Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = 'Data: 2/2/2000']")).getText(), "Data: 2/2/2000");
		Assert.assertEquals(Conector.getConectar().findElement(By.xpath("//android.widget.TextView[@text = 'Hora: 7:0']")).getText(), "Hora: 7:0");

	}
		
	
	 
	

}
