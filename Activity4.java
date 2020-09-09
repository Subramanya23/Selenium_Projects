package Selenuim_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void header2TestCase() throws InterruptedException {
    	WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]"));
    	 System.out.println("Page Header is: " + header.getText());
    	 Thread.sleep(5000);
    	Assert.assertEquals("Quia quis non", header.getText());
    	System.out.println("Header matching");
    	Thread.sleep(5000);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
 }
