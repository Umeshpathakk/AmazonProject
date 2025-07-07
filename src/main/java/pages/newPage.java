package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newPage
{
    WebDriver driver;

    By uname=By.xpath("");
    By pass=By.xpath("");
    By login=By.xpath("");


  public  newPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void loginClick()
    {
        driver.findElement(login).click();
    }
    public void sendId()
    {
        driver.findElement(uname).click();
    }
}
