package tests;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.FilterSortPage;

public class FilterSortTest
{

    WebDriver driver;
    HomePage home;
    FilterSortPage filterSort;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        home = new HomePage(driver);
        filterSort = new FilterSortPage(driver);
    }

    @Test
    public void filterAndSortTest()
    {
        home.searchFor("headphones");
        filterSort.applyCategoryFilter();
        filterSort.sortByPriceLowToHigh();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
