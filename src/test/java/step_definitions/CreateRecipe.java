package step_definitions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.CreatRecipePage;
import pageObjects.CustomizeRecipePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateRecipe  {

	 CreatRecipePage createRecipePage = new CreatRecipePage();
	 CustomizeRecipePage customizeRecipePage = new CustomizeRecipePage();
	
	 @Given("^I open the app and land on home screen$")
	    public void open_app() throws Throwable {
	       assertThat(createRecipePage.getPageTitle()).isEqualTo("Drinks");
	    }
	 
	 @When("^I touch on create new recipe button$")
	 public void goTonCreateNewRecipe() throws Throwable{
		 createRecipePage.tapOnCreateRecipeTile();
	 }
	 
	 @Then("^create recipe tab should be open by default$")
	 public void create_recipe_tab_should_be_open_by_default() throws Throwable {
		 assertThat(createRecipePage.isCreateRecipeTabOpen()).isTrue();
	 }
	   
	
	 @Then("^I should see the ten default recipes$")
	 public void i_should_be_taken_to_customize_recipe_page(List<String> recipes) throws Throwable {
		 ArrayList<String> expectedRecipeList = new ArrayList<String>();
		 expectedRecipeList.addAll(recipes);
		 assertThat(customizeRecipePage.getPageTitle()).isEqualToIgnoringCase("Recipes");
		 ArrayList<String> actualRecipeList=new ArrayList<String>();
		  actualRecipeList= customizeRecipePage.getRecipeNames();
		 assertThat(actualRecipeList).containsAll(expectedRecipeList);
		 }
    };
