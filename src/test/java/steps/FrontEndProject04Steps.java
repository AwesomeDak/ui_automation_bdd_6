package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import pages.FrontEndProject04Page;
import utils.Driver;

import java.util.List;

public class FrontEndProject04Steps {
    WebDriver driver;
    FrontEndProject04Page frontEndPage;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        frontEndPage = new FrontEndProject04Page();
    }
    @Given("user navigates to {string}")
    public void userNavigatesTO(String url){
        driver.get(url);
    }

    @Then("the user should see the {string} heading")
    public void the_user_should_see_the_heading(String str) {
        Assert.assertTrue(frontEndPage.header.isDisplayed());
        Assert.assertEquals(frontEndPage.header.getText(), str);
    }

    @And("the user should see the table with the headers below")
    public void the_user_should_see_the_table_with_the_headers_below(DataTable dataTable) {
        List<String> expectedResult = dataTable.asList();

        for (int i = 0; i < expectedResult.size(); i++) {
            Assert.assertTrue(frontEndPage.tableHeaders.get(i).isDisplayed());
            Assert.assertEquals(frontEndPage.tableHeaders.get(i).getText(), expectedResult.get(i));
        }

    }

    @Then("the user should see the table with the rows below")
    public void the_user_should_see_the_table_with_the_rows_below(DataTable dataTable) {
        List<String> expectedResult = dataTable.asList();

        for (int i = 0; i < expectedResult.size(); i++) {
            Assert.assertTrue(frontEndPage.tableRows.get(i).isDisplayed());
            Assert.assertEquals(frontEndPage.tableRows.get(i).getText(), expectedResult.get(i));
        }

    }
    @Then("the user should see the {string} button is enabled")
    public void the_user_should_see_the_button_is_enabled(String btn) {

        switch (btn){
            case "ADD PRODUCT":
                Assert.assertTrue(frontEndPage.addProductBtn.isEnabled());
                break;
            case "X":
                Assert.assertTrue(frontEndPage.x.isEnabled());

                break;
            case"SUBMIT":
                Assert.assertTrue(frontEndPage.submitBTN.isEnabled());

                break;
            default:
                throw new NotFoundException("Not Found given element");
        }

    }

    @Then("the user should see the {string} text displayed")
    public void the_user_should_see_the_text_displayed(String string) {
        Assert.assertTrue(frontEndPage.total.isDisplayed());
    }

    @And("the user clicks on the {string} button")
    public void the_user_clicks_on_the_add_product_button(String btn) {
        switch (btn){
            case "ADD PRODUCT":
                frontEndPage.addProductBtn.click();
                break;
            case "X":
                frontEndPage.x.click();

                break;
            case"SUBMIT":
                frontEndPage.submitBTN.click();

                break;
            default:
                throw new NotFoundException("Not Found given element");
        }

    }

    @Then("the user should see the {string} modal with its heading")
    public void the_user_should_see_the_modal_with_its_heading(String str) {
        Assert.assertTrue(frontEndPage.AddNewProductTitle.isDisplayed());
        Assert.assertEquals(frontEndPage.AddNewProductTitle.getText(), str);


    }

    @Then("the user should see the {string} label")
    public void the_user_should_see_the_label(String str) {
        switch (str){
            case "Please select the quantity":
                Assert.assertTrue(frontEndPage.product_quantity.isDisplayed());
                Assert.assertEquals(frontEndPage.product_quantity.getText(),str);
                break;
            case "Please enter the name of the product":
                Assert.assertTrue(frontEndPage.product_name.isDisplayed());
                Assert.assertEquals(frontEndPage.product_name.getText(),str);
                break;
            case "Please enter the price of the product":
                Assert.assertTrue(frontEndPage.product_price.isDisplayed());
                Assert.assertEquals(frontEndPage.product_price.getText(),str);
                break;
            default:
                throw new NotFoundException("NO!");

        }
    }

    @Then("the user should see the {string} input box is enabled")
    public void the_user_should_see_the_input_box_is_enabled(String str) {
        switch (str) {
            case "Quantity":
                Assert.assertTrue(frontEndPage.quantity.isEnabled());
                break;
            case "Product":
                Assert.assertTrue(frontEndPage.product.isEnabled());
                break;
            case "Price":
                Assert.assertTrue(frontEndPage.price.isEnabled());
                break;
            default:
                throw new NotFoundException("NO!");

        }
    }

    @Then("the user should not see the {string} modal")
    public void theUserShouldNotSeeTheModal(String str) {
        try {
            Assert.assertFalse(frontEndPage.modal.isDisplayed());
        } catch (NoSuchElementException e){
            Assert.assertTrue(true);
        }

    }

    @When("the user enters the quantity as {2}")
    public void the_user_enters_the_quantity_as(String str) {
        frontEndPage.quantity.sendKeys(str);
    }

    @When("the user enters the product as {Mouse}")
    public void the_user_enters_the_product_as(String str) {
        frontEndPage.product.sendKeys(str);
    }

    @When("the user enters the price as {100}")
    public void the_user_enters_the_price_as(String str) {
        frontEndPage.price.sendKeys(str);

    }

    @Then("the user should see the table with the new row below")
    public void the_user_should_see_the_table_with_the_new_row_below(DataTable dataTable) {
        List<String> expectedText = dataTable.asList();

        for(int i = 0; i < expectedText.size(); i++){
            Assert.assertTrue(frontEndPage.newRow.get(i).isDisplayed());
            Assert.assertEquals(frontEndPage.newRow.get(i).getText(),expectedText.get(i));
        }
    }

    @Then("the user should see the {string} heading")
    public void theUserShouldSeeTheHeading(String arg0) {
        
    }

    @And("the user should see the {string} button is enabled")
    public void theUserShouldSeeTheButtonIsEnabled(String arg0) {
    }

    @And("the user should see the {string} input box is enabled")
    public void theUserShouldSeeTheInputBoxIsEnabled(String arg0) {
    }

    @Then("the user should see the {string} modal with its heading")
    public void theUserShouldSeeTheModalWithItsHeading(String arg0) {
    }

    @And("the user enters the quantity as {string}")
    public void theUserEntersTheQuantityAs(String arg0) {
    }

    @And("the user enters the product as {string}")
    public void theUserEntersTheProductAs(String arg0) {
    }

    @And("the user enters the price as {string}")
    public void theUserEntersThePriceAs(String arg0) {
    }
}