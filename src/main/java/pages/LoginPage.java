package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    WebDriver driver;

    By searchBar =By.xpath("(//input[@placeholder=\"Weather in your city\"])[1]");
    By cityName= By.xpath("//table/tbody/tr/td[2]/b/a");


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void sendCity(String city)
    {
        driver.findElement(searchBar).sendKeys(city);
    }
    public void sendReturn(String city)
    {
        driver.findElement(searchBar).sendKeys(Keys.RETURN);
    }
    public String getText(String city)
    {
       return driver.findElement(cityName).getText();
    }
    public void maximize(String city)
    {
        driver.manage().window().maximize();
    }





}
