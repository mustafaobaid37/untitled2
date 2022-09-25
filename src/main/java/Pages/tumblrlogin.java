package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tumblrlogin {

    public tumblrlogin(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement emailField;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement passField;

    @FindBy(xpath = "//span[contains(text(),'Log ')]")
    public WebElement loginBtn;
    @FindBy(xpath = "//div[contains(text(),'Your email or password were incorrect.')]")
    public WebElement errorMessage;

}
