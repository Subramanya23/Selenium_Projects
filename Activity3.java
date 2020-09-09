package Selenuim_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs");
    }
    
    @Test
    public void UrlTestCase() {
    	WebElement img = driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
    	String src = img.getAttribute("src");
    	System.out.println("Image URL = "+ src);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
 }


