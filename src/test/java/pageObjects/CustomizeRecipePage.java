package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;

import step_definitions.Hooks;

public class CustomizeRecipePage extends Exception{
	public WebDriver driver; 
	public CustomizeRecipePage() 
	{ 
	driver = Hooks.driver; 
	}

	public String getPageTitle(){
	return driver.findElement(By.id("start_with")).getText();
	}

}
