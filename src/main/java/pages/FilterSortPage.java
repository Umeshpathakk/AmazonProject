package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterSortPage
{
    WebDriver driver;

    By categoryFilter = By.xpath("//span[text()='Electronics']");
    By sortDropdown = By.id("s-result-sort-select");
    By sortPriceLowToHigh = By.xpath("//option[@value='price-asc-rank']");

    public FilterSortPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void applyCategoryFilter()
    {
        driver.findElement(categoryFilter).click();
    }

    public void sortByPriceLowToHigh()
    {
        WebElement sort = driver.findElement(sortDropdown);
        sort.click();
        sort.findElement(sortPriceLowToHigh).click();
    }
}
