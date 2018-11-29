package bankApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class selGrid {
	public static void main(String[] args) throws InterruptedException, MalformedURLException 

	{
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		//capabilities.setCapability("firefox_binary","C:/Users/npadmawa.CORP/AppData/Local/Mozilla Firefox/firefox.exe");
		capabilities.setPlatform(Platform.ANY);
				
		WebDriver driver = new RemoteWebDriver(new URL("http://10.220.56.15:5555/wd/hub"), capabilities);
try {
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/Module%204/Lesson%205-HTML%20Pages/WorkingWithForms.html");
		System.out.println(driver.getTitle());
//		driver.quit();
}
catch(Exception ex){
	System.out.println("Hello");
}
}
	}


