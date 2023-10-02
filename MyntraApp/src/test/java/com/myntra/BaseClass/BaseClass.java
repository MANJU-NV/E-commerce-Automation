package com.myntra.BaseClass;

import java.net.URL;
import org.testng.annotations.AfterSuite;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class BaseClass {

	 protected  AndroidDriver driver;
	DesiredCapabilities dc;

	@BeforeClass
	public void RunApplication() {
//        try {
//		dc = new DesiredCapabilities();
//		dc.setCapability("platformVersion", System.getProperty("PlatformVersion"));
//		dc.setCapability("deviceName", System.getProperty("deviceName"));
//		dc.setCapability("platformName", System.getProperty("platformName"));
//		dc.setCapability("automationName", System.getProperty("androidAutomationName"));
//		dc.setCapability("androidAppActivity", System.getProperty("androidAppActivity"));
//		dc.setCapability("androidAppPackage", System.getProperty("androidAppPackage"));
//

//		URL url=new URL("http://127.0.0.1:4723/");
//		
//		driver=new AndroidDriver(url,dc);
//        }
//        catch(Exception e) {
//        	System.out.println("The message is:"+e.getMessage());
//        	e.printStackTrace();
//        }
		
		if (driver == null) {
			try {
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setCapability("platformVersion", "12");
				dc.setCapability("deviceName", "emulator-5554");
				dc.setCapability("automationName", "uiautomator2");
				dc.setCapability("appium:appPackage", "com.myntra.android");
				dc.setCapability("appium:appActivity", "com.myntra.android.activities.react.ReactActivity");
				dc.setCapability("autoDismissAlerts", true);

				URL url = new URL("http://127.0.0.1:4723/");
				driver = new AndroidDriver(url, dc);

			} catch (Exception e) {
				System.out.println("Message is" + e.getMessage());
				e.printStackTrace();
			}
		}


	}


	
	@Test
	public void Sample() {
		System.out.print("I am inside test");
	}

	@AfterSuite
	public void quitAndroidDriver() {
		driver.quit();
	}

}
