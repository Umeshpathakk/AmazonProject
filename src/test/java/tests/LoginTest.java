package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.*;

public class LoginTest
{
    WebDriver driver;
    LoginPage loginpage;
    WebDriverWait wait;

    //locator search box only
    //send enter
    //verify page of dubai is opened


    @BeforeTest
    public void setup()
    {

        driver=new ChromeDriver();
        loginpage=new LoginPage(driver);
        driver.get("https://www.google.com/");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void weatherTest()
    {
        driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("astronomer");
        driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys(Keys.RETURN);










        /*
   driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("selenium");

   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),\"selenium\")]")));

    List<WebElement> wl=   driver.findElements(By.xpath("//span[contains(text(),\"selenium\")]"));

    for(WebElement wl1:wl)
    {
        System.out.println(wl1.getText());
    }

    driver.findElement(By.xpath("//*[text()=\" webdriver\"]")).click();

//  (//ul[@jsname="bw4e9b"])[1]
// //*[text()=" webdriver"]

// list of search item  //span[contains(text(),"selenium")]



        /*
        driver.manage().window().maximize();
        loginpage.maximize();

      driver.findElement(By.xpath("(//input[@placeholder=\"Weather in your city\"])[1]")).sendKeys("Dubai, AE");
loginpage.sendCity("\"Dubai, AE\"");

      driver.findElement(By.xpath("(//input[@placeholder=\"Weather in your city\"])[1]")).sendKeys(Keys.RETURN);
      loginpage.sendReturn();


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr/td[2]/b/a")));

        wait.until(Excep)



     String city= driver.findElement(By.xpath("//table/tbody/tr/td[2]/b/a")).getText();


        Assert.assertTrue(city.equals("Dubai, AE"));

*/

    }

}
