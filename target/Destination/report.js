$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('SwipeTest\Validar Swipe.feature');
formatter.feature({
  "line": 1,
  "name": "Validar Swipe",
  "description": "",
  "id": "validar-swipe",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validar Swipe",
  "description": "",
  "id": "validar-swipe;validar-swipe",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Que eu esteja acessando a tela de Swipe",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Efetuar o Swipe para a direita até o final",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Devera ser validada a informacao apresentada",
  "keyword": "Then "
});
formatter.match({
  "location": "StepSwipe.Que_eu_esteja_acessando_a_tela_de_Swipe()"
});
formatter.result({
  "duration": 20645204000,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not proxy command to remote server. Original error: Error: socket hang up (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027NTB177629\u0027, ip: \u002710.130.23.238\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{app\u003d\\Users\\edmjunio\\Git_Pessoal\\Automacao_Mobile_CTappium\\resources\\CTAppium_1_2.apk, appPackage\u003dcom.ctappium, deviceScreenSize\u003d1080x2220, networkConnectionEnabled\u003dtrue, statBarHeight\u003d66, warnings\u003d{}, viewportRect\u003d{top\u003d66, left\u003d0, width\u003d1080, height\u003d2022}, databaseEnabled\u003dfalse, deviceName\u003demulator-5554, platform\u003dLINUX, deviceUDID\u003demulator-5554, desired\u003d{app\u003d\\Users\\edmjunio\\Git_Pessoal\\Automacao_Mobile_CTappium\\resources\\CTAppium_1_2.apk, automationName\u003duiautomator2, platformName\u003dAndroid, deviceName\u003demulator-5554}, platformVersion\u003d7.0, pixelRatio\u003d2.75, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, automationName\u003duiautomator2, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, deviceScreenDensity\u003d440, deviceModel\u003dAndroid SDK built for x86, deviceManufacturer\u003dGoogle, deviceApiLevel\u003d24, platformName\u003dLINUX}]\nSession ID: 5a1d9bb1-4bbe-4781-8107-f3be9dd9874b\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.TextView[@text \u003d \u0027Swipe\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:89)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:383)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElements(DefaultGenericMobileDriver.java:54)\r\n\tat io.appium.java_client.AppiumDriver.findElements(AppiumDriver.java:149)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:462)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementsByXPath(DefaultGenericMobileDriver.java:144)\r\n\tat io.appium.java_client.AppiumDriver.findElementsByXPath(AppiumDriver.java:181)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:344)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElements(DefaultGenericMobileDriver.java:50)\r\n\tat io.appium.java_client.AppiumDriver.findElements(AppiumDriver.java:145)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:881)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat Formulario.MenuPage.waitElementVisible(MenuPage.java:29)\r\n\tat Formulario.MenuPage.clicarMenu(MenuPage.java:22)\r\n\tat SwipeTest.StepSwipe.Que_eu_esteja_acessando_a_tela_de_Swipe(StepSwipe.java:33)\r\n\tat ✽.Given Que eu esteja acessando a tela de Swipe(SwipeTest\\Validar Swipe.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepSwipe.Efetuar_o_Swipe_para_a_direita_até_o_final()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepSwipe.Devera_ser_validada_a_informacao_apresentada()"
});
formatter.result({
  "status": "skipped"
});
});