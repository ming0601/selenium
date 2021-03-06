package demoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.RunEnvironment;
import config.SeleniumConfig;

public class DemoTest {
	
	@BeforeEach
	void startBrowser() {
		SeleniumConfig.initWebDriver();
	}
	
	@AfterEach
	void stopBrowser() {
		SeleniumConfig.shutDownDriver();
	}
	
	@Test
	void testDemo() {
		WebDriver driver = RunEnvironment.getWebDriver();
		driver.get("https://www.blazemeter.com/selenium");
		String title = driver.getTitle();
		String homeUrl = driver.findElement(By.cssSelector("div#logo>a#logo_image")).getAttribute("href");
		assertEquals("https://www.blazemeter.com/", homeUrl);
		assertEquals("Selenium Testing Blog for DevOps | BlazeMeter", title);
	}

}
