package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.newPage;

import java.time.Duration;

public class newPageTest
{
    WebDriver driver;
    newPage np;

    @BeforeTest
    public void setup()
    {
        driver=new ChromeDriver();
        np=new newPage(driver);
    }

    @Test
    public void login()
    {
        driver.get("https://app-sandbox.tamara.co/login");
        driver.manage().window().maximize();
        WebElement def=driver.findElement(By.xpath("//*[text()=\"+966\"]"));
        WebElement kuw=driver.findElement(By.xpath("//*[text()=\"+971\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", def);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", kuw);
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("51 111 1114");
        WebElement e = driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("onboarding"));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=' Resend verification code ']")));
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
        e = driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);
      System.out.println("aaaaa");

    }

    @AfterTest
    public void teardown()
    {
      //  driver.quit();
    }

}
