package Tests;

import Pages.tumblrlogin;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    public LoginTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void testInvalidLogin() throws InterruptedException {
        tumblrlogin loginPage = new tumblrlogin(driver);

        loginPage.emailField.sendKeys("invalidj2345654");
        loginPage.passField.sendKeys("afsklj345");
        loginPage.loginBtn.click();
        Thread.sleep(500);
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }
}
