package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import setup.Setup;

public class FavouriteView {
    Setup setup = new Setup();
    private WebDriver driver = setup.returnDriver();

    @Given("User is in the DvSum Column Dictionary page")
    public void givenFavouriteView(){
        System.out.println("In given function");
        this.driver.get("https://devqa.dvsum.com/dictionary/column");
        System.out.println("End of given function");
    }

    @When("User favourites a view")
    public void whenFavouriteView(){
        System.out.println("In when function");
    }

    @Then("View should be added to favourite view")
    public void thenFavouriteView(){
        System.out.println("In then function");
    }
}
