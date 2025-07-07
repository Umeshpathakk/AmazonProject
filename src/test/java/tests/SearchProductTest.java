package tests;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SearchResultsPage;

import static org.testng.Assert.*;

public class SearchProductTest {

    WebDriver driver;
    HomePage home;
    SearchResultsPage results;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        home = new HomePage(driver);
        results = new SearchResultsPage(driver);
    }

    @Test
    public void searchProductByName()
    {
        home.searchFor("wireless mouse");
        assertTrue(results.getFirstResultTitle().toLowerCase().contains("mouse"));
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
