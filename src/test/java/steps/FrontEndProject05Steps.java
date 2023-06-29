package steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.FrontEndProject05Page;
import utils.Driver;
import utils.TableHandler;

import java.util.List;
public class FrontEndProject05Steps {
    WebDriver driver;
    FrontEndProject05Page FrontEndProject05Page;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
       FrontEndProject05Page = new FrontEndProject05Page();

    }
    @Then("user should see the first {string} heading")
    public void user_should_see_the_first_heading(String header1) {
        Assert.assertEquals(header1,  FrontEndProject05Page.mainHeading.getText());
    }
    @Then("user should see second the {string} heading")
    public void user_should_see_second_the_heading(String header2) {
        Assert.assertEquals(header2, FrontEndProject05Page.subHeading.getText());
    }
    @Then("user should see the {string} paragraph")
    public void user_should_see_the_paragraph(String paragraph) {
        Assert.assertEquals(paragraph, FrontEndProject05Page.paragraph.getText());
    }

    @Then("user should see the {string} button is disabled")
    public void user_should_see_the_button_is_disabled(String prev) {
        Assert.assertTrue(prev, FrontEndProject05Page.previousButton.isDisplayed());
    }
    @Then("user should see the {string} button is enabled")
    public void user_should_see_the_button_is_enabled(String next) {
        Assert.assertTrue(next, FrontEndProject05Page.nextButton.isEnabled());
        FrontEndProject05Page.nextButton.click();
    }

    @When("user clicks on the {string} button")
    public void user_clicks_on_the_button(String next) {


    }

    @When("user clicks on the {string} button till it becomes disabled")
    public void user_clicks_on_the_button_till_it_becomes_disabled(String prev) {
        Assert.assertTrue(prev, FrontEndProject05Page.nextButton.isEnabled());
        FrontEndProject05Page.previousButton.click();

    }
    @Then("user should see {string} City with the info below and an image")
    public void user_should_see_city_with_the_info_below_and_an_image(String string, DataTable dataTable) {
        List<List<String>> countriesDetails = dataTable.asLists();

    }
}
