package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    WebDriver driver;

    By resultTitle = By.cssSelector("span.a-size-medium");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstResultTitle() {
        return driver.findElement(resultTitle).getText();
    }
}
