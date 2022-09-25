package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
static WebDriver driver;

    public TestBase(WebDriver driver) {

    }

    @BeforeTest
    public void setup(){

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.navigate().to("https://www.tumblr.com/login");

}

@AfterTest
    public void tearDown(){
    driver.quit();
}
}
