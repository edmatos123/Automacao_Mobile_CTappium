package RecursosAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Conector {
	
	private static DesiredCapabilities desiredCapabilities;
	private static AndroidDriver<MobileElement> driver;
	
	
	public static AndroidDriver<MobileElement> getConectar () throws MalformedURLException {
		if(driver == null)
		{
		Conectar();			
		}
		return driver;
	}
	
	
	//@Test
	private static AndroidDriver<MobileElement> Conectar () throws MalformedURLException
	{
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		/*desiredCapabilities.setCapability("appPackage","");
		desiredCapabilities.setCapability("appActivity","");*/
		desiredCapabilities.setCapability(MobileCapabilityType.APP,"\\Users\\edmjunio\\Git_Pessoal\\Automacao_Mobile_CTappium\\resources\\CTAppium_1_2.apk");

		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void Desconectar() {
		if(driver != null)
		{
			driver.quit();
			driver = null;
		}
		
	}
	
	
	
}
