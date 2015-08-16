package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;

import step_definitions.Hooks;

public class CreatRecipePage extends Exception{
	public WebDriver driver; 
	public CreatRecipePage() 
	{ 
	driver = Hooks.driver; 
	}

	
	public void tapOnCreateRecipeTile() {
		driver.findElement(By.id("create_new_recipe")).click();
		};

	public String getPageTitle(){
	return driver.findElement(By.id("title_activity_home")).getText();
	}

}
