package RecursosAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Conector {
	
	private DesiredCapabilities desiredCapabilities;
	
	
	
	public Conector() {
		this.desiredCapabilities = new DesiredCapabilities();
		//Conectar(this.desiredCapabilities);
	}
	
	
	//@Test
	public AndroidDriver Conectar () throws MalformedURLException
	{
		//desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		/*desiredCapabilities.setCapability("appPackage","");
		desiredCapabilities.setCapability("appActivity","");*/
		desiredCapabilities.setCapability(MobileCapabilityType.APP,"\\Users\\edmjunio\\eclipse-workspace\\Mobile\\src\\main\\java\\resources\\CTAppium_1_2.apk");

		
		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		return driver;
		
		
		//driver.quit();
	}
	
	
	
}
