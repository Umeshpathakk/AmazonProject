package tests;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.TestDataReader;
import org.json.JSONArray;
import org.json.JSONObject;

import static org.testng.Assert.*;

public class DataDrivenSearchTest
{

    WebDriver driver;
    HomePage home;
    SearchResultsPage results;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        home = new HomePage(driver);
        results = new SearchResultsPage(driver);
    }

    @Test
    public void searchMultipleProducts()
    {
        JSONArray data = TestDataReader.getTestData("src/test/resources/testdata/searchProducts.json");
        for (int i = 0; i < data.length(); i++) {
            JSONObject obj = data.getJSONObject(i);
            String keyword = obj.getString("keyword");
            home.searchFor(keyword);
            assertTrue(results.getFirstResultTitle().toLowerCase().contains(keyword.split(" ")[0].toLowerCase()));
            driver.navigate().back();
        }
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
