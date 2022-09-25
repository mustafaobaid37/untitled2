package Tests;
import Pages.GoogleSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static Tests.SearchTestBase.driver;

public class SearchTest  {


    @Test
    public void testSearchBox()throws InterruptedException{
        GoogleSearch googleSearch = new GoogleSearch();
        googleSearch.searchBoxField.sendKeys("T-shirt");
        googleSearch.searchBtn.click();
    }
}
