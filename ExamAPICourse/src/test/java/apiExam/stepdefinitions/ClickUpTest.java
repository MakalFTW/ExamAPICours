package apiExam.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickUpTest {

    @Given("Test board exists and the name is {string}")
    public void checkBoardExistence(String title){

    }

    @When("I create a folder and name it {string}")
    public void createFolder(String title){

    }

    @And("I create a list named {string} in the folder")
    public void createList(String title){

    }

    @Then("I check that the list was created and named {string}")
    public void checkListName(String name){

    }

}
