package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.xml.internal.bind.v2.model.runtime.RuntimeEnumLeafInfo;

public class SeleniumConfig {
	
	public static void initWebDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		RunEnvironment.setWebDriver(driver);
	}

	public static void shutDownDriver() {
		RunEnvironment.getWebDriver().quit();
	}

}
