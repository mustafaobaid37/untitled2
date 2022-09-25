package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {



    public void googleSearch(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//input[@name=\"q\"]")
    public WebElement searchBoxField;

    @FindBy(xpath = "//div[@jsname=\"VlcLAe\"]//input[@name=\"btnK\"]")
    public WebElement searchBtn;

}
