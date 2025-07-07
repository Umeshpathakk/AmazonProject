package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.devtools.v85.debugger.Debugger.pause;

public class tamLog
{

   @Test
   public void login() throws Exception
    {

        WebDriver driver = new ChromeDriver();

        driver.get("https://app-sandbox.tamara.co/login");

      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.manage().window().maximize();

       // WebElement dd= driver.findElement(By.xpath("//div[@class='flex flex-col absolute bg-white ta-custom-select__items open']"));
     //   Select select = new Select(dd);
    //    select.selectByIndex(2);
        //*[text()="+966"]
        WebElement def=driver.findElement(By.xpath("//*[text()=\"+966\"]"));
        WebElement kuw=driver.findElement(By.xpath("//*[text()=\"+971\"]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", def);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", kuw);




        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("51 111 1117");

     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));



        WebElement e = driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]"));
        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(100));
        w.until(ExpectedConditions.elementToBeClickable(e));


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);
     //   e.click();
       // Thread.sleep(20000);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));


      //  System.out.println("thread sleep");
       // Thread.sleep(10000);
     //   driver.navigate().refresh();
       // e = driver.findElement(By.xpath("//span[contains(text(),\" Resend verification code \")]"));

     //   w=new WebDriverWait(driver,Duration.ofSeconds(100));
        w.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=' Resend verification code ']")));
     //   w.until(ExpectedConditions.);
        e = driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",e );
       // e.click();
        System.out.println("thread sleep2");
   //     w.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();",e );
      //e.click();

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",e);



      //  driver.findElement(By.xpath("//button[normalize-space()='Continue'")).click();

        WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(10));
       // w1.until(ExpectedConditions.urlContains())






    }
}
