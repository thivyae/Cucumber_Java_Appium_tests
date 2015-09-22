package pageObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import step_definitions.Hooks;

public class CustomizeRecipePage extends Exception{
	public WebDriver driver; 
	ArrayList<String> list = null;
	public CustomizeRecipePage() 
	{ 
	driver = Hooks.driver; 
	}

	public String getPageTitle(){
	return driver.findElement(By.id("recipes")).getText();
	}
	
	public WebElement waitForPageToLoad(){
	 
	 return driver.findElement(By.id("recipes"));
		}
	
	public ArrayList<String> getRecipeNames(){
		ArrayList<String> recipeList = null;
		String expectedLastDesc = "Iced Latte Macchiato Caramello";
		String foundLastDesc = null;
		while (foundLastDesc!=expectedLastDesc) {
			List<WebElement> recipes= driver.findElements(By.id("de.luna.qbo.ci:id/recipe_name"));
			
			
			 recipeList = getRecipeList(recipes);
			int recipeListSize = recipeList.size();
			foundLastDesc = recipeList.get(recipeListSize-1);
			System.out.println(recipeList);
			
//			List<WebElement> recipeDesc= driver.findElements(By.id("de.luna.qbo.ci:id/recipe_description"));
//			ArrayList<String> recipeNames = convertToList(recipes);
////			convertToList(recipeDesc);
//			return recipeNames;
		}
		
		return recipeList;
	}
	
	public ArrayList<String> getRecipeList(List<WebElement> element){
		
		for (WebElement webElement : element) {
			System.out.println("Recipes"+element);
			System.out.println("Element::"+webElement.getText());
			String text=webElement.getText();
			System.out.println(text);
			list.add(text);
			System.out.println("after lost");
			System.out.println("list"+list);
		}
		return list;
	}

}
