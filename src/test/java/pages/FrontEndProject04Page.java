package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class FrontEndProject04Page {

    public FrontEndProject04Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".is-size-2")
    public WebElement header;

    @FindBy(css =".header")
    public List<WebElement> tableHeaders;

    @FindBy(css = "tbody tr td")
    public List<WebElement> tableRows;

    @FindBy(id = "add_product_btn")
    public WebElement addProductBtn;

    @FindBy(id = "total_amount")
    public WebElement total;

    @FindBy(id ="modal_title")
    public  WebElement AddNewProductTitle;

    @FindBy(id ="submit")
    public  WebElement submitBTN;

    @FindBy(css =".delete")
    public  WebElement x;

    @FindBy(css = "label[for='product_quantity']")
    public WebElement product_quantity;

    @FindBy(css = "label[for='product_name']")
    public WebElement product_name;

    @FindBy(css = "label[for='product_price']")
    public WebElement product_price;


    @FindBy(id = "quantity")
    public WebElement quantity;

    @FindBy(id = "product")
    public WebElement product;

    @FindBy(id = "price")
    public WebElement price;


    @FindBy(css = "modal-card-body")
    public WebElement modal;


    @FindBy(css = "tr:nth-child(4) td")
    public List<WebElement> newRow;
}