package step_definitions;

import java.io.File;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static AndroidDriver<AndroidElement> driver;

	@Before
	public void setUp() throws Exception {
		
		System.out.println("insidde before hooks");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("appium-version", "1.1.0");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Android");
//        capabilities.setCapability("platformVersion", "4.4");
//        capabilities.setCapability("appPackage", "/Qbo_tests/src/apps/qbo-ci-release.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/thivyalakshmieaswarasekaran/Desktop/Qbo_tests/src/apps/qbo-ci-release.apk");

        
        
        try {
        	driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        	
        	System.out.println(driver);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
        
	};
	
	
	
	@After
	 public void embedScreenshot() {
		System.out.println("insidde after hooks");
//         if (scenario.isFailed()) {  
////             try {  
////                 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);  
////                 scenario.embed(screenshot, "image/png");  
////             } catch (WebDriverException wde) {  
////                 System.err.println(wde.getMessage());  
////             } catch (ClassCastException cce) {  
////                 cce.printStackTrace();  
////             }  
         
        	 //make screenshot and get is as base64
             WebDriver augmentedDriver = new Augmenter().augment(driver);
             String screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BASE64);

             assert (screenshot) != null;
             
             //make screenshot and save it to the local filesystem
             File file = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
             assert (file) != null;
             
         
         
         //}  
     }  
	@After
	public void tearDown() throws Exception{
		
	        if (driver != null) driver.quit();
	    
	}
};
