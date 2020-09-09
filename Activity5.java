package Selenuim_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void jobTestCase() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//li[@id='menu-item-24']//a[contains(text(),'Jobs')]")).click();
    	Thread.sleep(5000);
    	String pageTitle = driver.getTitle();
    	System.out.println("Page title is: " + pageTitle);
    	Assert.assertEquals("Jobs – Alchemy Jobs", pageTitle);
    	
    }
    	@AfterMethod
        public void afterMethod() {
            //Close the browser
            driver.quit();
        }

    }