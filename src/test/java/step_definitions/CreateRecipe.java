package step_definitions;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

import pageObjects.CreatRecipePage;
import pageObjects.CustomizeRecipePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateRecipe  {

	 CreatRecipePage createRecipePage = new CreatRecipePage();
	 CustomizeRecipePage customizeRecipePage = new CustomizeRecipePage();
	
	 @Given("^I login to app and land on home page$")
	    public void open_app() throws Throwable {
		 System.out.println("inside given");
	       assertThat(createRecipePage.getPageTitle()).isEqualTo("Drinks");
	    }
	 
	 @When("^I tap on create new recipe tile$")
	 public void goTonCreateNewRecipe() throws Throwable{
		 
		System.out.println("inside when");
		createRecipePage.tapOnCreateRecipeTile();
	 }
	
	 @Then("^I should be taken to customize recipe page$")
	 public void i_should_be_taken_to_customize_recipe_page() throws Throwable {
		 System.out.println("inside thne");
		 assertThat(customizeRecipePage.getPageTitle()).isEqualToIgnoringCase("Recipes");
	 }
    
};
